package com.william.market.service;

import com.william.market.dto.UserDto;
import com.william.market.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface IUserService {
    List<UserDto> findAll();
    Optional<UserEntity> findById(int id);
    UserEntity save(UserEntity user);
    Boolean existsByUserName(String user_name);
    int deleteUserEntityById(int id);
}
