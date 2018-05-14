package com.dubbo.controller;

import com.dubbo.service.TestDubboService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    TestDubboService testDubboService;


    @RequestMapping("eat")
    public Map<String, Object> eat() {
        Map<String, Object> map = new HashMap<String, Object>();
        String eat = testDubboService.eat();
        map.put("eat", eat);
        return map;
    }
}
