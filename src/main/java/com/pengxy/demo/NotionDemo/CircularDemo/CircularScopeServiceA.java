package com.pengxy.demo.NotionDemo.CircularDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * @program demo
 * @description:
 * @author: pengxuanyu
 * @create: 2020/12/30 22:24
 */


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class CircularScopeServiceA {
    @Autowired
    private CircularScopeServiceB scopeServiceB;
}
