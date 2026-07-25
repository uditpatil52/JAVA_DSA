public class Conditions {
    public static void main(String[] args) {

//        Q1. Write a program that checks if a number is positive or negative using a simple if-else.
//       int num = -1;
//       if(num>=0){
//           System.out.println("positive");
//       } else{
//           System.out.println("negative");
//       }

        //Q2. Write a program that takes a number from the user and checks if it's even or odd.
//        int num = 7;
//        if(num%2==0){
//            System.out.println("even");
//        } else{
//            System.out.println("odd");
//        }

        //Q3. Write a program that checks if a student passed or failed, given marks — passing marks is 40 or above.
//        int marks = 44;
//        if(marks>40){
//            System.out.println("passed");
//        }else{
//            System.out.println("failed");
//
//        }

//        Q4. Write a program using if-else-if that assigns a grade based on marks:
//
//        90 and above → A
//        75 to 89 → B
//        60 to 74 → C
//        Below 60 → Fail

//        int markss = 75;
//
//        if(markss>=90){
//            System.out.println("A");
//        } else if (markss>=75) {
//            System.out.println("B");
//        } else if (markss>=60){
//            System.out.println("C");
//        } else{
//            System.out.println("fail");
//        }

        //Q5. Write a program to find the largest of three numbers using if-else.
//        int a = 2;
//        int b = 56;
//        int c = 6;
//
//        if(a>b && a>c){
//            System.out.println("A is larger");
//        } else if (b>a && b>c){
//            System.out.println("B is larger");
//        } else{
//            System.out.println("c is larger");
//        }

        //Q6 leap year or not
        int year = 2024;

        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.println("Leap year");
                } else {
                    System.out.println("Not a leap year");
                }
            } else {
                System.out.println("Leap year");
            }
        } else {
            System.out.println("Not a leap year");
        }

    }
}
