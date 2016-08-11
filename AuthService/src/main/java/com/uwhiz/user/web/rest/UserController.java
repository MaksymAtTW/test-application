package com.uwhiz.user.web.rest;

import com.uwhiz.user.service.UserBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.security.Principal;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/")
@Slf4j
public class UserController {

    @Autowired
    UserBusinessService userBusinessService;

    @RequestMapping(path = "/me", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> me(Principal principal) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", principal.getName());
        return map;
    }

    @PostMapping(path = "/signup")
    public ResponseEntity<?> signup(@RequestBody UserSingUpDto userSingUpDto) throws URISyntaxException {

        Long createdUserId = userBusinessService.createNewUser(userSingUpDto.getEmail(), userSingUpDto.getPassword());

        return ResponseEntity.created(new URI("/api/v1/users/" + createdUserId)).body("OK");
    }

}
