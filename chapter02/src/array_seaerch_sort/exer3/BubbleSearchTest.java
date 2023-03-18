package array_seaerch_sort.exer3;

import java.util.Arrays;

public class BubbleSearchTest {
    public static void main(String[] args) {
        //冒泡排序，实现数组元素从小到大排列
        int[] arr = new int[]{34, 54, 3, 2, 65, 7, 34, 5, 76, 34, 67};
        int location = arr.length - 1;
        //方式一：
//        while(location > 0) {
//            for (int i = 0; i < location; i++) {
//                if (arr[i] > arr[i + 1]) {
//                    int temp = arr[i];
//                    arr[i] = arr[i + 1];
//                    arr[i + 1] = temp;
//                }
//            }
//            location--;
//        }
        //方式一的优化：
        while(location > 0) {
            boolean flag = true;//默认数组已经是有序的了
            for (int i = 0; i < location; i++) {
                if (arr[i] > arr[i + 1]) {//一旦发现顺序不对便执行此语句
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                    flag = false;//防止跳出循环
                }
            }
            /*
            当上面的for循环执行完了后没有执行其中得if语句，说明数组的顺序在这一次的for循环中是有序的了
            不需要再location-- 然后再一次的进入while循环中
            而是执行if(flag)中的break直接跳出while循环，避免了while循环的后续冗余，从而达到了优化代码的作用
             */

            if(flag){
                break;
            }
            location--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
