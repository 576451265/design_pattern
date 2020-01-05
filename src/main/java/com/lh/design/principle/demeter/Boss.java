package com.lh.design.principle.demeter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 17:51
 */
public class Boss {
    //不管course 只管tm
    public void commendCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourse();
    }
}
