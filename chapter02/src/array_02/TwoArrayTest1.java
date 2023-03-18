package array_02;

public class TwoArrayTest1 {
    public static void main(String[] args) {

        //5.二维数组元素的默认初始化
        //动态初始化方式1
        int[][] arr = new int [3][2];
        //外层元素默认值
        System.out.println(arr[0]);//是一个地址
        System.out.println(arr[1]);//是一个地址
        //内层元素默认值
        System.out.println(arr[0][0]);// 0

        boolean[][] arr2 = new boolean[3][4];
        //外层元素默认值
        System.out.println(arr2[0]);//地址值
        //内层元素默认值
        System.out.println(arr2[0][1]);//false

        String[][] arr3 = new String[3][4];
        //外层元素默认值
        System.out.println(arr3[1]);//地址值
        //内层元素默认值
        System.out.println(arr3[1][1]);// null
        System.out.println("——————————————————————————————");


        //动态初始化方式2
        int[][] arr4 = new int[4][];
        //外层元素默认值
        System.out.println(arr4[0]);//null
        //内层元素默认值
//        System.out.println(arr4[0][0]);//报错
        String[][] arr5 = new String[5][];
        //外层元素默认值
        System.out.println(arr5[0]);//null
        //内层元素默认值
//        System.out.println(arr5[0][0]);//报错



        //6.二维数组的内存解析
    }
}
