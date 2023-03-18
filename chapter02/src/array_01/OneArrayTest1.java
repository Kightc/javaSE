package array_01;

import java.util.Arrays;

public class OneArrayTest1 {
    //static int[] arr1;
    public static void main(String[] args) {
        //数组元素的默认初始化值
//      整型数组元素的默认初始化值：0
        int[] arr1 = new int[3];
        System.out.println(Arrays.toString(arr1));
//      浮点型数组元素的默认初始化值：0.0
        double[] arr2 = new double[3];
        System.out.println(Arrays.toString(arr2));
//      字符型数组元素的默认初始化值：0 - '\u0000'
        char[] arr3 = new char[3];
        System.out.println(Arrays.toString(arr3));
        if (arr3[0] == 0) {
            System.out.println("找到了");
        }
//      boolean型数组元素的默认初始化值：false
        boolean[] arr4 = new boolean[3];
        System.out.println(Arrays.toString(arr4));
//      引用数据类型数组元素的默认初始化值：null
        String[] arr5 = new String[3];
        System.out.println(Arrays.toString(arr5));

        //数组的内存解析
        int[] a1 = new int[]{1, 2, 3};
        int[] a2 = a1;
        a2[1] = 10;
        System.out.println(a1[1]);
        System.out.println(a1);
        System.out.println(a2);


    }
}
