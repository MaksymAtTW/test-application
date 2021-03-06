package com.uwhiz.user.service;

import com.uwhiz.user.domain.User;
import com.uwhiz.user.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@Component
public class UserBusinessService {

    @Autowired
    private UserRepository userRepository;

    public Collection<User> retrieveAllUsers() {
        return userRepository.findAll();
    }

}
