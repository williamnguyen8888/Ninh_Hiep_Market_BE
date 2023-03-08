package com.william.market.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Entity
@Table(name = "User")
public class UserEntity {
    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    @NotBlank
    private String user_name;
    
    @NotNull
    @NotBlank
    private String password;
    
    private String full_name;
    
    private Date dob;

    @NotNull
    @NotBlank
    private Long phone;

    @NotNull
    @NotBlank
    private String email;
    
    private int status;

    @NotNull
    @NotBlank
    private Date created_time;

    @NotNull
    @NotBlank
    private String created_by;
    
    @NotNull
    @NotBlank
    private String updated_by;
}
