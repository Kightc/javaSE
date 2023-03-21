

public class RandomTest {
    public static void main(String[] args) {
        double a1 = Math.random();

        //random调用以后会随机生成范围在[0.0,1.0)的一个double型随机数
        System.out.println("a1=" + a1);
        int a = 3;
        int b =100;
        //获取指定范围的随机整数[a,b]
         int a2 = (int)(Math.random() * (b - a + 1) + a);
        System.out.println("a2=" + a2);

    }
}
