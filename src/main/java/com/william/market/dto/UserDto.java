package com.william.market.dto;
import com.william.market.entity.UsersRolesEntity;
import lombok.*;

import java.util.Collection;
import java.util.Date;


@NoArgsConstructor(access= AccessLevel.PUBLIC)
@AllArgsConstructor
@Getter
@Setter
public class UserDto {

    private int id;

    private String userName;

    private String fullName;

    private String dob;

    private Long phone;

    private String email;

    private Collection<UsersRolesEntity> usersRolesEntities;

    private int status;

    private Date createdTime;

    private String createdBy;

    private String updatedBy;
}
