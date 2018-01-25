package com.codeup.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")

public class Post {

    @Id
    @GeneratedValue

    private long id;

    @Column(nullable = false)
    private String title;


    @Column(columnDefinition = "TEXT")
    private String body;


    @ManyToOne
    private User user;




    public Post(Long id ,String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Post() {

    }
    public Long getId() {

        return id;
    }

    public void setId(Long id) {

        this.id = id;
    }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getBody() {

        return body;
    }

    public void setBody(String body) {

        this.body = body;
    }

    public User getUser() {

        return user;
    }

    public void setUser(User user) {

        this.user = user;
    }

}
