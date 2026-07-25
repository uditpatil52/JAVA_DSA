//import java.util.Scanner;
//
//public class Input {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String name = inp.nextLine();
//
//        System.out.println("Enter your age: ");
//        int age = inp.nextInt();
//
//        System.out.println("Enter your percentage: ");
//        float per = inp.nextFloat();
//    }
//
//}


//Write a program that takes two numbers from the user (as int), and prints their sum.
//import java.util.Scanner;
//
//public class Input {
//    public static void main(String[] args) {
//        Scanner opt = new Scanner(System.in);
//
//        System.out.println("enter 1st num : ");
//        int num1 = opt.nextInt();
//
//        System.out.println("enter 2nd num : ");
//        int num2 = opt.nextInt();
//
//        int sum = num1 + num2;
//        System.out.println(sum);
//    }
//}


import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner op = new Scanner(System.in);

        System.out.print("enter your name :");
        String name = op.nextLine();

        System.out.print("enter your marks : ");
        double marks = op.nextDouble();

        System.out.println("name: "  + name + ", Marks : " + marks);
    }
}
//
//Predict the output of this code:
//
//int a = 4;
//int b = 6;
//System.out.println("Result: " + a + b); //46
//System.out.println("Result: " + (a + b));//10
