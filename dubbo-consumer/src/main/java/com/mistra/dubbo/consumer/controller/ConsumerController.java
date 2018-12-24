package com.mistra.dubbo.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.mistra.dubbo.api.MistraService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: WangRui
 * @Date: 2018/12/24
 * Time: 10:24
 * Description:
 */
@RestController
public class ConsumerController {

    @Reference(version = "${mistra.service.version}")
    private MistraService mistraService;

    @RequestMapping("/sayHello/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return mistraService.welcome(name);
    }
}
