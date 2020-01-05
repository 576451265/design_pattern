package com.lh.design.principle.demeter;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 17:55
 */
public class Test {
    public static void main(String[] args) {
        Boss boss = new Boss();
        TeamLeader teamLeader = new TeamLeader();
        boss.commendCheckNumber(teamLeader);
    }
}
