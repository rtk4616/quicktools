package com.github.xbynet.ioc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;

/**
 * ioc容器
 */
public interface DependencyService {


    <T> T getBean(String name,Class<T> requiredType);

    <T> T getBean(Class<T> requiredType);

    Object getBean(String name);

    BeanFactory getBeanFactory();

    ApplicationContext getApplicationContext();

}
