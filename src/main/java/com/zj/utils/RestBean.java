package com.zj.utils;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RestBean<T> {
    int code;
    String reason;
    T data;
    public RestBean(int code, String reason) {
        this.code = code;
        this.reason = reason;
    }
}
