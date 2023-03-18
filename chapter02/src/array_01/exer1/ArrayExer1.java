package array_01.exer1;

import java.util.Scanner;

public class ArrayExer1 {
    public static void main(String[] args) {

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Scanner sc = new Scanner(System.in);
        System.out.print("请输入(1 - 7):");
        int number = sc.nextInt();
        System.out.println("Today is " + days[number - 1] + "!");
    }
}
