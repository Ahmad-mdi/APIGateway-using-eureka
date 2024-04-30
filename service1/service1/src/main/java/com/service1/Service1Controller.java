package com.service1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service1Controller {
    @GetMapping("/say")
    public String sayHello(){
        return "hello service1";
    }
}
