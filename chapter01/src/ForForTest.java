/*
嵌套循环的使用
1.嵌套循环：是指一个循环结构A的循环体是另一个循环结构B
    外层循环：循环结构A
    内存循环：循环结构B
2.说明：
    1）内层循环充当了外层循环的循环体
    2）对于两层嵌套循环来说，外层循环控制行数，内层循环控制列数


 */





public class ForForTest {
    public static void main(String[] args) {
        //需求1：打印出一行个数为6的 *
//        for (int i = 0; i < 6; i++){
//            System.out.print('*');
//        }
//        System.out.println("\n————————————————");
        //需求2：打印出5，每行个数为6的 *
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 6; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        System.out.println("——————————————");
        //需求3;斜坡打印 *
        /*
            *
            **
            ***
            ****
            *****
         */
//        for (int i = 0; i < 5; i++){
//            for (int j = 0 ; j <= i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
//        System.out.println("——————————————");
        //需求4：将需求3的图形颠倒
        /*
            *****
            ****
            ***
            **
            *
         */
//        for (int i = 0; i < 5; i++){
//            for (int j = 0; j < 5 - i; j++){
//                System.out.print('*');
//            }
//            System.out.println();
//        }
        //需求5：打印出如下图形
            /*
                         *
                       * * *
                     * * * * *
                   * * * * * * *
                 * * * * * * * * *
                   * * * * * * *
                     * * * * *
                       * * *
                         *
             */

        for (int i = 1; i <= 9; i++){
            if ( i <= 5){
                for (int j = 1; j <= 9 - (2 * i -1); j++){
                    System.out.print(" ");
                }
                for (int j = 1; j <= 2 * i - 1; j++){
                    System.out.print("* ");
                }
            }
            else{
                for (int j = 1; j <= 9 - (-2 * i + 19); j++){
                    System.out.print(" ");
                }
                for (int j =1; j <= -2 * i + 19; j++){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }

        //需求6：打印九九乘法表
        for (int i = 1; i <= 9 ; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j + "*" + i + "=" +j * i + "\t");
            }
            System.out.println();
        }

    }
}
