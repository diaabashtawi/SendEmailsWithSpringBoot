package com.deya.email.service;

import com.deya.email.entities.User;

public interface UserService {

    User saveUser(User user);
    Boolean verifyToken(String token);
}
