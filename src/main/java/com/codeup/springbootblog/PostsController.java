package com.codeup.springbootblog;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsController {


    private PostService postsService;

    public PostsController(PostService service) {

        this.postsService = service;
    }


    @GetMapping ("/posts")

    public String showAllposts(Model viewAndModel) {
        List<Post> posts = postsService.findAll();

        viewAndModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @GetMapping ("/posts/{id}")

    public String showIndividualPost(@PathVariable long id, Model viewAndModel) {
        Post post = postsService.findOne(id);

        viewAndModel.addAttribute("post", post);

        return "posts/show";
    }

    @GetMapping("/posts/create")
    public String showCreateAdForm(Model vModel) {
        Post post = new Post();
        vModel.addAttribute("post",post);
        return "posts/create";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String savePost(@ModelAttribute Post post) {
        postsService.save(post);

        return post.getTitle() + " " + post.getDescription();
    }

}


