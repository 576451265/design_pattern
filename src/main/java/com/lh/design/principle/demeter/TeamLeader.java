package com.lh.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 17:51
 */
public class TeamLeader {
    public void checkNumberOfCourse(){
        List<Course> courseList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseList.add(new Course());
        }
        System.out.println("在线课程的数量是" + courseList.size());
    }
}
