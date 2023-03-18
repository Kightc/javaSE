package edu.usts.mqk03_field_method.field;

public class FieldTest {
    public static void main(String[] args) {

    }
}

class Person{

    //属性（或成员变量）
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        String food = "红烧肉";//局部变量
        System.out.println("我喜欢吃" + food);
    }

    public void sleep(int hour){//形参  也属于局部变量
        System.out.println("每天睡" + hour + "小时");

        //编译不通过，因为超出了food的作用域
//        System.out.println("我喜欢吃" + food);
        System.out.println("name = " + name);//编译通过，在name的作用域内部
    }
}