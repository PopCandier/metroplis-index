package com.metropolis.ui.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Pop
 * @date 2020/1/30 14:54
 */
@RestController
public class HelloController {

    @GetMapping(value = "hello")
    public String hello(){
        return "hello123";
    }

}
