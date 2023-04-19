package edu.usts.kight.kight04_block.exer;


import java.util.Date;

/**
 * Description:
 *  （1）声明User类,
 * 包含属性：userName(String类型），password(String类型），registrationTime（long类型）私有化
 *
 * 包含get/set方法，其中registrationTime&有set方法
 * @Author Kight
 * @Date 2023/4/10 13:32
 * @Version 1.0
 */
public class User {
    private String userName;
    private String password;
    private long registrationTime;
    public User(){
        System.out.println("新用户注册");
//        Date date = new Date(System.currentTimeMillis());
//        registrationTime = date;
        registrationTime = System.currentTimeMillis();//获取当前时间(距离1970-1-1-00:00到现在的毫秒数)
        userName = System.currentTimeMillis() + " ";
        password = "123456";
    }
    public User(String userName, String password){
        System.out.println("新用户注册");
        registrationTime = System.currentTimeMillis();
        this.userName = userName;
        this.password = password;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public long getRegistrationTime() {
        return registrationTime;
    }
    public String getInfo(){
        return "用户名: " + this.userName + ", 密码: " + this.password + ", 注册时间" + this.registrationTime;
    }
}
