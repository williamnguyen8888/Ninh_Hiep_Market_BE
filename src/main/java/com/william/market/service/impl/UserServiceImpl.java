package com.william.market.service.impl;

import com.william.market.dto.UserDto;
import com.william.market.entity.UserEntity;
import com.william.market.repository.IUserRepository;
import com.william.market.service.IUserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
    @Autowired
    IUserRepository userRepository;

    @Override
    public List<UserDto> findAll() {
        // Tạo mapper object
        ModelMapper mapper = new ModelMapper();
        List<UserDto> userDtoList = Arrays.asList(mapper.map(userRepository.findAll(), UserDto[].class));

        return userDtoList;
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
    public int deleteUserEntityById(int id) {
        return userRepository.deleteUserEntityById(id);
    }

    @Override
    public Boolean existsByUserName(String user_name) {
        return userRepository.existsByUserName(user_name);
    }
}
