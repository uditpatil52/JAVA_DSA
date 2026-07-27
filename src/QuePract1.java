//import java.util.Scanner;
//
//public class QuePract1{
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int n = sc.nextInt();
//
//        boolean isPrime = true;
//
//        if (n <= 1) {
//            isPrime = false;
//        }
//
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//                break;
//            }
//        }
//
//        if (isPrime) {
//            System.out.println(n + " is prime");
//        } else {
//            System.out.println(n + " is not prime");
//        }
//    }
//}


import java.util.Scanner;

public class QuePract1 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.println("enter a number : ");
        int n = inp.nextInt();

        int reversed = 0;

        while(n!=0){
            int digit = n % 10 ;
            reversed = reversed *10 + digit;
            n = n / 10;
        }
        System.out.println(reversed);
    }
}