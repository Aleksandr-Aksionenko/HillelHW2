package dbRequests;

import entity.Actor;
import entity.Director;
import entity.Film;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import static connect.ConnectorDB.getConnection;

public class HomeLibrary {

    public List<Actor> findActorByFilm(String film) {
        List<Actor> actorArrayList = new ArrayList<>();
        try {
            PreparedStatement stmt = getConnection().prepareStatement("SELECT film * FROM actors JOIN actors ON actors.id = film.actors.id \n"+
                            "JOIN film ON actors.id = film.id WHERE film.film_name = ?;");
            stmt.setString(1, film);
            ResultSet resultSet = stmt.executeQuery();
            actorArrayList = AddActorList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorArrayList;
    }

    public List<Film> findFilmsByCurrentAndPreviousYear() {
        List<Film> filmList = new ArrayList<>();
        try {
            PreparedStatement stmt = getConnection().prepareStatement("SELECT * FROM film WHERE date(film.release) BETWEEN '2019-01-01' AND '2020-12-31';");
            ResultSet resultSet = stmt.executeQuery();

            filmList.add(new Film(resultSet.getString("film_name"),
                    new Director(resultSet.getString("name"), resultSet.getDate("birthday")),
                    resultSet.getDate("release"), resultSet.getString("country"),
                    new Actor(resultSet.getString("name"), resultSet.getDate("birthday"))));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return filmList;
    }

    public void deleteFilmsByYears(int years) throws SQLException {
        PreparedStatement prepareSt = getConnection().prepareStatement("DELETE FROM films WHERE film.release > ?;");
        prepareSt.setInt(1, years);
        prepareSt.executeUpdate();
    }

    public List<Actor> findActorsAsDirector() {
        List<Actor> actorList = new ArrayList<>();
        try {
            PreparedStatement statement = getConnection().prepareStatement("SELECT * FROM actors JOIN director ON actors.name = director.name AND  AND actors.birthday = director.birthday;");
            ResultSet resultSet = statement.executeQuery();
            actorList = AddActorList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorList;
    }

    public List<Actor> findActorsByNFilms(int filmsQuantity) {
        List<Actor> actorArrayList = new ArrayList<>();
        try {
            PreparedStatement statement = getConnection().prepareStatement("");
            statement.setInt(1, filmsQuantity);
            ResultSet resultSet = statement.executeQuery();
            actorArrayList = AddActorList(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return actorArrayList;
    }

    private List<Actor> AddActorList(ResultSet result) throws SQLException {
        List<Actor> actorArrayList = new ArrayList<>();
        while (result.next()) {
            actorArrayList.add(new Actor(result.getString(1), result.getDate(2)));
        }
        return actorArrayList;
    }
}







