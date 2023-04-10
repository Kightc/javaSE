package edu.usts.kight.kight04_block.exer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/10 13:39
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Kight", "654321:");
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }

}
