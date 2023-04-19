package edu.usts.kight.kight06_final;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/18 14:10
 * @Version 1.0
 */
public class FinalTest {
    public static void main(String[] args) {
        E e = new E();
        System.out.println(e.MIN_SCORE);
    }
}


final class A{

}
//class b extends A{
//
//}报错：final修饰的类不能被继承


class C{
    final public void method(){

    }
}

class D extends C{
//    public void method(){
//
//    }报错：被final修饰的方法不能被重写
}

class E{
    //成员变量
     int MIN_SCORE = 0;
    final int MAX_SCORE;
    final int LEFT;
    {
        MAX_SCORE = 100;
    }
    public E(){
        LEFT = 2;
    }
    public E(int left){
        this.LEFT = left;
    }
}