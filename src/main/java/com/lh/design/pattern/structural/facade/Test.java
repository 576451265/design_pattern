package com.lh.design.pattern.structural.facade;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-02-01 18:29
 */
public class Test {
    public static void main(String[] args) {
        PointsGift pointsGift = new PointsGift("T恤");
        GiftExchangeService giftExchangeService = new GiftExchangeService();
/*
        //GiftExchangeService中new了就不用了
        giftExchangeService.setQualifyService(new QualifyService());
        giftExchangeService.setPointsPaymentService(new PointsPaymentService());
        giftExchangeService.setShippingService(new ShippingService());
*/
        giftExchangeService.giftExchange(pointsGift);
    }
}
