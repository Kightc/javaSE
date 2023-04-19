package edu.usts.kight.kight07_abstract.exer2;

import java.util.Scanner;

/**
 * Description:
 *  定义PayrollSystem类，创建Employee变量数组并初始化，该数组存放各类雇员对象的引用。
 *     利用循环结构遍历数组元素，输出各个对象的类型, name , number , birthday ,以及该对象生日。
 *     当键盘输入本月月份值时，如果本月是某个Employee对象的生日，还要输出增加工资信息。
 * @Author Kight
 * @Date 2023/4/19 16:25
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] emps = new Employee[2];
        Scanner sc = new Scanner(System.in);
        emps[0] = new SalariedEmployee("Kight", 1001,
                new MyDate(2001, 4,8), 8000);
        emps[1] = new HourlyEmployee("Lucy", 1002,
                new MyDate(2001, 1, 1), 200, 40);

        System.out.println("请输入当前的日期(具体为哪一天):");
        int day = sc.nextInt();
        for (Employee emp : emps) {
            if(day == emp.getBirthday().getDay()){
                System.out.println(emp.getName() + "生日快乐! 加薪100!");
                System.out.println(emp);
                System.out.println("工资为:" + (emp.earnings() + 100));
                continue;
            }
            System.out.println(emp);
            System.out.println("工资为:" + emp.earnings());


        }

    }
}
