package com.uwhiz.user.service;

import com.uwhiz.user.domain.UwhizUser;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collections;

public class UserDetailsBuilder {

    public static UserDetails createUserDetails(UwhizUser user) {
        return new User(user.getEmail(), user.getPasswordHash(), Collections.emptyList());
    }



}
