package com.pietro.crud.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Version {

    @GetMapping("/version")
    public ResponseEntity version() {
        return ResponseEntity.ok("Ok");
    }



}