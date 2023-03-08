package com.william.market.repository;

import com.william.market.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUserRepository extends JpaRepository<UserEntity, Integer> {
    Boolean existsByUserName(String user_name);
    UserEntity deleteUserEntityById(int id);
}
