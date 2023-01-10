package com.authorizationsystem.service;

import com.authorizationsystem.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    /**
     * Method to register user
     *
     * @param user user object
     */
    void registerUser(User user);

    /**
     * Method for user login
     *
     * @param user user object
     * @return response
     * @throws Exception to be thrown on failure
     */
    ResponseEntity userLogin(User user) throws Exception;
}
