package edu.usts.mqk08_constructor;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/18 16:44
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        System.out.println(1);
        Animal animal1 = new Animal();
        animal1.name = "金蟾";
        animal1.setLegs(4);
        System.out.println("name = " + animal1.name + " legs = " + animal1.getLegs());
        animal1.eat();
    }
}
class Animal{
    String name;
    private int legs;//private声明为私有的，外部想要直接调用时调用不出的，外部只能通过setLegs()方法来间接的赋值
    String dada;
    //获取legs的属性值
    public int  getLegs(){
        return legs;
    }

    //设置legs的属性值
    public void setLegs(int l){
        if(l >= 0 && l % 2 == 0){
            legs = l;
        }
        else
            System.out.println("您输入的数不合法,请重新输入:");
    }

    public void eat(){
        System.out.println("动物觅食");
    }
}
