package com.cloud.noteslight.dto;

import lombok.Data;

@Data
public class LoginDTO {
    @NotBlank("用户名不能为空")
    private String username;
    @NotBlank("密码不能为空")
    private String password;
}
