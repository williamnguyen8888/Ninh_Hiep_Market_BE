package com.william.market.controller;

import com.william.market.entity.RoleEntity;
import com.william.market.entity.UserEntity;
import com.william.market.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserEntity> getUser(@PathVariable("id") int id) {
        return new ResponseEntity(userService.findById(id), HttpStatus.OK);
    }
    @PostMapping
    private ResponseEntity<UserEntity> create(@RequestBody UserEntity userEntity){
        if (userService.existsByUserName(userEntity.getUserName())){
            return new ResponseEntity("User already exists", HttpStatus.CONFLICT);
        }
        return new ResponseEntity(userService.save(userEntity), HttpStatus.OK);
    }
    @PutMapping
    private ResponseEntity<UserEntity> update(@RequestBody UserEntity userEntity){
        return new ResponseEntity(userService.save(userEntity), HttpStatus.OK);
    }
    @DeleteMapping
    private ResponseEntity<UserEntity> delete(@RequestParam int id){
        return new ResponseEntity(userService.deleteUserEntityById(id), HttpStatus.OK);
    }
}
