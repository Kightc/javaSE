package array_01;

public class OneArrayTest {
    public static void main(String[] args) {

        //1. 数组的声明和初始化
        //复习：变量的定义格式：数据类型 变量名  = 变量值
        int num = 10;
        int num1;//声名
        num1 = 0;//初始化

        //声名数组
        double[] prices;
        //数组的初始化
        //静态初始化：数组变量的赋值与数组元素的操作同时进行。
        prices = new double[]{20.32, 43.22, 22.22};

        //动态初始化：数组变量的赋值与数组元素的操作分开进行。
        String[] food;
        food = new String[4];

        //其他的方式
        int arr[] = new int[4];
        int arr1[] = new int[]{1, 2, 3, 4};
        int arr2[] = {1, 2, 3, 4};

        //错误的方式
        //int arr3[] = new int[3]{1,2,3};
//        int [3] arr4 = new int[];


        //2，数组元素的调用
        //通过角标的方式来获取数组的元素
        //角标的范围：[0,数组长度 - 1] 刻画的是偏移量
        System.out.println(prices[0]);
        System.out.println(prices[1]);
        System.out.println(prices[2]);
        //System.out.println(prices[3]);报错：角标越界 ArrayIndexOutOfBoundsException
        food[0] = "红烧肉:";
        food[1] = "章鱼烧";
        food[2] = "宫保鸡丁";
        food[3] = "小炒肉";
        //3.数组的长度:用来描述数组容器中容量的大小
        System.out.println(food.length);
        System.out.println(prices.length);



        //4.如何遍历数组
        for(int i = 0; i <= 2; i++){
            System.out.println(food[i]);
        }

    }
}
