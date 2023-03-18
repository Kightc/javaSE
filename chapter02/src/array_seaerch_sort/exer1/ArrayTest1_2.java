package array_seaerch_sort.exer1;


import java.util.Arrays;

//需求见./数组的缩容.txt
public class ArrayTest1_2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int deleteIndex = 4;
        //方式1：不新建数组
        for (int i = deleteIndex; i < arr.length - 1; i++) {
                arr[i] = arr[i +1];
        }
        //修改最后元素，设为默认值0
        arr[arr.length - 1] = 0;

        //方式2：新建数组，新建数组的长度比原有数组的长度少一
//        int[] arr1 = new int[arr.length - 1];
//        for (int i = 0; i < arr1.length; i++) {
//            if (i >= deleteIndex) {
//                arr[i] = arr[i + 1];
//            }
//            arr1[i] = arr[i];
//        }
//        arr = arr1;
        System.out.println(Arrays.toString(arr));
    }
}
