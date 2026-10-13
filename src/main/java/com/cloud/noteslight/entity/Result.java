package com.cloud.noteslight.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//统一处理返回结果

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private Integer code;
    // Code状态码规定，与HTTP状态码做区分,一般是HTTP状态码+10000
    private String message;
    private T data;
    // ---- 成功 ----
    public static <T> Result<T> success(T data) {
        return new Result<>(200, "success", data);
    }

    public static <T> Result<T> success() {
        return success(null);
    }

    public static <T> Result<T> success(String message, T data) {
        return new Result<>(200, message, data);
    }

    // ---- 失败 ----
    public static <T> Result<T> error(Integer code, String message) {
        return new Result<>(code, message, null);
    }

}
