import java.util.Scanner;

public class Methods {
    public static void main(String[] args) {
        //Q SUM OF TWO NUM
       sum();                         //calling a function
    }

    static void sum() {
        Scanner inp = new Scanner(System.in);
        System.out.print("enter first number: ");
        int num1 = inp.nextInt();
        System.out.print("enter second number: ");
        int num2 = inp.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum is : " + sum);

    }
}
