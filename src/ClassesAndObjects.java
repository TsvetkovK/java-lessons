public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        Person person2 = new Person();
        person1.setName("фыфыв");
        person1.setAge(-1);
        System.out.println(person1.getName());


        person1.speak();
        person2.speak();
        person1.sayHello();
        int year1 = person1.yearsTo();
        System.out.println(year1);




    }
}

class Person{
    private String name;
    private int age;

    int yearsTo(){
        int years = 65 - age;
        return years;
    }

    public void setName(String name){
        if(name.isEmpty()){
            System.out.println("Ошибка имени");
        } else{
            this.name = name;
        }
    }

    public void setAge(int age){
        if(age < 0){
            System.out.println("Ошибка возраста");
        } else{
            this.age = age;
        }
    }

    public String getName(){
        return name;
    }


    void sayHello() {
        System.out.println("Привет!");
    }

    void speak(){
        System.out.println(name + " " + age);
    }
}

