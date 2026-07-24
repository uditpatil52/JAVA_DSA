import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = inp.nextLine();

        System.out.println("Enter your age: ");
        int age = inp.nextInt();

        System.out.println("Enter your percentage: ");
        float per = inp.nextFloat();
    }

}
