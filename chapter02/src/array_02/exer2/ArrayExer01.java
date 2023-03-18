package array_02.exer2;

public class ArrayExer01 {
    public static void main(String[] args) {
        // = 赋值符号
        int i = 10;
        int j = i;
        byte b = (byte)i;//强制类型转换
        long l = i;//自动类型提升
        /*
        总结：
        如果想要两个数组之间相互赋值，那么这两个数组的类型以及维数要是相同的
         */
        //举例 数组：
        int[] arr1 = new int[10];
        byte[] arr2 = new byte[20];
//        arr1 = arr2;//编译不通过  原因：int[]   byte[] 是两种不同类型的引用变量
        int[][] arr3 = new int[3][4];
//        arr3 = arr1;//编译不通过

        arr3[0] = arr1;//两者同类型
        System.out.println(arr3[0]);
        System.out.println(arr1);

        //案例：声明 int[] x, y[];在给x, y变量赋值以后，以下选项允许通过编译的是：
        //x:一维 int[]   y:二维 int[][]
        /*
        a) x[0] = y         no
        b) y[0] = x         yes
        c) y[0][0] = x      no
        d) y[0][0] = x[0]   yes
        f) x = y;

        b d两个选项可以通过编译
         */

    }
}
