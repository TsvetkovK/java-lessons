import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi vozrast");
        int age = scanner.nextInt();
        switch (age){
            case 0:
                System.out.println("Ты не родился");
                break;
            case 7:
                System.out.println("Shkola");
                break;
            case  18:
                System.out.println("Yniver");
                break;
            default:
                System.out.println("Net ysloviya");
        }
    }
}
