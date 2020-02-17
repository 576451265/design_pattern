package com.lh.design.pattern.creational.prototype.clone;

import java.util.Date;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-30 11:17
 */
public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Date birthday = new Date(0L);
        Pig pig1 = new Pig("佩奇",birthday);
        Pig pig2 = (Pig) pig1.clone();
        System.out.println(pig1);
        System.out.println(pig2);
        /*
        Pig{name='佩奇', birthday=Thu Jan 01 08:00:00 CST 1970}com.lh.design.pattern.creational.prototype.clone.Pig@1540e19d
        Pig{name='佩奇', birthday=Thu Jan 01 08:00:00 CST 1970}com.lh.design.pattern.creational.prototype.clone.Pig@677327b6
         */

        /*
        只设置了pig1 pig2也变了 birthday是同一个对象 浅克隆
        要在Pig中的clone方法把birthday也clone一下（深克隆）
         */
        pig1.getBirthday().setTime(66666666666L);
        System.out.println(pig1);
        System.out.println(pig2);
        /*
        Pig{name='佩奇', birthday=Fri Feb 11 22:31:06 CST 1972}com.lh.design.pattern.creational.prototype.clone.Pig@1540e19d
        Pig{name='佩奇', birthday=Fri Feb 11 22:31:06 CST 1972}com.lh.design.pattern.creational.prototype.clone.Pig@677327b6
         */
    }
}
