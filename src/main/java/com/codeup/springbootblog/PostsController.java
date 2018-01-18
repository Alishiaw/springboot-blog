package com.codeup.springbootblog;

import org.springframework.stereotype.Controller;


import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {
    @RequestMapping ("/posts")
    @ResponseBody
    public String index() {
        return "posts index page";
    }

    @RequestMapping(path = "/posts/{id}")
    @ResponseBody
    public String id(@PathVariable long number) {
        return "view an individual post #" + number;
    }
    @RequestMapping(path = "/posts/create")
    @ResponseBody
    public String showCreate() {
        return "view the form for creating a post";
    }
    @RequestMapping
    @ResponseBody
    public String Createform() {
        return "Store a post in the database";
    }

}

