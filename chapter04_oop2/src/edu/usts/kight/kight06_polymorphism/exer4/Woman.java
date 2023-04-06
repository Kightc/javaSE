package edu.usts.kight.kight06_polymorphism.exer4;

/**
 * Description:
 *  (3)在Woman类中，包含
 *     ①重写上面的方法
 *     ②增加public void makeup():打印化妆
 * @Author Kight
 * @Date 2023/4/5 18:03
 * @Version 1.0
 */
public class Woman extends Person{
    public void eat(){
        System.out.println("woman eat");
    }
    public void toilet(){
        System.out.println("woman toilet");
    }
    public void makeup(){
        System.out.println("化妆");
    }
}
