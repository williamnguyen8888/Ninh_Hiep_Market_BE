package com.william.market.controller;

import com.william.market.entity.UserEntity;
import com.william.market.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping
    private ResponseEntity<UserEntity> getAllUser(){
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }

}
