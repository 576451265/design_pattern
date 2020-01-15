package com.lh.design.pattern.creational.factorymethod;

/**
 * @Description:
 * @author LuoH
 * @date 2020/01/15
 */
public class PythonVideoFactory extends VideoFactory{
    @Override
    public Video getVideo() {
        return new PythonVideo();
    }
}
