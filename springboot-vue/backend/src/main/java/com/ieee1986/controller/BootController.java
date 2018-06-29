package com.ieee1986.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BootController {

    @Autowired
    public BootController() {

    }

    @GetMapping("/api/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity("hello!!!!!!!!!!!", HttpStatus.OK);
    }
}
