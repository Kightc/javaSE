package edu.usts.kight.kight06_polymorphism.exer4;

/**
 * Description:
 *  (2)在 Man类中，包含
 *     ①重写上面的方法
 *     ②增加public void smoke():打印抽烟
 * @Author Kight
 * @Date 2023/4/5 18:01
 * @Version 1.0
 */
public class Man extends Person {
    public void eat(){
        System.out.println("man eat!");
    }
    public void toilet(){
        System.out.println("man toilet");
    }
    public void smoke(){
        System.out.println("抽烟");
    }
}
