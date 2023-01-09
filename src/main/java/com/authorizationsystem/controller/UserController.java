package com.authorizationsystem.controller;

import com.authorizationsystem.entities.User;
import com.authorizationsystem.repository.UserRepository;
import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    UserRepository userRepository;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void registerUser(@RequestBody User user) {

        userService.registerUser(user);

    }

    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public void userLogin(@RequestBody User user){
        User dbUser = userRepository.findByUsername(user.getUsername());

        if(user.getPassword().equals(dbUser.getPassword())) {
            System.out.println("Login Successful");

        }else {
            System.out.println("Invalid username/password");
        }
    }
}
