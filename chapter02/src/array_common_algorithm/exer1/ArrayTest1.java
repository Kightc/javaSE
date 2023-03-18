package array_common_algorithm.exer1;

import java.util.Arrays;

public class ArrayTest1 {
    public static void main(String[] args) {
        int[] arr1 = new int[10];
        for (int i = 0; i < 10; i++) {
            int num1 = (int) (Math.random() * 90) + 9;
            arr1[i] = num1;
        }
        //展示生成的数组
        System.out.println(Arrays.toString(arr1));
        System.out.println("最大值为:" + maxNum(arr1));
        System.out.println("最小值为:" + minNum(arr1));
        System.out.println("总和为:" + sumNum(arr1));
        System.out.println("平均值为:" + averageNum(sumNum(arr1)));
    }

    //求最大值
    public static int maxNum(int[] arr) {
        int maxNum = 0;
        for (int j : arr) {
            maxNum = Math.max(j, maxNum);
        }
//        for (int i = 0; i < arr.length; i++) {
//            maxNum = arr[i] > maxNum ? arr[i] : maxNum;
//        }
        return maxNum;
    }

    //求最小值
    public static int minNum(int[] arr) {
        int minNum = 100;
        for (int j : arr) {//强化for循环
            minNum = Math.min(j, minNum);//调用函数
        }
//        for (int i = 0; i < arr.length; i++) {
//            minNum = arr[i] < minNum ? minNum : arr[i];
//        }
        return minNum;
    }

    //求和
    public static int sumNum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }

    //求平均值
    public static double averageNum(int sumNum) {
        double average;
        average = (double) sumNum / 10;
        return average;
    }
}
