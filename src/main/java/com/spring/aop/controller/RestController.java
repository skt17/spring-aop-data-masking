package com.spring.aop.controller;

import com.spring.aop.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @Autowired
    UserService userService;

    @GetMapping("/user/{userId}")
    public ResponseEntity<Object> getUserData(String userId) {
        return new ResponseEntity<>((Object) userService.getUserInfo(), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }

    @GetMapping("/user/{userId}/card-details")
    public ResponseEntity<Object> getCardDetails(String userId) {
        return new ResponseEntity<>((Object) userService.getCardDetails(), HttpStatusCode.valueOf(HttpStatus.OK.value()));
    }
}
