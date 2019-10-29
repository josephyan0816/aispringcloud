package com.southwind.controller;

import com.southwind.entity.Student;
import com.southwind.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * FeignHandler
 *
 * @author Joseph
 * @version 1.0
 * 2019/10/29 17:27
 **/
@RestController
@RequestMapping("/feign")
public class FeignHandler {

    @Autowired
    public FeignProviderClient feignProviderClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return feignProviderClient.findAll();
    }

    @GetMapping("/index")
    public String index()
    {
        return feignProviderClient.index();
    }

}
