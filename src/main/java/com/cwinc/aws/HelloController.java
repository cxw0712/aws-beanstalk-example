package com.cwinc.aws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by cwang on 5/20/2019.
 */
@RequestMapping("/hello")
@RestController
public class HelloController {
    @GetMapping
    public String hello(){
        return  "Hello Chong!";
    }
}
