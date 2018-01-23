package com.codeup.springbootblog.models;

import javax.persistence.*;

@Entity
@Table(name = "posts")

public class Post {

    @Id @GeneratedValue

    private long id;

    @Column(nullable =false)
    private String title;


    @Column(columnDefinition = "TEXT")
    private String body;

    public Post(String title, String body) {
        this.title = title;
        this.body = body;
    }
    public Post() { }

    public String getTitle() {

        return title;
    }

    public void setTitle(String title) {

        this.title = title;
    }

    public String getDescription() {

        return body;
    }
}
