package com.licon.config;

import com.licon.api.ServiceB;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.ReferenceBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Licon
 * @description: TODO
 * @date 2023/10/9 9:26
 */
@Configuration
public class DubboBeanConfiguration {
    @Bean
    @DubboReference(url = "dubbo://localhost:38887")
    public ReferenceBean<ServiceB> serviceB() {
        return new ReferenceBean<>();
    }

}
