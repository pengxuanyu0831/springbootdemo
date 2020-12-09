package com.pengxy.NotionDemo.Test;
import org.springframework.beans.factory.xml.AbstractSingleBeanDefinitionParser;
import org.w3c.dom.Element;


public class StudentBeanDefinitionParser extends AbstractSingleBeanDefinitionParser {
    protected class getBeanClass(Element element){
        return Student.class;
    }
    protected void doParse(){

    }

}
