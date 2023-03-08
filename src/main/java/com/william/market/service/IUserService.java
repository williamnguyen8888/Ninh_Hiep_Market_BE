package com.william.market.service;

import com.william.market.entity.UserEntity;

import java.util.Optional;

public interface IUserService {
    Iterable<UserEntity> findAll();
    Optional<UserEntity> findById(int id);
    UserEntity save(UserEntity user);
    int deleteUserEntityById(int id);
}
