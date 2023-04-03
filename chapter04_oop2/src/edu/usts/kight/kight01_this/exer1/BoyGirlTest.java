package edu.usts.kight.kight01_this.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 15:03
 * @Version 1.0
 */
public class BoyGirlTest {
    public static void main(String[] args) {
        Boy boy1 = new Boy("Kight", 20);
        Girl girl1 = new Girl("Lucy", 20);
        girl1.marry(boy1);

        Girl girl2 = new Girl("Nancy", 22);
        System.out.println(girl1.compare(girl2));
    }
}
