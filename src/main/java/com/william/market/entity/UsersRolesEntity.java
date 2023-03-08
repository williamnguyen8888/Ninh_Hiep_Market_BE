package com.william.market.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Entity
@Table(name = "Users_Roles")
public class UsersRolesEntity {
    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    @JsonBackReference(value = "UsersRolesEntity-UserEntity")
    private UserEntity user;

    @ManyToOne
    @JoinColumn(name = "role_id")
    @JsonBackReference(value = "UsersRolesEntity-RoleEntity")
    private RoleEntity role;
}
