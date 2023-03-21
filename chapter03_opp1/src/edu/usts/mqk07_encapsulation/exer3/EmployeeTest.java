package edu.usts.mqk07_encapsulation.exer3;

import java.util.Scanner;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 16:04
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入员工人数:");
        int n = sc.nextInt();//员工的人数
        //创建Employee类型的数组
        Employee[] employeeArray = new Employee[n];
        for (int i = 0; i < employeeArray.length; i++) {
            employeeArray[i] = new Employee();
            System.out.println("------添加第" + (i + 1) + "个员工------");
            System.out.println("姓名:");
            String name = sc.next();
            employeeArray[i].setName(name);

            System.out.println("年龄:");
            int age = sc.nextInt();
            employeeArray[i].setAge(age);

            System.out.println("性别:");
            char gender = sc.next().charAt(0);
            employeeArray[i].setGender(gender);

            System.out.println("电话:");
            String phoneNumber = sc.next();
            employeeArray[i].setTelephone(phoneNumber);
        }
        System.out.println("编号" + "\t姓名" + "\t年龄" + "\t性别" + "\t电话");
        for (int i = 0; i < employeeArray.length; i++) {
            System.out.println(i + 1 +"\t" + employeeArray[i].getInfo());
        }
    }
}
