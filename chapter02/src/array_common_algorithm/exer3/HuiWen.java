package array_common_algorithm.exer3;

import java.util.Scanner;

public class HuiWen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入任意正整数:");
        int len = sc.nextInt();
        int[][] arr = new int[len][len];
        int maxNum = len * len;
        int k = 1;
        /*
        k = 1:向右
        k = 2:向下
        k = 3:向左
        k = 4:向上
         */
        int i = 0, j = 0;
        for (int l = 1; l <= maxNum; l++) {
            //向右
            if (k == 1){
                if (j < len && arr[i][j] == 0){
                    arr[i][j++] = l;
                }
                else {
                    k = 2;
                    i++;
                    j--;
                    l--;
                }
                //向下
            } else if (k == 2) {
                if (i < len && arr[i][j] == 0){
                    arr[i++][j] = l;
                }
                else {
                    k = 3;
                    i--;
                    j--;
                    l--;
                }
                //向左
            } else if (k == 3) {
                if (j >= 0 && arr[i][j] == 0){
                    arr[i][j--] = l;
                }
                else {
                    k = 4;
                    j++;
                    i--;
                    l--;
                }
            }
            else if (k == 4){
                if(i >= 0 && arr[i][j] == 0){
                    arr[i--][j] = l;
                }
                else {
                    k = 1;
                    i++;
                    j++;
                    l--;
                }
            }
        }
        for (int m = 0; m < arr.length; m++) {
            for (int n = 0; n < arr.length; n++) {
                System.out.printf("%d\t",arr[m][n]);
            }
            System.out.println();
        }
    }
}
