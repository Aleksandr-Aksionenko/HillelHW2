package entity;

import java.util.Date;
import java.util.List;

public class Film {
    private String name;
    private Director director;
    private Date release;
    private String country;
    private List<Actor> actors;

    public Film(String name, Director director, Date release, String country, Actor actors) {
        this.name = name;
        this.director = director;
        this.release = release;
        this.country = country;
        this.actors = (List<Actor>) actors;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Director getDirector() {
        return director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public Date getRelease() {
        return release;
    }

    public void setRelease(Date release) {
        this.release = release;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<Actor> getActors() {
        return actors;
    }

    public void setActors(List<Actor> actors) {
        this.actors = actors;
    }

    @Override
    public String toString() {
        return "entity.Film{" +
                "name='" + name + '\'' +
                ", director=" + director +
                ", release=" + release +
                ", country='" + country + '\'' +
                ", actors=" + actors +
                '}';
    }
}
