package com.jaeho.project.sns.controller.response;

import com.jaeho.project.sns.model.User;
import com.jaeho.project.sns.model.UserRole;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserJoinResponse {

    private Integer id;
    private String userName;
    private UserRole role;

    public static UserJoinResponse fromUser(User user){
        return new UserJoinResponse(
                user.getId(),
                user.getUsername(),
                user.getUserRole()
        );
    }
}
