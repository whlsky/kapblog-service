package com.kapblog.articleService.model.http;

import lombok.Data;

/**
 * RestController返回Json通用数据结构
 *
 * @author nona9961
 * @date 2021/12/9 18:19
 * todo 用builder模式重构
 */
@Data
public class Response<T> {

    private int code;
    private String msg;
    private T data;

    public static <T> Response<T> success() {
        Response<T> response = new Response<>();
        response.setCode(200);
        response.setMsg("success");
        return response;
    }

    public static <T> Response<T> success(T data) {
        Response<T> response = new Response<>();
        response.setCode(200);
        response.setMsg("success");
        response.setData(data);
        return response;
    }

    public static Response<String> error(String message) {
        Response<String> response = new Response<>();
        response.setCode(500);
        response.setMsg(message);
        return response;
    }

}
