package array_common_algorithm.exer2;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr1 = {5, 4, 6, 8, 9, 0, 1, 3, 7, 3};
        double score = (double) (sumNum(arr1) - maxNum(arr1) - minNum(arr1)) / 8;
        System.out.println("得分为:" + score);
    }

    public static int maxNum(int[] arr) {
        int maxNum = 0;
        for (int j : arr) {
            maxNum = Math.max(j, maxNum);
        }
        return maxNum;
    }

    public static int minNum(int[] arr) {
        int minNum = 100;
        for (int j : arr) {//强化for循环
            minNum = Math.min(j, minNum);//调用函数
        }
//        for (int i = 0; i < arr.length; i++) {
//            minNum = arr[i] < minNum ? minNum : arr[i];
//        }
        return minNum;
    }

    public static int sumNum(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        return sum;
    }
}
