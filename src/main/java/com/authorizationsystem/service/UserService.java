package com.authorizationsystem.service;

import com.authorizationsystem.entities.User;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void registerUser(User user);
}
