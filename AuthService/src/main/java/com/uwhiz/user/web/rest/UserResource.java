package com.uwhiz.user.web.rest;


import com.uwhiz.user.service.UserBusinessService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

@RestController
@RequestMapping("/api/v1")
@Slf4j
public class UserResource {

    @Autowired
    UserBusinessService userBusinessService;

    @RequestMapping(path = "/me", method = RequestMethod.GET)
    @ResponseBody
    public Map<String, String> me(Principal principal) {
        Map<String, String> map = new LinkedHashMap<>();
        map.put("name", principal.getName());
        return map;
    }

}
