package com.codeup.repositories;

import com.codeup.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

User findByUsername(String username);

}
