package edu.usts.mqk03_field_method.method.exer;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        Employee p2 = new Employee();

        p1.id = 1;
        p1.name = "Kight";
        p1.age = 18;
        p1.salary = 8000.0;
//        System.out.println("id = " + p1.id + "\tname = " + p1.name + "\tage = " +
//                p1.age + "\tsalary = " + p1.salary);
        p1.show();

        p2.id = 2;
        p2.name = "Lucy";
        p2.age = 18;
        p2.salary = 8000.0;
//        System.out.println("id = " + p2.id + "\tname = " + p2.name + "\tage = " +
//                p2.age + "\tsalary = " + p2.salary);
        p2.show();
    }
}
