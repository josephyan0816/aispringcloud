package com.southwind.controller;

import ch.qos.logback.classic.spi.STEUtil;
import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * HystrixHandler
 *
 * @author Joseph
 * @version 1.0
 * 2019/10/29 18:06
 **/

@RestController
@RequestMapping("/hystrix")
public class HystrixHandler {

    @Autowired
    private FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll()
    {
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index()
    {
        return feignProviderClient.index();
    }
}
