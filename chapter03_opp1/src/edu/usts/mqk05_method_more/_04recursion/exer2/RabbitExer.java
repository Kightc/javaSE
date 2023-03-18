package edu.usts.mqk05_method_more._04recursion.exer2;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/17 21:40
 * @Version 1.0
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer test = new RabbitExer();
        int month = 24;
        System.out.println("兔子的对数为:" + test.getRabbit(month));
    }

    public int getRabbit(int month){
        if(month == 1){
            return 1;
        }else if(month == 2){
            return 1;
        }
        else{
            return getRabbit(month -1) + getRabbit(month - 2);
        }
    }
}
