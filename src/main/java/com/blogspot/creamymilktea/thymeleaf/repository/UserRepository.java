package com.blogspot.creamymilktea.thymeleaf.repository;

import com.blogspot.creamymilktea.thymeleaf.entity.User;
import org.springframework.data.repository.CrudRepository;


public interface UserRepository extends CrudRepository<User, Long> {
}
