package ua.kh.em.jastore.ui.viewmodel;

import androidx.lifecycle.ViewModel;

import java.util.List;

import io.reactivex.Flowable;
import ua.kh.em.jastore.ui.model.Film;
import ua.kh.em.jastore.ui.repository.AppRepository;

public class ViewModelFilm extends ViewModel {

    AppRepository repository = new AppRepository();

    public Flowable<List<Film>> loadFilm(String param) {
        return repository.loadFilm(param);
    }
}
