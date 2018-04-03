package com.github.xbynet.ioc.impl;

import com.github.xbynet.ioc.DependencyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.Resource;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
public class DynamicBeanResolver {

    private Logger log= LoggerFactory.getLogger(DynamicBeanResolver.class);

    @Autowired
    private DependencyService dependencyService;

    public void dynamicLoadBean(String configLocationString){
        try {
            dynamicLoadBean(dependencyService.getApplicationContext().getResources(configLocationString));
        } catch (IOException e) {
            log.error("dynamicLoadBean occur errors",e);
        }
    }

    public void dynamicLoadBean(Resource... resources){
        XmlBeanDefinitionReader beanDefinitionReader=new XmlBeanDefinitionReader(
            (BeanDefinitionRegistry)dependencyService.getBeanFactory());
        beanDefinitionReader.loadBeanDefinitions(resources);
    }

}
