package edu.usts.kight.kight06_polymorphism;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/3 14:23
 * @Version 1.0
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("woman 干饭");
    }
    public void walk(){
        System.out.println("woman walk walk walk!!!");
    }
    public void goShopping(){
        System.out.println("woman go Shopping");
    }
}
