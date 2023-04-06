package edu.usts.kight.kight01_this.exer2;


/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 15:16
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;//用于保存多个客户
    private int numberOfCustomer;//用于记录存储的客户的个数
    public Bank(){
        customers =new Customer[10];
    }

    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * @param f String
     * @param l String
     */
    public void addCustomer(String f, String l){
        Customer customer = new Customer(f, l);
        customers[numberOfCustomer] = customer;
        numberOfCustomer++;
    }

    /**
     * 获取指定索引位置上的客户
     * @param index int
     * @return
     */
    public Customer getCustomer(int index) {
        if(index < 0 || index >= numberOfCustomer){
            return null;
        }
        return customers[index];
    }

    /**
     * 获取客户列表中存储客户的个数
     * @return
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }
}
