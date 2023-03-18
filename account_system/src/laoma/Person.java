package laoma;

public class Person {
    Phone phone;
    String name;
    int age;
    char gender;

    public Person(Phone phone, String name, int age, char gender) {
        this.phone = phone;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Person() {

    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "phone=" + phone +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
