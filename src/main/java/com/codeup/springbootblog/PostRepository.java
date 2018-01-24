package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostRepository extends CrudRepository<Post, Long> {


}
