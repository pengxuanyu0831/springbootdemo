package com.pengxy.demo.controller;


import com.pengxy.demo.service.AyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AyncController {

    @Autowired
    private AyncService ayncService;

    @GetMapping("/helloworld")
    public String helloworld(){
        ayncService.helloworld();
        return "success";
    }

}
