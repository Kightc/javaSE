package array_common_algorithm.exer3;

import java.util.Arrays;

public class ArrayTest {
    public static void main(String[] args) {
//        int[] arr = {1, 1, 4, 4, 4, 1};
        int[] arr = new int[6];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * 6 + 1);
            //方法一:
//            boolean flag = false;
//            while(true){
//                for (int j = 0; j < i; j++) {
//                    if (arr[i] == arr[j]){
//                        flag = true;
//                        break;
//                    }
//                }
//                if(flag){
//                    arr[i] = (int)(Math.random() * 30 +1);
//                    flag = false;
//                    continue;
//                }
//                break;
//            }
            //方法二:(更优化的方法）
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]){
                    i--;
                    break;
                }
            }
        }
/*

          这种方式其实是错误的
//        for (int i = 0; i < 6; i++) {
//            for (int j = i + 1; j < 6; j++) {
//                while(arr[i] == arr[j]){
//                    arr[j] = (int)(Math.random() * 7 + 1);
//                }
//            }
//        }

 */
        System.out.println(Arrays.toString(arr));

    }
}
