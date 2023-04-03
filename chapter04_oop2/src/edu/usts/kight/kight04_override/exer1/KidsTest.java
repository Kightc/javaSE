package edu.usts.kight.kight04_override.exer1;



/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 21:33
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args) {
        Kids someKid = new Kids();
        someKid.setSex(1);
        someKid.setSalary(8000);
        someKid.setYearsOld(20);
        someKid.manOrWoman();
        someKid.employeed();
        someKid.printAge();
    }
}
