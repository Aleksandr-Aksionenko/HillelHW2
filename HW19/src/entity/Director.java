package entity;

import java.util.Date;

public class Director {
    private String name;
    private Date dateOfBirthDirector;

    public Director(String name, Date dateOfBirthDirector) {
        this.name = name;
        this.dateOfBirthDirector = dateOfBirthDirector;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirthDirector() {
        return dateOfBirthDirector;
    }

    public void setDateOfBirthDirector(Date dateOfBirthDirector) {
        this.dateOfBirthDirector = dateOfBirthDirector;
    }

    @Override
    public String toString() {
        return "entity.Director{" +
                "name='" + name + '\'' +
                ", dateOfBirthDirector=" + dateOfBirthDirector +
                '}';
    }
}
