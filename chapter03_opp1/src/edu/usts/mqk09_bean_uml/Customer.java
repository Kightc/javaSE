package edu.usts.mqk09_bean_uml;


import java.sql.DatabaseMetaData;
import java.sql.Date;

/**
 * Description:
 *  所谓JavaBean，是指符合如下标准的Java类
 *  类是公共的
 *  含有无参的公共的构造器
 *  有属性且有对应的 get() set()方法
 *
 * @Author Kight
 * @Date 2023/3/26 16:19
 * @Version 1.0
 */
public class Customer {
    private int id;
    private String name;
    private String email;
    private Date birth;

    public Customer(){

    }

    public int getId() {
        return id;
    }

    public void setId(int i) {
        id = i;
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String e) {
        email = e;
    }

    public Date getBirth() {
        return birth;
    }

    public void setBirth(Date b) {
        birth = b;
    }
}
