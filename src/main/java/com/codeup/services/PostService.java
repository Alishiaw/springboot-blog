package com.codeup.services;

import com.codeup.models.Post;
import com.codeup.repositories.PostRepository;
import org.springframework.stereotype.Service;

@Service

public class PostService {
    private PostRepository postDao;


    public PostService(PostRepository postDao) {

        this.postDao = postDao;
    }

    public  Iterable<Post> findAll() {

        return postDao.findAll();
    }


    public Post findOne(long id) {

        return postDao.findOne(id);
    }

    public  void save (Post post) {

        postDao.save(post);
    }

    public void update (Post post) {

        postDao.save(post);
    }

    public void delete(long id) {
        postDao.delete(id);
    }
}
