package com.chiru.springboot.adminclient;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

/**
 * SayHelloController
 */
@RestController
@Slf4j
public class SayHelloController {
    @GetMapping("/")
    public String sayHello(){
        log.info("Info Log");
        log.error("Error Log");
        log.warn("Warning log");
        log.debug("Debug log");
        return "hello";
    }
    
}