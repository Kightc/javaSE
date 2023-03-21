package edu.usts.mqk07_encapsulation.exer3;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/19 15:56
 * @Version 1.0
 */
public class Employee {
    private String name;
    private int age;
    private char gender;
    private String telephone;

    public String getName(){
        return name;
    }
    public void setName(String n){
        name = n;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int a){
        age = a;
    }
    public char getGender(){
        return gender;
    }
    public void setGender(char g){
        gender = g;
    }
    public String getTelephone(){
        return telephone;
    }
    public void setTelephone(String t){
        telephone = t;
    }

    public String getInfo(){
        return name + "\t" + age + "\t" + gender + "\t" + telephone;
    }
}
