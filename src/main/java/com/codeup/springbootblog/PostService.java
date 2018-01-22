package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PostService {
    private List<Post> posts = new ArrayList<>();

    public PostService() {
        createPosts();
    }
    public List<Post> findAll() {
        return posts;
    }

    public Post save(Post post) {
        post.setId(posts.size() + 1);
        posts.add(post);
        return post;
    }

    public Post findOne(long id) {

        return posts.get((int)(id - 1));
    }

    private void createPosts() {
        save(new Post("Post One", "Post Description One"));
        save(new Post("Post Two", "Post Description Two"));
        save(new Post("Post Three", "Post Description Three"));
    }
}
