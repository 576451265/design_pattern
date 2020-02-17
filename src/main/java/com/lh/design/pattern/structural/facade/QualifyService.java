package com.lh.design.pattern.structural.facade;

/**
 * @Description 积分资格校验子系统
 * @Author LuoH
 * @Date 2020-02-01 11:34
 */
public class QualifyService {
    //资格校验
    public boolean isAvailable(PointsGift pointsGift) {
        System.out.println("校验" + pointsGift.getName() + " 积分资格通过");
        return true;
    }
}
