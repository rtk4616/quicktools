package com.github.xbynet.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class SampleController {


    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello World!";
    }

}