package com.pengxy.demo;

import org.springframework.beans.BeansException;
import org.springframework.beans.MutablePropertyValues;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;

/**
 * @program demo
 * @description: bean definition test
 * @author: pengxuanyu
 * @create: 2020/12/05 18:47
 */
public class BeanDefinitionTest implements BeanDefinitionRegistryPostProcessor {

    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry beanDefinitionRegistry) throws BeansException {
        GenericBeanDefinition genericBeanDefinition = new GenericBeanDefinition();
        genericBeanDefinition.setBeanClass(BeanTest.class);
        
        MutablePropertyValues mutablePropertyValues = genericBeanDefinition.getPropertyValues();
        mutablePropertyValues.addPropertyValue("username","bill");
        beanDefinitionRegistry.registerBeanDefinition("beanTest",genericBeanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
    }
}
