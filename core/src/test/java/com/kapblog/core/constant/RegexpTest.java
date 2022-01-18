package com.kapblog.core.constant;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;


/**
 * @author nona9961
 * @date 2021/12/12
 */
class RegexpTest {
    @Test
    void testEmail() {
        Assertions.assertTrue("jjj@163.com".matches(Regexp.EMAIL_REG));
        ArrayList<String> strings = new ArrayList<>();
        strings.add("eed@112@163.com");
        strings.add("jjj-163.com");
        strings.add("_jjj@qq.com");
        strings.add("-jjj@163.com");
        strings.add("haha@163");
        strings.add("@163.com");
        for (String string : strings) {
            Assertions.assertFalse(string.matches(Regexp.EMAIL_REG));
        }
    }
}