package edu.usts.kight.kight06_polymorphism.exer4;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/5 18:22
 * @Version 1.0
 */
public class Exer4 {
    public static void main(String[] args) {
        Person ps = new Man();
        Person ps1 = new Woman();
        meeting(ps,ps1);
    }
    public static void meeting(Person... ps){
        for (int i = 0; i < ps.length; i++) {
            ps[i].eat();
            ps[i].toilet();
            if(ps[i] instanceof Man){
                Man man = (Man)ps[i];
                man.smoke();
            }else if(ps[i] instanceof Woman){
                Woman woman = (Woman)ps[i];
                woman.makeup();
            }
            System.out.println();
        }

    }



}
