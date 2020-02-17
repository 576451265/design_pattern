package com.lh.design.pattern.creational.singleton;

/**
 * @Description 静态内部类 基于类初始化的延迟加载解决方案
 * @Author LuoH
 * @Date 2020-02-04 10:51
 */
public class StaticInnerClassSingleton {
    //private static 中new类对象 且为private static
    private static class InnerClass {
        private static StaticInnerClassSingleton staticInnerClassSingleton = new StaticInnerClassSingleton();
    }
    //对外开放这个对象的获取方法
    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.staticInnerClassSingleton;
    }
    //私有构造器必须要有，否则外部可以new
    private StaticInnerClassSingleton() {
    }
}
