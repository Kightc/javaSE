package edu.usts.kight.kight06_polymorphism.exer2;



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
//        test.adopt(new Cat());
    }
    public void adopt(Animal animal){//Animal animal = new Dog();
        animal.eat();
        animal.jump();
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            dog.watchDoor();
        }else {
            Cat cat = (Cat)animal;
            cat.catchMouse();
        }

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
class Cat extends Animal{
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
