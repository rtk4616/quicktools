package com.github.xbynet.ioc.impl;

import com.github.xbynet.ioc.FactoryContainer;
import com.github.xbynet.model.enums.ErrorMsgEnum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.Assert;

import java.util.concurrent.ConcurrentHashMap;

public abstract class AbsFactoryContainer<K,C> implements FactoryContainer<K,C> {

    private static Logger log= LoggerFactory.getLogger(AbsFactoryContainer.class);

    private volatile ConcurrentHashMap<K,C> itemMap=new ConcurrentHashMap<>();

    @Override
    public C get(K key) {
        Assert.notNull(key, ErrorMsgEnum.NotNull.getMsg());
        return itemMap.get(key);
    }

    @Override
    public void register(K key, C item, boolean canOverride) {
        Assert.notNull(key,ErrorMsgEnum.NotNull.getMsg());
        if(itemMap.get(key) ==null || canOverride) {
            itemMap.put(key, item);
            log.info("register key: {} ,class: {}",key,item.getClass().getName());
        }

    }
}
