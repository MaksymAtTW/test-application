package com.uwhiz.user.config;

import com.uwhiz.user.service.UserBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Slf4j
@Transactional(readOnly = true)
public class UWhizAuthenticationProvider implements AuthenticationManager {

    @Autowired
    UserBusinessService userBusinessService;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        return null;
    }
}
