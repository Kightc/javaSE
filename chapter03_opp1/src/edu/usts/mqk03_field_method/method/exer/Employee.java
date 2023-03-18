package edu.usts.mqk03_field_method.method.exer;

/**
 *Description:
 *声明员工类Employee，包含属性：编号id、姓名name、年龄age、薪资salary
 *
 * 声明Employee测试类，并在main方法中，创建2个员工对象，为其属性赋值，打印两个员工的信息
 *
 */
public class Employee {

    //属性
    int id;
    String name;
    int age;
    double salary;

    //定义一个方法，用于显示员工的属性信息
//    @Override
//    public String toString() {
//        return "Employee{" +
//                "id=" + id +
//                ", name='" + name + '\'' +
//                ", age=" + age +
//                ", salary=" + salary +
//                '}';
//    }
    public void show(){
        System.out.println("id = " + id + "\tname = " + name + "\tage = " +
                age + "\tsalary = " + salary);
    }
}
