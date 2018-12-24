package com.mistra.dubbo.provider;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author: WangRui
 * @Date: 2018/12/10
 * Time: 14:21
 * Description:
 */
@SpringBootApplication
@EnableDubbo
public class DubboProviderApplication    {

    public static void main(String[] args) {
        SpringApplication.run(DubboProviderApplication.class, args);
    }

}
