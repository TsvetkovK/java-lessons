public class This {
    public static void main(String[] args) {
        Human human1 = new Human();
    }
}

class Human{
    private String name;
    private int age;



    public Human(String name){
        System.out.println("Привет из первого конструктора");
        this.name = name;
    }

    public Human(){
        System.out.println("Привет из второго конструктора");
    }

    public Human(String name, int age){
        System.out.println("Привет из 3 конструктора");
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public int getAge(){
        return age;
    }

    public void getInfo(){
        System.out.println(name + " " + age);
    }
}
