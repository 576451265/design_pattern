package com.lh.design.principle.singleresponsibility;

/**
 * @Description
 * @Author LuoH
 * @Date 2020-01-05 17:27
 */
public class Method {
    private void updateUserInfo(String userName,String adress){
        userName = "hao";
        adress = "BJ";
    }
    private void updateUserInfo(String userName,String... properties){//可变常数
        userName = "hao";
    }
    private void updateUserName(String userName){
        userName = "hao";
    }
    private void updateUserAdress(String adress){
        adress = "BJ";
    }
}
