package com.william.market.service;

import com.william.market.entity.RoleEntity;


import java.util.List;
import java.util.Optional;

public interface IRoleService {
    List<RoleEntity> findAll();
    Optional<RoleEntity> findById(int id);
    RoleEntity save(RoleEntity role);
    Boolean existsByCode(int code);
    Boolean existsByName(String name);
    int deleteRoleEntityById(int id);
}
