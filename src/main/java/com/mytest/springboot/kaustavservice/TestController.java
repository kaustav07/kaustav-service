package com.mytest.springboot.kaustavservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ResponseBody
    @RequestMapping("/circle/test")
    public Test getTest(){
        Test test = new Test();
        test.id = "Kaustav";
        test.name = "nearbuy";
        return test;
    }
}
