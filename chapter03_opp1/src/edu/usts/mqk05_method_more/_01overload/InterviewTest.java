package edu.usts.mqk05_method_more._01overload;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/13 16:51
 * @Version 1.0
 */
public class InterviewTest {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3};
        System.out.println(arr);//地址值

        char[] arr1 = new char[]{'a', 'b', 'c', 'd'};
        System.out.println(arr1);//abc  因为println()方法有参数为char[] 其中的方法体为打印其中的元素

        boolean[] arr3 = new boolean[]{false, true, true};
        System.out.println(arr3);//地址值
    }
}
