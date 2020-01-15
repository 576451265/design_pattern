package com.lh.design.pattern.creational.abstractfactory;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class PythonArticle extends Article{

    @Override
    public void produce() {
        System.out.println("编写Python手记");
    }
}
