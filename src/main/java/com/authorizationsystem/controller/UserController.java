package com.authorizationsystem.controller;

import com.authorizationsystem.entities.User;
import com.authorizationsystem.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    /**
     * Method to register user
     *
     * @param user user object
     */
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public void registerUser(@RequestBody User user) {

        userService.registerUser(user);

    }

    /**
     * Method for user login
     *
     * @param user user object
     * @return response
     * @throws Exception to be thrown on failure
     */
    @RequestMapping(method = RequestMethod.POST, value = "/login")
    public ResponseEntity userLogin(@RequestBody User user) throws Exception {
        return userService.userLogin(user);
    }

    /**
     * Private API
     *
     * @return hardcoded string
     */
    @RequestMapping(method = RequestMethod.POST, value = "/API1")
    public String privateAPI1() {
        return "Successfully accessed API1";
    }

    /**
     * Private API
     *
     * @return hardcoded string
     */
    @RequestMapping(method = RequestMethod.POST, value = "/API2")
    public String privateAPI2() {
        return "Successfully accessed API2";
    }
}
