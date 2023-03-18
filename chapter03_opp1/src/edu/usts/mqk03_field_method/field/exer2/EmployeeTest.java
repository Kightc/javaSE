package edu.usts.mqk03_field_method.field.exer2;


/**
 * Description:
 *     在EmployeeTest测试类中的main()中，创建两个员工对象，并未他们的姓名和生日赋值，并显示
 * @Author Kight
 * @Date 2023/3/7 18:18
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        p1.name = "Kight";
        p1.birthday = new MyDate();
        p1.birthday.year = 2002;
        p1.birthday.month = 4;
        p1.birthday.day = 8;
        System.out.println("姓名:" + p1.name + "\t生日:" + p1.birthday.year + "年" + p1.birthday.month +
                "月" + p1.birthday.day + "日");
    }
}
