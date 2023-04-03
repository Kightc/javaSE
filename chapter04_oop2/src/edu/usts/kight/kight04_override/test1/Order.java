package edu.usts.kight.kight04_override.test1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/3/28 22:38
 * @Version 1.0
 */
public class Order {
    private int orderPrivate;
    int orderDefault;
    protected int orderProtected;
    public int orderPublic;

    private void methodPrivate(){}
    void methodDefault(){}
    protected void methodProtected(){}
    public void methodPublic(){}

    public void show(){
        orderPrivate= 1;
        orderDefault = 1;
        orderProtected = 1;
        orderPublic = 1;

        methodPrivate();
        methodDefault();
        methodProtected();
        methodPublic();
    }
}
