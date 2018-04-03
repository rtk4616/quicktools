package com.github.xbynet.ioc.impl;

import com.github.xbynet.ioc.ClassAlias;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public abstract class AbsGlobalBeanFactory<K,T extends ClassAlias> extends AbsFactoryContainer<K,T>
 implements BeanPostProcessor{

    private static final Logger log= LoggerFactory.getLogger(AbsGlobalBeanFactory.class);

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof ClassAlias && isAccept(bean,beanName)){
            String key=((T)bean).getClassAlias();
            register((K)key,(T)bean,false);

        }
        return bean;
    }

    protected abstract boolean isAccept(Object bean,String beanName);
}
