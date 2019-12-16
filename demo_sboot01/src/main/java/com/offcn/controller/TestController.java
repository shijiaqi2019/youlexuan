package com.offcn.controller;

import com.offcn.entity.Car;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    private List<Car> list = new ArrayList<>();

    @RequestMapping("/test")
    private String test(String name){
        return name + ">>>>>>>>";
    }

    @RequestMapping("/add1")
    private List<Car> add1(Car car){
        list.add(car);
        return list;
    }
    @RequestMapping("/add2")
    private List<Car> add2(@RequestBody Car car){
        list.add(car);
        return list;
    }
}
