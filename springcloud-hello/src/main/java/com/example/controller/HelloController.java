package com.example.controller;

import com.example.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "hello";
    }

    @GetMapping("/hello1")
    public String hello(@RequestParam String name) {
        return "hello:"+name;
    }

    @GetMapping("/hello2")
    public User hello(@RequestHeader String name, @RequestHeader Integer age) {
        User user = new User(name,age);
        return user;
    }

    @PostMapping("/hello3")
    public String hello(@RequestBody User user) {
        return "hell0" + user.getName() + "," + user.getAge();
    }
}
