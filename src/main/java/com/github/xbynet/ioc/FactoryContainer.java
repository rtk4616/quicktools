package com.github.xbynet.ioc;

public interface FactoryContainer<K,C> {

    C get(K key);

    void register(K key, C item, boolean canOverride);
}
