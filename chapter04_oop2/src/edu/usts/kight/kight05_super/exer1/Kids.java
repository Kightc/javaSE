package edu.usts.kight.kight05_super.exer1;

/**
 * Description:
 *  修改方法重写的练习2中定义的类Kids中的employeed()方法，在该方法中调用父类ManKind的employeed()方法
 *     然后再输出"but Kids should study and no job."
 * @Author Kight
 * @Date 2023/3/28 21:31
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;

    public Kids() {

    }

    public Kids(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids(int sex, int salary, int yearsOld) {
        this.yearsOld = yearsOld;
        setSex(sex);
        setSalary(salary);
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public void printAge() {
        System.out.println("岁数为:" + this.yearsOld);
    }
    @Override
    public void employeed(){
        super.employeed();
        System.out.println("but Kids should study and no job.");
    }
}




