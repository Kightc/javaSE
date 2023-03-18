package edu.usts.mqk02_memory;

public class Person {

    //属性
    String name;
    int age;
    char gender;


    //方法
    public void eat(){
        System.out.println("人吃饭");
    }

    public void sleep(int hour){
        System.out.println("一天睡" + hour + "小时保持健康");
    }

    public void interests(String hobby){
        System.out.println("我的爱好是:" + hobby);
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
