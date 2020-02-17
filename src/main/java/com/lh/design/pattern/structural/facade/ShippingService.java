package com.lh.design.pattern.structural.facade;

/**
 * @Description 物流子系统
 * @Author LuoH
 * @Date 2020-02-01 11:39
 */
public class ShippingService {
    public String shipGit(PointsGift pointsGift) {
        //物流系统的对接逻辑
        System.out.println(pointsGift.getName() + "进入物流系统");
        String shippingOrderName = "666";
        return shippingOrderName;
    }
}
