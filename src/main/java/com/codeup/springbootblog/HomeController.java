package com.codeup.springbootblog;


import com.codeup.springbootblog.daos.PostDao;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller

public class HomeController {

    private PostDao postDao;

    public HomeController(PostDao postDao) {

        this.postDao = postDao;
    }

    @GetMapping ("/")
    public String index() {

        return "home";
    }

    @GetMapping("/dao-test")
    @ResponseBody
    public Iterable<Post> daoteset() {
        return postDao.findAll();
    }

}
