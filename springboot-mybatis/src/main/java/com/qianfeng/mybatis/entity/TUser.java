package com.qianfeng.mybatis.entity;


import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TUser {
    private Long id;

    private String username;

    private String password;

}