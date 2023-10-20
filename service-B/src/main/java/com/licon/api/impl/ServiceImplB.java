package com.licon.api.impl;

import com.licon.api.ServiceA;
import com.licon.api.ServiceB;
import com.licon.api.User;
import lombok.RequiredArgsConstructor;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

import java.util.List;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:17
 */
@DubboService
public class ServiceImplB implements ServiceB {

    @Override
    public void testB() {
        System.out.println("test B");
    }

    @Override
    public List<User> findUser(List<User> users) {
        return users.stream()
                .map(e->e.setName("Licon")).toList();
    }
}
