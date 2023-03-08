package com.william.market.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;
import org.springframework.context.annotation.Primary;

import java.util.Collection;
import java.util.Date;

@Data
@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Entity
@Table(name = "Role")
public class RoleEntity {
    @Id
    @org.springframework.data.annotation.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotNull
    private int code;

    @NotNull
    private String name;

    private String description;

//    @ManyToMany(mappedBy = "roles")
//    @JsonIgnore
//    private Collection<UserEntity> users;

    @OneToMany(mappedBy = "role", cascade = CascadeType.ALL)
    @JsonManagedReference(value = "UsersRolesEntity-RoleEntity")
    private  Collection<UsersRolesEntity> usersRolesEntities;


    private int status;

    private Date createdTime  = new Date();


    private String createdBy;


    private String updatedBy;


}
