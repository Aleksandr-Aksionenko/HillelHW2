package ua.kh.em.jastore.ui.api;

import java.util.List;

import io.reactivex.Flowable;
import retrofit2.http.GET;
import retrofit2.http.Query;
import ua.kh.em.jastore.ui.model.Film;

public interface ApiService {
    @GET("search/shows")
    Flowable<List<Film>> loadFilm(@Query("q") String query);
}


