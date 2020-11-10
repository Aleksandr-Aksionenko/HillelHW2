package ua.kh.em.jastore.ui.view;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

import ua.kh.em.jastore.ui.adapter.FilmAdapter;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.schedulers.Schedulers;
import ua.kh.em.jastore.R;
import ua.kh.em.jastore.ui.model.Film;
import ua.kh.em.jastore.ui.checkNet.CheckNet;
import ua.kh.em.jastore.ui.viewmodel.ViewModelFilm;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    ArrayList<Film> list;
    CompositeDisposable disposable;
    EditText searchEditText;
    ProgressBar progressBar;
    ViewModelFilm viewModel;
    FilmAdapter adapter;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        disposable = new CompositeDisposable();
        initViews(view);
        setupRecyclerView();
        if (CheckNet.isNetExists(getContext())) {
            progressBar.setVisibility(View.GONE);
        }

        viewModel = new ViewModelProvider(this).get(ViewModelFilm.class);

        return view;
    }

    private void initViewModel(String text) {
        disposable.add(viewModel.loadFilm(text)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(this::handleResponse, this::handleError));
    }

    private void initViews(View view) {
        progressBar = view.findViewById(R.id.progressbar);
        recyclerView = view.findViewById(R.id.list_home);
        searchEditText = view.findViewById(R.id.search_movie_by_home);
        searchEditText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (count <= 1) {
                    initViewModel(" ");
                    progressBar.setVisibility(View.VISIBLE);
                } else {
                    String text = searchEditText.getText().toString();
                    initViewModel(text);
                }
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });


    }


    private void setupRecyclerView() {
        if (adapter == null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(requireActivity()));
            LinearLayoutManager linearLayoutManager =
                    new LinearLayoutManager(requireActivity());
            RecyclerView.ItemDecoration itemDecoration =
                    new DividerItemDecoration(recyclerView.getContext(),
                            linearLayoutManager.getOrientation());
            recyclerView.addItemDecoration(itemDecoration);
            recyclerView.setHasFixedSize(true);
            list = new ArrayList<>();
            adapter = new FilmAdapter(list);
            recyclerView.setAdapter(adapter);
        } else {
            adapter.notifyDataSetChanged();
        }
    }

    private void handleResponse(List<Film> film) {
        if (film != null) {
            progressBar.setVisibility(View.GONE);
            adapter.addFilm(film);
        } else if (list.isEmpty()) {
            progressBar.setVisibility(View.GONE);
            Toast.makeText(getContext(), R.string.something_wrong, Toast.LENGTH_LONG).show();
        }
    }

    private void handleError(Throwable throwable) {
        Toast.makeText(requireActivity(), R.string.something_wrong,
                Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (disposable != null && !disposable.isDisposed()) {
            disposable.clear();
        }
    }

}