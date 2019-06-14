package com.wkdrabbit.sprint13.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

@Entity
@Table(name = "todo")
public class ToDo extends Auditable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long todoid;

    @Column(nullable = false)
    private String description;

    @ManyToOne()
    @JoinColumn(name = "userid")
    @JsonIgnoreProperties("todo")
    private User user = new User();

    private String datestarted;

    private Boolean completed;

    public ToDo(String description,  String datestarted, User user) {
        this.description = description;
        this.user = user;
        this.datestarted = datestarted;
    }

    public ToDo() {
    }

    public long getTodoid() {
        return todoid;
    }

    public void setTodoid(long todoid) {
        this.todoid = todoid;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getDatestarted() {
        return datestarted;
    }

    public void setDatestarted(String datestarted) {
        this.datestarted = datestarted;
    }

    public Boolean getCompleted() {
        return completed;
    }

    public void setCompleted(Boolean completed) {
        this.completed = completed;
    }
}
