package com.uwhiz.user.web.rest;


import com.uwhiz.user.service.UserBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserResource {

    @Autowired
    UserBusinessService userBusinessService;

    @RequestMapping(path = "/users", method = RequestMethod.GET)
    public ResponseEntity<?> getAllUsers() {
        return ResponseEntity.ok(userBusinessService.retrieveAllUsers());
    }

}
