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
//        int year = 2024;
//
//        if (year % 4 == 0) {
//            if (year % 100 == 0) {
//                if (year % 400 == 0) {
//                    System.out.println("Leap year");
//                } else {
//                    System.out.println("Not a leap year");
//                }
//            } else {
//                System.out.println("Leap year");
//            }
//        } else {
//            System.out.println("Not a leap year");
//        }

        //SWITCH STATEMENT
      //  Q1. Write a program using switch that takes a number from 1-7 and prints the corresponding day name (1 = Monday, 2 = Tuesday, etc.)
//        int day = 6;
//
//        switch(day){
//            case 1 :
//                System.out.println("mon");
//                break;
//            case 2:
//                System.out.println("tues");
//                break;
//            case 3 :
//                System.out.println("wed");
//                break;
//            case 4 :
//                System.out.println("thurs");
//                break;
//            case 5 :
//                System.out.println("fri");
//                break;
//            case 6 :
//                System.out.println("sat");
//                break;
//            case 7:
//                System.out.println("sun");
//                break;
//            default:
//                System.out.println("invalid");
//        }

        //Q2. Write a program using switch that takes a month number (1-12) and prints the number of days in that month. (Assume February has 28 days, ignore leap year for now)
//        int month = 8;
//
//        switch(month){
//            case 1 ,3,5,7,8,10,12-> System.out.println("31 days of month");
//            case 4,6,9,11-> System.out.println("30 days of month");
//            case 2-> System.out.println("28 days of month");
//            default -> System.out.println("invalid");
//        }

        //Q3. Write a program using switch that takes a character grade (A, B, C, D, F) and prints a message:
        //
        //A → "Excellent"
        //B → "Good"
        //C → "Average"
        //D → "Below Average"
        //F → "Fail"

//        char grade = 'C';
//        switch(grade){
//            case 'A'-> System.out.println("excellent");
//            case 'B'-> System.out.println("good");
//            case 'C'-> System.out.println("average");
//            case 'D'-> System.out.println("below average");
//            case 'F'-> System.out.println("fail");
//            default -> System.out.println("invalid grade");
//        }

        //Q4. Write a simple calculator using switch — take two numbers and an operator (+, -, *, /) as input, and print the result based on the operator.

        char op = '*';
        int a = 23;
        int b = 34;

        switch(op){
            case '+'-> System.out.println(a+b);
            case '-'-> System.out.println(a-b);
            case '*'-> System.out.println(a*b);
            case '/'-> System.out.println(a/b);
            default -> System.out.println("invalid operator , try again ");

        }


    }
}
