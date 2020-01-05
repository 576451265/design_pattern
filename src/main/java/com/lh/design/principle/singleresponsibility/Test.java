package com.lh.design.principle.singleresponsibility;

/**
 * @Description 单一职责原则测试类
 * @Author LuoH
 * @Date 2020-01-05 17:13
 */
public class Test {
    public static void main(String[] args) {
        /*
        Bird bird = new Bird();
        bird.mainMoveMode("二毛");
        bird.mainMoveMode("鸵鸟");
         */
        FlyBird flyBird = new FlyBird();
        flyBird.mainMoveMode("二毛");
        WalkBird walkBird = new WalkBird();
        walkBird.mainMoveMode("鸵鸟");
    }
}
