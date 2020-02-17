package com.lh.design.pattern.creational.singleton;

/**
 * @Description 饿汉式
 * @Author LuoH
 * @Date 2020-02-04 11:04
 */
public class HungrySingleton {
   private final static HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton() {
    }


}
