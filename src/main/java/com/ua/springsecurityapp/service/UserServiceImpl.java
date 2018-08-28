package com.ua.springsecurityapp.service;

import com.ua.springsecurityapp.dao.RoleDAO;
import com.ua.springsecurityapp.dao.UserDAO;
import com.ua.springsecurityapp.model.Role;
import com.ua.springsecurityapp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private RoleDAO roleDAO;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public void save(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        Set<Role> roles = new HashSet<>();
        roles.add(roleDAO.getOne(1L));
        user.setRoles(roles);
        userDAO.save(user);
    }

    @Override
    public User findByUsername(String username) {
        return userDAO.findByUsername(username);
    }

}
