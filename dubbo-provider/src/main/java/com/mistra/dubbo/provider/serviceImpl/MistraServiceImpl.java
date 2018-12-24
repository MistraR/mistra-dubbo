package com.mistra.dubbo.provider.serviceImpl;

import com.alibaba.dubbo.config.annotation.Service;
import com.mistra.dubbo.api.MistraService;

/**
 * @Author: WangRui
 * @Date: 2018/12/21
 * Time: 11:16
 * Description:
 */
@Service(version = "${mistra.service.version}")
public class MistraServiceImpl implements MistraService {

    @Override
    public String welcome(String name) {
        return "Hello" + name;
    }
}
