package edu.usts.kight.kight07_object.equals.apply;

/**
 * Description:
 *  说明：判断两个Customer对象是否equals()，除了Customer类需要重写equals()之外，其内部的类类型的属性
 *  所在的类，也需要重写equals()
 * @Author Kight
 * @Date 2023/4/6 22:27
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 20, new Account(2000));
        Customer c2 = new Customer("Tom", 20, new Account(2000));
        System.out.println(c1.equals(c2));
    }
}
