package com.william.market.controller;

import com.william.market.entity.RoleEntity;
import com.william.market.entity.UserEntity;
import com.william.market.service.IRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/role")
public class RoleController {
    @Autowired
    IRoleService roleService;

    @GetMapping
    public ResponseEntity<RoleEntity> getAll(){
        return new ResponseEntity(roleService.findAll(), HttpStatus.OK);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<RoleEntity> getUser(@PathVariable("id") int id) {
        return new ResponseEntity(roleService.findById(id),HttpStatus.OK);
    }
    @PostMapping
    public ResponseEntity<UserEntity> create(@RequestBody RoleEntity roleEntity) {
        if (roleService.existsByCode(roleEntity.getCode())){
            return new ResponseEntity("code already exists",HttpStatus.CONFLICT);
        }else if(roleService.existsByName(roleEntity.getName())){
            return new ResponseEntity("name already exists",HttpStatus.CONFLICT);
        }
        return new ResponseEntity(roleService.save(roleEntity),HttpStatus.OK);
    }
    @PutMapping
    public ResponseEntity<UserEntity> update(@RequestBody RoleEntity roleEntity) {
        return new ResponseEntity(roleService.save(roleEntity),HttpStatus.OK);
    }
    @DeleteMapping
    public ResponseEntity<RoleEntity> delete(@RequestParam int id) {
        return new ResponseEntity(roleService.deleteRoleEntityById(id),HttpStatus.OK);
    }
}
