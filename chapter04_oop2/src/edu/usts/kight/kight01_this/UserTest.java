package edu.usts.kight.kight01_this;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/26 17:41
 * @Version 1.0
 */
public class UserTest {

}
class User{
    String name;
    int age;

    public User(){
        //模拟创建对象时，需要初始化50行代码
    }
    public User(String name){
        //模拟创建对象时，需要初始化50行代码
        this();
        this.name = name;
    }
    public User(String name, int age){
        //模拟创建对象时，需要初始化50行代码
        this(name);
        this.name = name;
        this.age = age;
    }
}
