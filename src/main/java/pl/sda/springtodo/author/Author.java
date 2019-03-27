package pl.sda.springtodo.author;

import javax.persistence.Entity;

@Entity
public class Author {
    private String firstaName;
    private String lastName;

    public Author() {
    }

    public String getFirstaName() {
        return firstaName;
    }

    public void setFirstaName(String firstaName) {
        this.firstaName = firstaName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
