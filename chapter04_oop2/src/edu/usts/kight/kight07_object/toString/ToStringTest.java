package edu.usts.kight.kight07_object.toString;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/7 15:25
 * @Version 1.0
 */
public class ToStringTest {
    public static void main(String[] args) {
        User u1  = new User("Kight", 20);
        System.out.println(u1.toString());
    }
}
class User{
    String name;
    int age;

    public User() {

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

//    @Override
//    public String toString() {
//        return "User{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';
//    }
}
