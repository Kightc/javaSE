package edu.usts.kight.kight06_polymorphism.apply;

/**
 * Description:
 *
 * @Author Kight
 * @Date 2023/4/3 15:16
 * @Version 1.0
 */
public class AnimalTest {

    public static void main(String[] args) {
        AnimalTest test = new AnimalTest();
        test.adopt(new Dog());
    }
    public void adopt(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.jump();

    }
}
class Animal{
    public void eat(){
        System.out.println("动物进食");
    }
    public void jump(){
        System.out.println("动物跳");
    }
}
class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }
    public void jump(){
        System.out.println("dog jump");
    }
    public void watchDoor(){
        System.out.println("狗看家");
    }
}
class Cat{
    public void eat(){
        System.out.println("cat eat");
    }
    public void jump(){
        System.out.println("cat jump");
    }
    public void catchMouse(){
        System.out.println("猫捉老鼠");
    }
}
