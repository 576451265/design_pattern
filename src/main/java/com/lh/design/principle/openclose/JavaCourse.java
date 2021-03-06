package com.lh.design.principle.openclose;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 16:10
 */
public class JavaCourse implements ICourse {
    private Integer id;
    private String name;
    private Double price;

    public JavaCourse(Integer id, String name, Double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Integer getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Double getPrice() {
        return this.price;
    }

//    public Double getDiscountPrice() {
//        return this.price*0.8;
//    }
}
