package com.lh.design.principle.singleresponsibility;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 17:12
 */
public class Bird {
    public void mainMoveMode(String name) {
        if ("鸵鸟".equals(name)){
            System.out.println(name + "用脚走");
        }else {
            System.out.println(name + "飞");
        }
    }
}
