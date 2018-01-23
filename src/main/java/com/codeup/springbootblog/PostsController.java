package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {

    private PostService postsService;

    public PostsController(PostService service) {

        this.postsService = service;
    }


    @GetMapping ("/posts")

    public String index(Model viewAndModel) {

       Iterable<Post> posts = postsService.findAll();

        viewAndModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @RequestMapping ("/posts/{id}")

    public String showIndividualPost(@PathVariable long id, Model viewAndModel) {
        Post post = postsService.findOne(id);

        viewAndModel.addAttribute("post", post);

        return "posts/show";
    }

    @RequestMapping ("/posts/new")
    public String showCreateForm(Model vModel) {
        Post post = new Post();
        vModel.addAttribute("post", post);
        return "posts/new";
    }

    @PostMapping("/posts/create")

    public String createPost(@ModelAttribute Post post) {

        postsService.save(post);

        return post.getTitle();
    }

    @GetMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, Model viewAndModel) {
        Post post = postsService.findOne(id);
      viewAndModel.addAttribute("post", post);
        return "posts/edit";
    }

    @PostMapping ("/posts/edit")
    public String UpdatePost(@ModelAttribute Post post) {
        postsService.update(post);

        return "posts/edit";
    }


}
