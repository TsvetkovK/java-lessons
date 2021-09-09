public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.name = "Per";
        person1.age = 10;
        person2.name = "Ewe";
        person2.age = 30;
        person1.speak();
        person2.speak();


    }
}

class Person{
    String name;
    int age;

    void speak(){
        System.out.println(name + " " + age);
    }
}