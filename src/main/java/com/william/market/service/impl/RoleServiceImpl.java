package com.william.market.service.impl;

import com.william.market.entity.RoleEntity;
import com.william.market.repository.IRoleRepository;
import com.william.market.service.IRoleService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
@Transactional
public class RoleServiceImpl implements IRoleService {
    @Autowired
    IRoleRepository roleRepository;

    @Override
    public List<RoleEntity> findAll() {
        return roleRepository.findAll();
    }

    @Override
    public Optional<RoleEntity> findById(int id) {
        return roleRepository.findById(id);
    }

    @Override
    public RoleEntity save(RoleEntity role) {
        return roleRepository.save(role);
    }

    @Override
    public Boolean existsByCode(int code) {
        return roleRepository.existsByCode(code);
    }

    @Override
    public Boolean existsByName(String name) {
        return roleRepository.existsByName(name);
    }

    @Override
    public int deleteRoleEntityById(int id) {
        return roleRepository.deleteRoleEntityById(id);
    }
}
