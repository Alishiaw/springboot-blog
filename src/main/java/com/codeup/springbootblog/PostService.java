package com.codeup.springbootblog;

import com.codeup.springbootblog.daos.PostDao;
import com.codeup.springbootblog.models.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service

public class PostService {
    private PostDao postDao;

    public PostService(PostDao postDao) {
       this.postDao = postDao;
    }

    public  Iterable<Post> findAll() {

        return postDao.findAll();
    }


    public Post findOne(long id) {

        return postDao.findOne(id);
    }

    public void delete(long id) {
        postDao.delete(id);
    }
    public  void save (Post post) {
        postDao.save(post);
    }

    public void update (Post post) {

        postDao.save(post);
    }
}
