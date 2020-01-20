package com.lh.design.pattern.creational.singleton;

/**
 * @Description: 懒汉单例
 * @author LuoH
 * @date 2020/01/18
 */
public class LazySingleton {
    private static LazySingleton lazySingleton = null;
    private LazySingleton(){

    }
    //线程不安全 单线程ok 多线程不行
    public static LazySingleton getInstance(){
        if (lazySingleton == null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

}
