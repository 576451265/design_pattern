package com.lh.design.principle.depenceinversion;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 16:44
 */
public class Test {
    public static void main(String[] args) {
        /*V1 面向实现
        Kim kim = new Kim();
        kim.studyJavaCourse();
        kim.studyFECourse();
         */
        /* //V2面向接口
        Kim kim = new Kim();
        kim.studyCourse(new JavaCourse());
        kim.studyCourse(new FECourse());
        kim.studyCourse(new PythonCourse());
         */

        /*//V3构造器
        Kim kim = new Kim(new JavaCourse());
        kim.studyCourse();
         */

        Kim kim = new Kim(new JavaCourse());
        kim.setCourse(new PythonCourse());
        kim.studyCourse();

    }
}
