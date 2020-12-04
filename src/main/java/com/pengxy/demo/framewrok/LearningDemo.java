package com.pengxy.demo.framewrok;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.IOException;
import java.io.InputStream;

/**
 * @program demo
 * @description: spring-framework
 * @author: pengxuanyu
 * @create: 2020/12/02 21:53
 */
public class LearningDemo {
    //ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    BeanFactory bf = new XmlBeanFactory(new ClassPathResource( "spring.xml"));
    Resource resource = new ClassPathResource("spring.xml");
    InputStream inputStream = resource.getInputStream();

    public LearningDemo() throws IOException {
    }
}
