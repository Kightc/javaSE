package array_common_algorithm.exer3;

public class ArrayTest3 {
    public static void main(String[] args) {
        //创建二维数组
        int[][] arr1 = new int[10][];
        //补全数组
        for (int i = 0; i < 10; i++) {
            arr1[i] = new int[i + 1];//此时内层数组元素的值为0
            //开始赋值
            for (int j = 0; j < arr1[i].length; j++) {
                if (i > 1 && j > 0 && j < arr1[i].length - 1) {
                    arr1[i][j] = arr1[i - 1][j - 1] + arr1[i - 1][j];
                } else {
                    arr1[i][0] = arr1[i][i] = 1;//每行第一列和最后一列的元素为1
                }
            }
//            System.out.println(Arrays.toString(arr1[i]));
        }
//        System.out.println(Arrays.deepToString(arr1));
        //开始打印
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                System.out.printf("%d\t", arr1[i][j]);
            }
            System.out.println();
        }
    }
}
