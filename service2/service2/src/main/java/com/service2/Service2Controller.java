package com.service2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Service2Controller {
    @GetMapping("/say")
    public String syHello(){
        return "hello service2";
    }
}
