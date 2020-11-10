package ua.kh.em.jastore.ui.adapter;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import ua.kh.em.jastore.R;
import ua.kh.em.jastore.ui.model.Film;

public class FilmAdapter extends RecyclerView.Adapter<FilmAdapter.UserViewHolder> {

    private List<Film> list;

    public FilmAdapter(ArrayList<Film> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public UserViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new UserViewHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull UserViewHolder holder, int position) {

        Film item = list.get(position);

        holder.resultFilm.setText(item.getShow().getName());
        holder.descriptionFilm.setText(item.getShow().getStatus());

//new DownloadImageTask(holder.imageView).execute(item.getShow().getImage().getOriginal());
//        Bitmap bitmap = DownloadImage();
//        Objects.requireNonNull(holder).imageView.setImageBitmap(bitmap);

    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    static class UserViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView resultFilm;
        TextView descriptionFilm;

        UserViewHolder(@NonNull View itemView) {
            super(itemView);
            resultFilm = itemView.findViewById(R.id.film_name);
            imageView = itemView.findViewById(R.id.film_image);
            descriptionFilm = itemView.findViewById(R.id.film_description);
        }
    }

    public void addFilm(List<Film> listFilm) {
        this.list = listFilm;
        notifyDataSetChanged();
    }
//
//    private Bitmap DownloadImage(String URL) {
//        Bitmap bitmap = null;
//        InputStream in = null;
//        try {
//            in = OpenHttpConnection(URL);
//            bitmap = BitmapFactory.decodeStream(in);
//            in.close();
//        } catch (IOException e1) {
//            // TODO Auto-generated catch block
//            e1.printStackTrace();
//        }
//        return bitmap;
//    }
//
//    private InputStream OpenHttpConnection(String urlString) throws IOException {
//        InputStream in = null;
//        int response = -1;
//
//        URL url = new URL(urlString);
//        URLConnection conn = url.openConnection();
//
//        if (!(conn instanceof HttpURLConnection))
//            throw new IOException("Not an HTTP connection");
//
//        try {
//            HttpURLConnection httpConn = (HttpURLConnection) conn;
//            httpConn.setAllowUserInteraction(false);
//            httpConn.setInstanceFollowRedirects(true);
//            httpConn.setRequestMethod("GET");
//            httpConn.connect();
//            response = httpConn.getResponseCode();
//            if (response == HttpURLConnection.HTTP_OK) {
//                in = httpConn.getInputStream();
//            }
//        } catch (Exception ex) {
//            throw new IOException("Error connecting");
//        }
//        return in;
//    }
}

// class DownloadImageTask extends AsyncTask<String, Void, Bitmap> {
//    ImageView bmImage;
//    public DownloadImageTask(ImageView bmImage) {
//        this.bmImage = bmImage;
//    }
//
//    protected Bitmap doInBackground(String... urls) {
//        String urldisplay = urls[0];
//        Bitmap bmp = null;
//        try {
//            InputStream in = new java.net.URL(urldisplay).openStream();
//            bmp = BitmapFactory.decodeStream(in);
//        } catch (Exception e) {
//            Log.e("Error", e.getMessage());
//            e.printStackTrace();
//        }
//        return bmp;
//    }
//    protected void onPostExecute(Bitmap result) {
//        bmImage.setImageBitmap(result);
//    }
//}


