package array_02;

import java.util.Arrays;

public class TwoArrayTest {
    public static void main(String[] args) {
        //1.数组的声名和初始化
        //复习：
        int[] arr1 = new int[]{1, 2, 3};
        //二维：方式1：静态初始化(数组变量的赋值以及数组元素的赋值同时进行)
        int[][] arr2 = new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};

        //方式二：动态初始化(数组变量的赋值和数组元素的赋值分开进行)
        String[][] arr3 = new String[3][4];

        double[][] arr4 = new double[2][];

        //其他正确的写法：
        int arr5 [][]= new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[] arr6 []= new int[][]{{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};
        int[][] arr7 = {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}};//类型推断
        String arr8 [][]= new String[3][4];

        //错误的写法：除了正确的其他都是错误的
//        int[][] arr9 = new int[3][3]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[3][3] arr10 = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        int[][] arr11 = new int[][10];

        //2.数组元素的调用
        /*
        针对于arr2来说，外层元素:{1, 2, 3}, {4, 5}, {6, 7, 8, 9}
        内层元素:1, 2, 3, 4, 5, 6, 7, 8, 9
         */
        //调用内层元素
        System.out.println(arr2[0][0]);// 1
        System.out.println(arr2[2][1]);// 7

        //调用外层元素
        System.out.println(arr2[0]);//输出的是一个地址 [I@1b6d3586

        //测试arr3 arr4
        arr3[0][1] = "Tom";
        System.out.println(arr3[0][1]);
        System.out.println(arr3[0]);//同样是一个地址 [Ljava.lang.String;@4554617c(其中L表示引用数据类型)


        arr4[0] = new double [4];
        arr4[0][0] = 1.0;



        //3.数组的长度  以arr2为例 {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}
        System.out.println(arr2.length);//输出的是外层数组的个数
        System.out.println(arr2[1].length);//输出的是指定外层数组的长度
        System.out.println(arr2[2].length);//输出的是指定外层数组的长度

        //4.如何遍历数组 以arr2为例 {{1, 2, 3}, {4, 5}, {6, 7, 8, 9}}
        for (int i = 0; i < arr2.length; i++){
            for (int j = 0; j < arr2[i].length; j++){
                System.out.print(arr2[i][j] + "\t");
            }
            System.out.println();
        }
        /*
        这两种方法也可以遍历
        第一种：
        for (int i = 0; i < arr2.length; i++){
            System.out.println(Arrays.toString(arr2[i]));
        }
        第二种：
        System.out.println(Arrays.deepToString(arr2));
        */

    }
}
