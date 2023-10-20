package com.licon.api.impl;

import com.licon.api.ServiceA;
import com.licon.api.ServiceB;
import com.licon.api.User;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:18
 */
@DubboService
@RequiredArgsConstructor
public class ServiceImplA implements ServiceA {


    private final ServiceB serviceB;

    @Override
    public void testA() {
        System.out.println("test A");
        System.out.println("invoke begin");
        List<User> user = serviceB.findUser(List.of(new User(), new User()));
        System.out.println(user);
    }
}
