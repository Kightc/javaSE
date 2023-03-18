package laoma;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Phone phone = new Phone("vivo", 100, 10);
        Phone phone = new Phone();
        Person person = new Person();

        person.setName(sc.next());
        String name1 = person.getName();
        System.out.println(person);
        System.out.println(name1);
        //System.out.println(phone);
    }
}
