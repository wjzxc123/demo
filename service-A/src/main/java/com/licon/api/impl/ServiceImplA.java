package com.licon.api.impl;

import com.licon.api.ServiceA;
import com.licon.api.ServiceB;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/9/28 17:18
 */
@DubboService
public class ServiceImplA implements ServiceA {

    @DubboReference
    private ServiceB serviceB;

    @Override
    public void testA() {
        System.out.println("invoke begin");
        serviceB.testB();
        System.out.println("invoke end");
        System.out.println("test A");
    }
}
