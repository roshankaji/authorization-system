package com.authorizationsystem.service.Impl;

import com.authorizationsystem.entities.User;
import com.authorizationsystem.repository.UserRepository;
import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public void registerUser(User user){
        userRepository.save(user);
    }
}
