package edu.usts.kight.kight01_this.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 14:14
 * @Version 1.0
 */
public class Boy {
    private String name;
    private int age;
    public Boy(){

    }
    public Boy(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public void marry(Girl girl){
        System.out.println("我要娶" + girl.getName() + "为妻!");
    }
    public void shout(){
        if(this.age >= 22)
            System.out.println("我终于可以结婚了");
        else
            System.out.println("我只能多谈恋爱了");
    }
}
