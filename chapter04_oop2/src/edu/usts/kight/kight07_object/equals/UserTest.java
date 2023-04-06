package edu.usts.kight.kight07_object.equals;

import java.util.Objects;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/6 20:18
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User("Tom", 12);
        User u2 = new User("Tom", 12);
        System.out.println(u1.equals(u2));// false--->true

        String str = new String("hello");
        String str1 = new String("hello");
        System.out.println(str == str1);
        System.out.println(str.equals(str1));
    }
}
class User{
    String name;
    int age;
    public User(){

    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //重写equals()方法  手动实现
    @Override
    public boolean equals(Object obj) {
        if (this == obj){
            return true;
        }
        if (obj instanceof User){
            User user = (User)obj;
            return this.age == user.age && this.name.equals(user.name);
        }
        return false;
    }
    //IDEA自动生成
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name);
//    }

}