package com.lh.design.pattern.creational.singleton;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/18
 */
public class T implements Runnable {
    @Override
    public void run() {
        //LazySingleton lazySingleton = LazySingleton.getInstance();//断点
//        System.out.println(Thread.currentThread().getName() + "  " + lazySingleton);
//        LazyDoubleCheckSingleton instance = LazyDoubleCheckSingleton.getInstance();
        StaticInnerClassSingleton instance = StaticInnerClassSingleton.getInstance();
        System.out.println(Thread.currentThread().getName() + "  " + instance);
    }
}
