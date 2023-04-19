package edu.usts.kight.kight07_abstract.exer2;

/**
 * Description:
 *  该类包括：private成员变量monthlySalary；
 *     捏供必要的构造器
 *     实现父类的抽象方法earnings()，该方法返回monthlySalary值；
 *     toString()方法输出员工类型信息及员工的name，number，birthday
 * @Author Kight
 * @Date 2023/4/19 16:06
 * @Version 1.0
 */
public class SalariedEmployee extends Employee {
    private double monthlySalary;//月工资

    public SalariedEmployee() {
    }

    public SalariedEmployee(String name, int number, MyDate birthday, double monthlySalary) {
        super(name, number, birthday);
        this.monthlySalary = monthlySalary;
    }

    public double getMonthlySalary() {
        return monthlySalary;
    }

    public void setMonthlySalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double earnings(){
        return this.monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee:[" + super .toString() + "]";
    }
}
