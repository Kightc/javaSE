package edu.usts.kight.kight07_abstract.exer1;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/5 14:44
 * @Version 1.0
 */
public abstract class GeometricObject {
    protected String color;
    protected double weight;
    protected GeometricObject(){

    }
    protected GeometricObject(String color, double weight){
        this.color = color;
        this.weight = weight;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
    public abstract double findArea();

}
