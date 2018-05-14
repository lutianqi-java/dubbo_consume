package com.dubbo.controller;

import com.dubbo.service.TestDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestDubboService testDubboService;


    @RequestMapping("eat")
    public String eat() {
        testDubboService.eat();
        return "11";
    }
}
