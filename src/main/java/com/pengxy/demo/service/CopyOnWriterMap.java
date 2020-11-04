package com.pengxy.demo.service;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CopyOnWriterMap<K,V> implements Map<K,V>,Cloneable {
    private volatile Map<K,V> interMap;

    public CopyOnWriterMap(){
        interMap = new HashMap<>();
    }

    public V put(K key,V value){
        synchronized (this){
            Map<K,V> newMap = new HashMap<>(interMap);
            V val = newMap.put(key,value);
            interMap = newMap;
            return val;
        }
    }

    @Override
    public V remove(Object key) {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public boolean containsKey(Object key) {
        return false;
    }

    @Override
    public boolean containsValue(Object value) {
        return false;
    }

    public V get(Object key){
        return interMap.get(key);
    }

    public void putAll(Map<? extends K, ? extends V> newData){
        synchronized (this){
            Map<K,V> newmap = new HashMap<K,V>(interMap);
            newmap.putAll(newData);
            interMap = newmap;
        }
    }

    @Override
    public void clear() {

    }

    @Override
    public Set<K> keySet() {
        return null;
    }

    @Override
    public Collection<V> values() {
        return null;
    }

    @Override
    public Set<Entry<K, V>> entrySet() {
        return null;
    }


}
