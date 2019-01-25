package com.cienet.controller;

import com.cienet.bean.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
public class HelloController {

    @Autowired
    private Person person;

    @RequestMapping("/hello")
    public String hello() {
        return "Hello World!!";
    }

    @RequestMapping("/helloman")
    public String helloPerson() {
        return "hello   " + person.getName();
    }
}
