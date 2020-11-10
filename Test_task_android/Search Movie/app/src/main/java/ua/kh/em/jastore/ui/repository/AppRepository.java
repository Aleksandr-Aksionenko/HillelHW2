package ua.kh.em.jastore.ui.repository;


import java.util.List;

import io.reactivex.Flowable;
import ua.kh.em.jastore.ui.model.Film;
import ua.kh.em.jastore.ui.api.ApiMovie;
import ua.kh.em.jastore.ui.api.ApiService;

public class AppRepository {

    ApiService api;

    public Flowable<List<Film>> loadFilm(String param) {
        api = ApiMovie.getApiService();
        return api.loadFilm(param);
    }
}
