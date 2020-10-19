package entity;

import java.util.Date;

public class Actor {
    private String name;
    private Date dateOfBirthActor;

    public Actor(String name, Date dateOfBirthActor) {
        this.name = name;
        this.dateOfBirthActor = dateOfBirthActor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDateOfBirthActor() {
        return dateOfBirthActor;
    }

    public void setDateOfBirthActor(Date dateOfBirthActor) {
        this.dateOfBirthActor = dateOfBirthActor;
    }

    @Override
    public String toString() {
        return "entity.Actor{" +
                "name='" + name + '\'' +
                ", dateOfBirthActor=" + dateOfBirthActor +
                '}';
    }
}
