package com.ua.springsecurityapp.service;

public interface SecurityService {

    String findLoggedInUsername();

    void autoLogin(String username, String password);

}
