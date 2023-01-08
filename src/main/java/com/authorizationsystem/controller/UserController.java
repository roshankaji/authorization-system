package com.authorizationsystem.controller;

import com.authorizationsystem.entities.User;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void registerUser(@RequestBody User user) {


    }
}
