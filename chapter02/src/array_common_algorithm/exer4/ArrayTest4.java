package array_common_algorithm.exer4;

import java.util.Arrays;

public class ArrayTest4 {
    public static void main(String[] args) {
        int[] arr1,arr2;
        arr1 = new int[]{2, 3, 5, 7, 11, 13, 17, 19};
        System.out.println(Arrays.toString(arr1));
        System.out.println(arr1);
        //赋值
//        arr2 = arr1;
//        for (int i = 0; i < arr2.length; i += 2) {
//            arr2[i] = i;
//        }
//        System.out.println(Arrays.toString(arr1));
        //复制
//        arr2 = new int[8];
//        for (int i = 0; i < arr1.length; i++) {
//            arr2[i] = arr1[i];
//        }
        arr2 = Arrays.copyOf(arr1,arr1.length);
        System.out.println(Arrays.toString(arr2));
        System.out.println(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }

}
