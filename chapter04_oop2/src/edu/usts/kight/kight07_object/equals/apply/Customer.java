package edu.usts.kight.kight07_object.equals.apply;

import java.util.Objects;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/6 22:26
 * @Version 1.0
 */
public class Customer {
    private String name;
    private int age;
    private Account account;

    public Customer() {

    }

    public Customer(String name, int age, Account account) {
        this.name = name;
        this.age = age;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name) && Objects.equals(account, customer.account);
    }

}
