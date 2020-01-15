package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class JavaVideo extends Video{

    @Override
    public void produce() {
        System.out.println("录制Java课程");
    }
}
