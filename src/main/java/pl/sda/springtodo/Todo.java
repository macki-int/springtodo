package pl.sda.springtodo;

import javax.persistence.Entity;
import java.util.Date;

@Entity
public class Todo {
    private long id;
    private String title;
    private String description;
    private Date date;
    private boolean done;

    public Todo() {
    }

    public Todo(String title, String description, Date date) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.done = false;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }
}
