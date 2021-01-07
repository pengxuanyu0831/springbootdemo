package com.pengxy.NotionDemo.Test.AOP;

import org.springframework.web.bind.annotation.*;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2021/01/07 22:13
 */

@RestController
@RequestMapping("/hello")
public class HelloAopController {


    @ResponseBody
    @GetMapping("/world")
    public String hello(@RequestParam String name ){
        return "Hello" + name;
    }
}
