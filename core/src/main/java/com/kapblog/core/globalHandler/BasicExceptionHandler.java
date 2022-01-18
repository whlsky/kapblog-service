package com.kapblog.core.globalHandler;

import com.kapblog.core.model.http.Response;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * 全局异常处理器，当有异常从Controller抛出时，该类可以去处理
 *
 * @author nona9961
 * @date 2021/12/9 18:17
 */
@RestControllerAdvice
public class BasicExceptionHandler {

    /**
     * 处理参数校验失败的异常
     *
     * @param e exception
     * @return 提示信息
     */
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public Response<?> handleMethodArgumentNotValidException(MethodArgumentNotValidException e) {
        return Response.error(e.getBindingResult().getAllErrors().get(0).getDefaultMessage());
    }
}
