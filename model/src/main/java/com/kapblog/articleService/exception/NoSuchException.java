package com.kapblog.articleService.exception;

/**
 * 找不到异常
 *
 * @author nona9961
 * @date 2021/12/9 18:10
 */
public class NoSuchException extends Exception {
    public NoSuchException(String message) {
        super(message);
    }
}
