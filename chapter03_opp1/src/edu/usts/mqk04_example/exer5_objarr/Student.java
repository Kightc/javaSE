package edu.usts.mqk04_example.exer5_objarr;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/11 15:34
 * @Version 1.0
 */
public class Student {
    //属性
    int number;//学号
    int state;//年级
    int score;//成绩

    @Override
    public String toString() {
        return "Student{" +
                "number=" + number +
                ", state=" + state +
                ", score=" + score +
                '}';
    }
}
