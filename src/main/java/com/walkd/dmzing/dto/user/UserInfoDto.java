package com.walkd.dmzing.dto.user;


import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class UserInfoDto {

    private String email;

    private String nick;

    private Long courseCount;

    private Long reviewCount;

    private int dp;

}
