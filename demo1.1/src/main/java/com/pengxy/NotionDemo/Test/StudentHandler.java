package com.pengxy.NotionDemo.Test;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @program demo
 * @description: extends NameSpaceHandlerSupport
 * @author: pengxuanyu
 * @create: 2020/12/10 22:21
 */
public class StudentHandler extends NamespaceHandlerSupport {

    @Override
    public void init() {
        registerBeanDefinitionParser("student",new StudentBeanDefinitionParser());
    }
}
