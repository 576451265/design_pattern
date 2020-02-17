package com.lh.design.pattern.creational.prototype.abstractprototype;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-30 11:13
 */
public abstract class A implements Cloneable{
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
