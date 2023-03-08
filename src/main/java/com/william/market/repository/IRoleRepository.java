package com.william.market.repository;

import com.william.market.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IRoleRepository extends JpaRepository<RoleEntity,Integer> {
    Boolean existsByCode(int code);
    Boolean existsByName(String name);
    int deleteRoleEntityById(int id);
}
