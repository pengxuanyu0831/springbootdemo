package com.pengxy.demo.framewrok;



import com.sun.jndi.toolkit.url.Uri;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import java.io.File;
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

    private void scanPackage(String packageName){
        Uri uri = this.getClass().getClassLoader().getResource(replaceTo(packageName));
        String file  = uri.getFile();
        File f = new Fill(file);

        String[] list = f.list();
        for(String path : list){
            File filePath = new File(file + path);
            if(filePath.isDirectory()){
                // 递归
                scanPackage(packageName + '.' + path);
            }else {
                classNames.add(packageName + '.'+path);
            }
        }
    }
}