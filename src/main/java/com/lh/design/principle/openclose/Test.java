package com.lh.design.principle.openclose;

/**
 * @Description 开闭原则测试类
 * @Author LuoH
 * @Date 2020-01-05 16:12
 */
public class Test {
    public static void main(String[] args) throws Exception{
        ICourse javaCourse = new JavaCourse(1, "java课程", 32d);
        System.out.println("课程id：" + javaCourse.getId() + "课程名称：" + javaCourse.getName() + "课程价格：" + javaCourse.getPrice());

        ICourse javaDiscountCourse = new JavaDiscountCourse(1, "java课程", 32d);
        System.out.println("课程id：" + javaDiscountCourse.getId() + "课程名称：" + javaDiscountCourse.getName() + "课程价格：" + javaDiscountCourse.getPrice());

        ICourse iCourse = new JavaDiscountCourse(2, "java课程2", 348d);
        JavaDiscountCourse javaCourse2 = (JavaDiscountCourse) iCourse;
        System.out.println("课程id：" + javaCourse2.getId() + "课程名称：" + javaCourse2.getName() + "课程折前价格：" + javaCourse2.getOriginPrice() + "课程折后价格：" + javaCourse2.getPrice());
    }
}
