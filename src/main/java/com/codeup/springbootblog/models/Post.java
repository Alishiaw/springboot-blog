package com.codeup.springbootblog.models;

public class Post {
    private long id;
    private String title;
    private String description;

    public Post (String title, String description) {
        this.title = title;
        this.description = description;
    }
    public Post() {


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
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
}