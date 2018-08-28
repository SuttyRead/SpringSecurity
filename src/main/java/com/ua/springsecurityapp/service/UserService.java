package com.ua.springsecurityapp.service;

import com.ua.springsecurityapp.model.User;

public interface UserService {

    void save(User user);

    User findByUsername(String username);

}
