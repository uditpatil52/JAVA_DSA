//import java.util.Scanner;

//public class Methods {
//    public static void main(String[] args) {
//      //Q SUM OF TWO NUM
//       sum();                         //calling a function
//   }
//
//    static void sum() {
//        Scanner inp = new Scanner(System.in);
//        System.out.print("enter first number: ");
//        int num1 = inp.nextInt();
//        System.out.print("enter second number: ");
//        int num2 = inp.nextInt();
//        int sum = num1 + num2;
//        System.out.println("the sum is : " + sum);
//
//    }
//}



//public class Methods {
//    public static void main(String[] args) {
//        greeting();
//    }
//    static void greeting(){
//        System.out.println("Good Evening");
//    }
//
//}

//import java.util.Scanner;
//
//public class Methods {
//    public static void main(String[] args) {
//      //Q SUM OF TWO NUM
//      int ans = sum();
//        System.out.println(ans);
//   }
//
//    static int sum() {
//        Scanner inp = new Scanner(System.in);
//        System.out.print("enter first number: ");
//        int num1 = inp.nextInt();
//        System.out.print("enter second number: ");
//        int num2 = inp.nextInt();
//        int sum = num1 + num2;
//        return sum;               // it will be over , no more thing will execute now after this
//
//    }
//}

//public class Methods {
//    public static void main(String[] args) {
//        String greetMessage = greet();
//        System.out.println(greetMessage);
//    }
//    static String greet(){
//        String greeting = " hey java ";
//        return greeting;
//    }
//}

 //PARAMETER
//
//public class Methods {
//    public static void main(String[] args) {
//     int ans = sum3(4,9);
//        System.out.println(ans);
//    }
//    static int sum3(int a , int b ){
//        int sum = a + b;
//        return sum ;
//    }
//}

//
//public class Methods {
//    public static void main(String[] args) {
//        String ans = greet("udit");
//        System.out.println(ans);
//    }
//    static String greet(String name){
//        String message = "hello " + name ;
//        return message;
//    }
//}

//
//import java.util.Scanner;
//
//public class Methods {
//    public static void main(String[] args) {
//        Scanner inp = new Scanner(System.in);
//        System.out.println("Enter your name : ");
//        String name = inp.nextLine();
//        String ans = greet( name );
//        System.out.println(ans);
//    }
//    static String greet(String name){
//        String message = "hello " + name ;
//        return message;
//    }
//}

//q SWAP TWO NUMBERS


public class Methods {
    public static void main(String[] args) {
        int a = 45;
        int b =  34;

        //swap num code
        int temp = a ;
        a = b ;
        b = temp ;

        System.out.println(a);
        System.out.println(b);

    }
}
