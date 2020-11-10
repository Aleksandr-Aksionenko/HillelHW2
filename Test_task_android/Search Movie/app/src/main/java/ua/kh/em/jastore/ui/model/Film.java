package ua.kh.em.jastore.ui.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Film {

    @SerializedName("score")
    @Expose
    private String name;
    @SerializedName("show")
    @Expose
    private Show show;


    public Film() {
    }

    public Film(String name, Show show) {
        this.name = name;
        this.show = show;
    }


    public void setName(String name) {
        this.name = name;
    }

    public Show getShow() {
        return show;
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public String getName() {
        return name;
    }

}
