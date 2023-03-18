package edu.usts.mqk03_field_method.method;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/8 21:13
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args) {

    }
}

class Person{
    //属性
    String name;
    int age;
    char gender;

    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人一天要睡" + hour + "小时");
    }

    public String  interests(String hobby){
        String info = "我的爱好是:" + hobby;
        System.out.println(info);
        return info;
    }

    public int getAge(){
        return age;
    }
}
