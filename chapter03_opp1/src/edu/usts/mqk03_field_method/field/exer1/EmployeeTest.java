package edu.usts.mqk03_field_method.field.exer1;


public class EmployeeTest {
    public static void main(String[] args) {
        Employee p1 = new Employee();
        Employee p2 = new Employee();

        p1.id = 01;
        p1.name = "Kight";
        p1.age = 18;
        p1.salary = 8000.0;
        System.out.println("id = " + p1.id + "\tname = " + p1.name + "\tage = " +
                p1.age + "\tsalary = " + p1.salary);

        p2.id = 02;
        p2.name = "Lucy";
        p2.age = 18;
        p2.salary = 8000.0;
        System.out.println("id = " + p2.id + "\tname = " + p2.name + "\tage = " +
                p2.age + "\tsalary = " + p2.salary);

    }
}
