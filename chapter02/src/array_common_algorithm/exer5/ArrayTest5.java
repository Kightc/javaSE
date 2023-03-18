package array_common_algorithm.exer5;

import java.util.Arrays;

public class ArrayTest5 {
    public static void main(String[] args) {
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int[] arr1 = {1, 2, 3, 4, 5};
        //方法一
//        int[] arr1 = new int[arr.length];
//        int j = 0;
//        for (int i = arr.length - 1; i >= 0 ; i--) {
//            arr1[j++] = arr[i];
//        }
//        System.out.println(Arrays.toString(arr1));
        //方法二  用一个指针遍历
        int balance = 0;
        for (int i = 0; i < arr1.length / 2; i++) {
            balance = arr1[i];
            arr1[i] = arr1[arr1.length - 1 - i];
            arr1[arr1.length - 1 - i] = balance;
        }
        //方法三 用两个指针调用
        //这个就很优雅了
//        int start = 0, end = arr.length - 1;
//        while(start < end){
//            int temp = arr[start];
//            arr[start] = arr[end];
//            arr[end] = temp;
//            start++;
//            end--;
//        }
        System.out.println(Arrays.toString(arr1));
    }
}
