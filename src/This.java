public class This {
    public static void main(String[] args) {

        Human human1 = new Human("BOB", 20);
        System.out.println(human1.toString());
    }
}

class Human{
    private String name;
    private int age;

    public static String desc;

    public String toString(){
        return name + ", " + age;
    }

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

    public static String getDesc(){
        return desc;
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

    public void getAllFields(){
        System.out.println(name + " " + age + " " + desc);
    }
}
