package com.pengxy.NotionDemo.Test;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.springframework.util.StringUtils;
import org.w3c.dom.Element;


public class StudentBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    protected Class getBeanClass(Element element){
        return Student.class;
    }
    // 从element中提取元素信息
    protected void doParse(Element element, BeanDefinitionBuilder beanDefinition){
        String studentName = element.getAttribute("studentName");
        String studentSex = element.getAttribute("studentSex");
        if(StringUtils.hasText(studentName)){
            beanDefinition.addPropertyValue("studentName",studentName);
        }
        if(StringUtils.hasText(studentSex)){
            beanDefinition.addPropertyValue("studentSex",studentSex);
        }
    }

}
