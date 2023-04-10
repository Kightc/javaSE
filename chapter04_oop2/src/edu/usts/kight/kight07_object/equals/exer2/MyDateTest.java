package edu.usts.kight.kight07_object.equals.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/7 15:15
 * @Version 1.0
 */
public class MyDateTest {
    public static void main(String[] args) {
        MyDate m1 = new MyDate(8, 4, 2023);
        MyDate m2 = new MyDate(8, 4, 2023);
        if (m1 == m2){
            System.out.println("m1 == m2");
        }else{
            System.out.println("m1 != m2");
        }
        if(m1.equals(m2)){
            System.out.println("m1 is equal to m2");
        }else{
            System.out.println("m1 is not equal to m2");
        }
    }
}
