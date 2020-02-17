package com.lh.design.pattern.creational.singleton;

/**
 * @Description: 普通的懒汉式
 * @author LuoH
 * @date 2020/01/18
 */
public class Test {
    public static void main(String[] args) {
        //LazySingleton lazySingleton = LazySingleton.getInstance();
        Thread thread1 = new Thread(new T());
        Thread thread2 = new Thread(new T());
        thread1.start();
        thread2.start();
        System.out.println("program end");//断点
    }
}
