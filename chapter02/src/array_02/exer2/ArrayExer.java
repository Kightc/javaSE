package array_02.exer2;

public class ArrayExer {
    public static void main(String[] args) {
        int sum = 0;
        int[][] arr = new int[][]{{3, 5 , 8}, {12, 9}, {7, 0 , 6, 4}};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr[i].length; j++){
//                sum += arr[i][j];
//            }
//        }
        for (int[] ints : arr) {
            for (int anInt : ints) {
                sum += anInt;
            }
        }
        System.out.println("求和为:" + sum);

    }

}
