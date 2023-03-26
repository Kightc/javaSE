package edu.usts.mqk08_constructor.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/22 15:33
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        //创建Customer实例 customer
        Customer customer = new Customer("Jane", "Smith");

        //创建Account实例 account
//        Account account = new Account(1000, 2000.0, 0.0123);

        //将Account实例account的地址值赋给Customer实例customer的Account类型的属性account
//        customer.setAccount(account);
        customer.setAccount(new Account(1000, 2000.0, 0.0123));//其中括号里面的称为匿名对象

        //对customer的账户进行相关操作
        customer.getAccount().deposit(100);
        customer.getAccount().withdraw(960);
        customer.getAccount().withdraw(2000);

        //输出客户的信息
        System.out.println("Customer [" + customer.getFirstName() + " " + customer.getLastName() + "] " +
                "has an account: id is " + customer.getAccount().getId() + ", " + "balance is " +
                customer.getAccount().getBalance() + ", " + "annualInterestRate is " +
                customer.getAccount().getAnnualInterestRate());

        /**
         * 关于匿名对象
         * 1.匿名对象往往只能被调用一次
         * 2.匿名对象往往作为实参传递给方法的形参
         */
    }
}
