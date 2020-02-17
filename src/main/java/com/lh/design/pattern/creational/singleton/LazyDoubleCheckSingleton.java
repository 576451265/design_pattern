package com.lh.design.pattern.creational.singleton;

/**
 * @Description 懒汉式 双重检查 方案一
 * @Author LuoH
 * @Date 2020-02-04 10:05
 */
public class LazyDoubleCheckSingleton {
    //volatile 禁止重排序 所有内存都能看到共享内存的状态 保证内存的可见性
    //缓存一致性协议
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;
    private LazyDoubleCheckSingleton(){
    }
    public static LazyDoubleCheckSingleton getInstance(){
        if (lazyDoubleCheckSingleton == null){//断点1
            synchronized (LazyDoubleCheckSingleton.class){
                if (lazyDoubleCheckSingleton == null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();//断点2
                    //1.分配内存给这个对象
                    //2.初始化对象
                    //3.设置lazyDoubleCheckSingleton只想刚分配的内存对象 //23互换位置不会改变执行结果
                    //所有的线程在执行java程序时遵守
                    // intra-thread semantics 保证重排序 不改变单线程内的程序执行结果
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}
