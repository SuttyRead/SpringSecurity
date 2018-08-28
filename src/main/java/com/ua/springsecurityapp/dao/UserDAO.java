package com.ua.springsecurityapp.dao;

import com.ua.springsecurityapp.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserDAO extends JpaRepository<User, Long> {

    User findByUsername(String username);

}
