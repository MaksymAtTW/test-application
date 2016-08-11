package com.uwhiz.user.service;

import com.uwhiz.user.domain.UwhizUser;
import com.uwhiz.user.repo.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import javax.transaction.Transactional;
import java.util.Collection;
import java.util.Optional;

@Component
@Transactional
@Slf4j
public class UserBusinessService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Optional<UwhizUser> getUserByEmail(String email) {
        Optional<UwhizUser> user = userRepository.findByEmail(email);

        user.ifPresent(it -> log.info("Found user :" + it.toString() + " by email: " + email));

        return user;
    }

    public Long createNewUser(String email, String password) {
        String hash = passwordEncoder.encode(password);

        UwhizUser user = userRepository.save(new UwhizUser(email, hash));

        log.info("Created a new user with Id: " + user.getId() + " with email: " + email);

        return user.getId();
    }


}
