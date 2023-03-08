package com.william.market.service.impl;

import com.william.market.entity.UserEntity;
import com.william.market.repository.IUserRepository;
import com.william.market.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public Iterable<UserEntity> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<UserEntity> findById(int id) {
        return userRepository.findById(id);
    }

    @Override
    public UserEntity save(UserEntity user) {

        return userRepository.save(user);
    }

    @Override
    public UserEntity deleteUserEntityById(int id) {
        return userRepository.deleteUserEntityById(id);
    }

    @Override
    public Boolean existsByUserName(String user_name) {
        return userRepository.existsByUserName(user_name);
    }
}
