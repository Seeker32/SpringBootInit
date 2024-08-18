package com.example.springbootinit.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户登录请求
 */
@Data
public class UserLoginRequest implements Serializable {

    private static final long serialVersionUID = 909436946576886123L;

    private String userAccount;

    private String userPassword;
}
