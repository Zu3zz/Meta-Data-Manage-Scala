package com.zth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: 3zZ.
 * Date: 2020/1/11 2:58 上午
 */
@RestController
public class HelloBoot {
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String SayHello() {
        return "Hello";
    }
}
