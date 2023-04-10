package edu.usts.kight.kight01_static;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/7 17:46
 * @Version 1.0
 */
public class ChineseTest {
    public static void main(String[] args) {
        Chinese c1 = new Chinese();
        c1.nation = "China";
        c1.name = "渣渣辉";
        c1.age = 50;
        Chinese c2 = new Chinese();
        c2.name = "金城武";
        c2.age = 50;

        System.out.println(c1.nation);
        System.out.println(c2.nation);

        c2.nation = "CHN";
        System.out.println(c1.nation);
        System.out.println(c2.nation);

        Chinese.show();
        c1.show();
    }

}
class Chinese{//中国人类
    //非静态变量、实例变量
    String name;
    int age;
    static String nation;

    @Override
    public String toString() {
        return "Chinese{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public void eat(String food){
        System.out.println("吃" + food);
    }
    public static void show(){
        System.out.println("我是中国人");
    }
    public void method(){
        System.out.println("我是非静态的测试方法");
        //调用非静态结构
        System.out.println("name = " + this.name);
        eat("红烧肉");

        //调用静态结构
        System.out.println("nation is" + nation);
        show();

    }
}