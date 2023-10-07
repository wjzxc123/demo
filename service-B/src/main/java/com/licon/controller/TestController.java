package com.licon.controller;

import com.licon.api.ServiceB;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:23
 */
@RestController
public class TestController {

    @Autowired
    private ServiceB serviceB;

    @GetMapping("/testB")
    public Object testB(){
        serviceB.testB();
        return "success";
    }
}
