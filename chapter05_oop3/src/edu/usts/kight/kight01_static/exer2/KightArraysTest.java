package edu.usts.kight.kight01_static.exer2;

import java.util.Arrays;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/10 17:48
 * @Version 1.0
 */
public class KightArraysTest {
    public static void main(String[] args) {
        
        int[] arr = {3, 4, 2, 8, 5, 4, 6, 2, 9, 2, 3};
        int[] arr1 = {1, 2, 3, 5, 6, 7, 8, 9};
        //最大值
        int maxNum = KightArrays.getMax(arr);
        System.out.println("maxNum = " + maxNum);
        //最小值
        int minNum = KightArrays.getMin(arr);
        System.out.println("minNum = " + minNum);
        //求和
        int sumNum = KightArrays.getSum(arr);
        System.out.println("sumNum = " + sumNum);
        //求平均值
        int aveNnm = KightArrays.getAverage(arr);
        System.out.println("aveNnm = " + aveNnm);
        //遍历数组并打印
        System.out.println("遍历出的数组为:");
        System.out.println(Arrays.toString(KightArrays.reverse(arr)));
        //打印出最初数组的地址值
        System.out.printf("一开始数组的地址值为：%s", arr + "\n");
        //打印出复制出来的数组地址值
        System.out.printf("复制出数组的地址值为：%s",KightArrays.duplicate(arr) + "\n");
        //反转数组并打印
        System.out.println("数组反转后为:");
        System.out.println(Arrays.toString(KightArrays.reverse(arr)));
        //数组排序并打印
        System.out.println("数组排序后为:");
        System.out.println(Arrays.toString(KightArrays.sort(arr)));
        //数组的查找
        KightArrays.getNum(arr1,6);

    }
}
