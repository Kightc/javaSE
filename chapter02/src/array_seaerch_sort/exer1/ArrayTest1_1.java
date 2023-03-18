package array_seaerch_sort.exer1;

import java.util.Arrays;

public class ArrayTest1_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] arr1 = new int[arr.length << 1];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[i];
        }
        arr1[5] = 10;
        arr1[6] = 20;
        arr1[7] = 30;
        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }
}
