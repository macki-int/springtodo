package pl.sda.springtodo.todo;

import org.springframework.stereotype.Component;
import pl.sda.springtodo.author.Author;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Component
public class Todo {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private String description;
    private Date date;
    private boolean done;
    private Author author;

    public Todo() {
    }

    public Todo(String title, String description, Date date, Author author) {
        this.title = title;
        this.description = description;
        this.date = date;
        this.done = false;
        this.author = author;
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

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
