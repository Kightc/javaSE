package edu.usts.kight.kight06_polymorphism.exer1;

import java.util.jar.Manifest;

/**
 * Description:
 *  定义一个测试类GeometricTest
 *     编写equalsArea方法测试两个对象的面积是否相等(注意方法的参数类型)
 *     编写displayGeometricObject方法显示对象的面积(注意方法的参数类型)
 * @Author Kight
 * @Date 2023/4/5 15:25
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args) {
        GeometricTest test = new GeometricTest();
        Circle c1 = new Circle(2.0, "red", 1.0);
        Circle c2 = new Circle(3.0, "blue", 1.0);
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        boolean isEqual = test.equalsArea(c1, c2);
        if(isEqual){
            System.out.println("面积相等");
        }
        else {
            System.out.println("面积不等");
        }
        //使用匿名对象
        test.displayGeometricObject(new MyRectangle("black", 1, 3, 4));
    }
    /**
     * 比较两个几何图形的面积是否相等
     * @param g1
     * @param g2
     * @return true:表示面积相等  false:表示面积不相等
     */
    public boolean equalsArea(GeometricObject g1, GeometricObject g2){
        return g1.findArea() == g2.findArea();
    }

    /**
     * 显示几何图形的面积
     * @param g
     */
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为:" + g.findArea());//动态绑定

    }
}
