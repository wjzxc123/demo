package com.licon.controller;

import com.licon.api.ServiceA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:23
 */
@RestController
public class TestController {

    @Autowired
    private ServiceA serviceA;

    @GetMapping("/testA")
    public Object testA(){
        serviceA.testA();
        return "success";
    }
}
