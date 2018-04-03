package com.github.xbynet.ioc.impl;

import com.github.xbynet.ioc.FactoryContainer;
import com.github.xbynet.ioc.FactoryRegisterItem;
import org.springframework.beans.factory.InitializingBean;

public abstract  class AbsFactoryRegisterItem<K,C> implements FactoryRegisterItem<K>,InitializingBean{

    @Override
    public void afterPropertiesSet() throws Exception{
        registe(getItemKey());
    }

    @Override
    public void registe(K key) {
        getFactoryContainer().register(key,(C)this,false);
    }

    public abstract K getItemKey();
    public abstract FactoryContainer<K,C> getFactoryContainer();
}
