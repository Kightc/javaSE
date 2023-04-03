package edu.usts.kight.kight05_super.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/30 11:24
 * @Version 1.0
 */
public class Account {
    private int id;
    private double balance;//余额
    private double annualInterestRate;//年利率

    public Account(){

    }
    public Account(int id, double balance, double annualInterestRate){
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    /**
     * 获得月利率
     * @return
     */
    public double getMonthlyInterest(){
        return annualInterestRate / 12;
    }

    /**
     * 取钱
     * @param amount double
     */
    public void withdraw(double amount){
        if(balance < amount) {
            System.out.println("账户余额不足");
        }else{
            balance -= amount;
            System.out.println("取款成功!");
        }
    }

    /**
     * 存钱
     * @param amount double
     */
    public void deposit(double amount){
        if(amount < 0){
            System.out.println("你输入的数字有误!");
        }
        else
            balance += amount;
    }
}
