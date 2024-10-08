package com.example.springbootinit.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 4868970356203881335L;

    private String userAccount;

    private String userPassword;

    private String checkPassword;
}
