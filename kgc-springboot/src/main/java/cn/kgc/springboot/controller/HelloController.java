package cn.kgc.springboot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {
 /*http://localhost:8080/hello/show */
    @GetMapping("show")
    public String test(){
        return "hello spring boot 1";
    }
}
