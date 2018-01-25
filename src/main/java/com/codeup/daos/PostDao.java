package com.codeup.daos;

import com.codeup.models.Post;
import org.springframework.data.repository.CrudRepository;

public interface PostDao extends CrudRepository<Post, Long> {


}
