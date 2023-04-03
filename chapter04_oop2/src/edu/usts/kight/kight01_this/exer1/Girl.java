package edu.usts.kight.kight01_this.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/27 14:21
 * @Version 1.0
 */
public class Girl {
    private String name;
    private int age;
    public Girl(){

    }
    public Girl(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void marry(Boy boy){
        System.out.println("我要嫁给" + boy.getName() + "!");
        boy.marry(this);
    }

    /**
     * 比较两个Girl对象的大小
     * @param girl Girl
     * @return 正数：当前对象大， 负数：当前对象小(或形参对象大， 0：相等
     */
    public int compare(Girl girl){
        if(this.age > girl.age)
            return 1;
        else if(this.age < girl.age)
            return -1;
        else
            return 0;
    }
}
