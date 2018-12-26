package com.sjw.design.pattern.creational.singleton;

import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: Irelia
 * @Date: 2018/11/29 01:06
 * @Description: 容器模式的单例类
 **/
public class ContainerSingleton {

    private ContainerSingleton(){

    }

    //通过Map来保证单例
    private static Map<String,Object> singletonMap = new HashMap<>();

    public static void putInstance(String key,Object instance){
        if(StringUtils.isNotBlank(key) && instance != null){
            if(!singletonMap.containsKey(key)){
                singletonMap.put(key,instance);
            }
        }
    }

    public static Object getInstance(String key){
        return singletonMap.get(key);
    }


}
