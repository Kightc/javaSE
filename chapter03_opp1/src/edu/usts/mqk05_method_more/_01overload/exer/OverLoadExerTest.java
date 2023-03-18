package edu.usts.mqk05_method_more._01overload.exer;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 15:01
 * @Version 1.0
 */
public class OverLoadExerTest {
    public static void main(String[] args) {
        OverLoadExer testOL = new OverLoadExer();
        testOL.mOL(1);
        testOL.mOL("Kight");
        testOL.mOL(1, 2);
        System.out.println("最大值为:" + testOL.max(13, 14));
        System.out.println("最大值为:" + testOL.max(4.0, 7.0));
        System.out.println("最大值为:" + testOL.max(2.0, 6.0, 5.0));
    }


}
