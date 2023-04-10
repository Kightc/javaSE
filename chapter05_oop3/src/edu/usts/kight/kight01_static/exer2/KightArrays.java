package edu.usts.kight.kight01_static.exer2;

/**
 * Description:
 * 自定义一个操作int[]的工具类
 * 涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、数组排序（默认从小到大）、
 * 查找等
 *
 * @Author Kight
 * @Date 2023/3/10 15:53
 * @Version 1.0
 */
public class KightArrays {
    //求最大值
    public static int getMax(int[] arr) {
        int maxNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] >= maxNum) {
                maxNum = arr[i];
            }
        }
        return maxNum;
    }

    //求最小值
    public static int getMin(int[] arr) {
        int minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] <= minNum) {
                minNum = arr[i];
            }
        }
        return minNum;
    }

    //求和
    public static int getSum(int[] arr) {
        int sumNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            sumNum += arr[i];
        }
        return sumNum;
    }

    //求平均值
    public static int getAverage(int[] arr) {
//        int aveNum = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            aveNum += arr[i];
//        }
        return getSum(arr) / arr.length;
    }

    //遍历数组
    public static void traverse(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
    }

    //复制数组
    public static int[] duplicate(int[] arr) {
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        return arr1;
    }

    //数组的反转
    public static int[] reverse(int[] arr) {
        int k = arr.length - 1, temp = 0;
        for (int j = 0; j <= k; j++) {
            temp = arr[j];
            arr[j] = arr[k];
            arr[k] = temp;
            k--;
        }
        return arr;
    }

    //数组的排序 用冒泡排序来写
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean flag = true;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = false;
                }
            }
            if (flag) {
                break;
            }
        }
        return arr;
    }

    //查找  用二分查找来写
    public static void getNum(int[] arr, int num) {
        int head = 0;
        int end = arr.length - 1;
        int mid = (head + end) / 2;
        while (head <= end) {
            if (arr[mid] > num) {
                end = mid - 1;
            } else if (arr[mid] < num) {
                head = mid + 1;
            } else {
                break;
            }
            mid = (head + end) / 2;
        }

        if (head > end) {
            System.out.println("要查找的数不在此数组中");
        } else {
            System.out.printf("需要查找的数在数组中的位置为：%s", mid);
        }
    }
}
