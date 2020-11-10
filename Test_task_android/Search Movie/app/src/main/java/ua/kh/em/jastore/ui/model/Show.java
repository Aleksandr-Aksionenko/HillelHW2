package ua.kh.em.jastore.ui.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Show {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("image")
    @Expose
    private Image image;
    @SerializedName("status")
    @Expose
    private String status;

    public Show() {
    }

    public Show(int id, String url, String name, Image image, String summary) {
        this.id = id;
        this.url = url;
        this.name = name;
        this.image = image;
        this.status = summary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String summary) {
        this.status = summary;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
