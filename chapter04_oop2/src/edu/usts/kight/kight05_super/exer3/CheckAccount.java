package edu.usts.kight.kight05_super.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/31 15:47
 * @Version 1.0
 */
public class CheckAccount extends Account {
    private double overdraft;//可透支的限额
    public CheckAccount(int id, double balance, double annualInterestRate){
        super(id, balance, annualInterestRate);
    }
    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft){
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    /**
     * 针对于可透支的账户的取钱操作
     * @param amount double 要取的钱的数量
     */
    public void withdraw(double amount){
        if(getBalance() >= amount){
            super.withdraw(amount);
        }else if(amount > getBalance() && amount - getBalance() <= overdraft){
            overdraft -= (amount - getBalance());
            System.out.println("你的信用卡透支了" + (amount - getBalance()) + "元");
            super.withdraw(getBalance());
        }else
            System.out.println("超过透支限额!");
    }
}
