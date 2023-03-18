package edu.usts.mqk01_oop;

public class Phone {

    //属性
    String name;//品牌
    double price;//价格



    //方法
    public void call(){
        System.out.println("手机可以打电话");
    }


     public void sendMessage(String message){
        System.out.println("手机可以发信息");
    }

    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
}
