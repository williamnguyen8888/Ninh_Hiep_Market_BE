package com.william.market.controller;

import com.william.market.entity.RoleEntity;
import com.william.market.entity.UserEntity;
import com.william.market.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.management.relation.Role;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@RestController
@RequestMapping("api/user")
public class UserController {
    @Autowired
    IUserService userService;
    @GetMapping
    private ResponseEntity<UserEntity> getAllUser(){
        return new ResponseEntity(userService.findAll(), HttpStatus.OK);
    }
    @PostMapping
    private ResponseEntity<UserEntity> createUser(UserEntity userEntity){
        if (userService.existsByUserName(userEntity.getUserName())){
            return new ResponseEntity("User already exists", HttpStatus.CONFLICT);
        }
        
        return new ResponseEntity(userService.save(userEntity), HttpStatus.OK);
    }
}
