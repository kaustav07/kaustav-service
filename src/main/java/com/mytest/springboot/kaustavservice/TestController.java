package com.mytest.springboot.kaustavservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @ResponseBody
    @RequestMapping("/test")
    public Test getTest(){
        Test test = new Test();
        test.id = "1252";
        test.name = "Kaustav";
        return test;
    }
}
