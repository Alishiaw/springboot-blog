package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;

import com.codeup.springbootblog.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PostsController {

    private final PostRepository postsDao;
    private final UserRepository userRepository;

    public PostsController(PostRepository postsDao, UserRepository userRepository) {

        this.postsDao = postsDao;
        this.userRepository = userRepository;
    }


    @GetMapping ("/posts")

    public String showAllPosts(Model viewAndModel) {

       Iterable<Post> posts = postsDao.findAll();

        viewAndModel.addAttribute("posts", posts);

        return "posts/index";
    }

    @RequestMapping ("/posts/{id}")

    public String showIndividualPost(@PathVariable long id, Model viewAndModel) {
        Post post = postsDao.findOne(id);

        viewAndModel.addAttribute("post", post);

        return "posts/show";
    }

    @RequestMapping ("/posts/create")
    public String showCreateForm(Model vModel) {
        Post post = new Post();
        vModel.addAttribute("post", new Post());
        return "posts/create";
    }

    @PostMapping("/posts/create")

    public String createPost(@ModelAttribute Post post) {
        User user = userRepository.findOne(2L);
        post.setOwner(user);
        postsDao.save(post);

        return "redirect:/posts";
    }

    @GetMapping("/posts/{id}/edit")
    public String updatePost(@PathVariable long id, Model viewAndModel) {
        Post post = postsDao.findOne(id);
      viewAndModel.addAttribute("post", post);
        return "posts/edit";
    }

    @PostMapping ("/posts/edit")
    public String UpdatePost(@ModelAttribute Post post) {
        postsDao.save(post);

        return "redirect:/posts";
    }
    @PostMapping("/posts/{id}/delete")
    public String delete (@PathVariable long id) {
        postsDao.delete(id);
        return "redirect:/posts";
    }


}
