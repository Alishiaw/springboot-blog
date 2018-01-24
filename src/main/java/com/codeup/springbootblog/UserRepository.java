package com.codeup.springbootblog;

import com.codeup.springbootblog.models.Post;
import com.codeup.springbootblog.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {


}
