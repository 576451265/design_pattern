package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class JavaArticle extends Article{

    @Override
    public void produce() {
        System.out.println("编写Java手记");
    }
}
