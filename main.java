package com.jp;


import com.sun.org.apache.bcel.internal.generic.SWITCH;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//	// write your code here
//        //Print Something in JAVA
//        String name = "Masab";
//        System.out.println(name);
//        // DATA TYPES
//        int a = 5;
//        float b = 6.59f;
//        System.out.println(a+b);
//        System.out.println("Hello MAN");
//        //Taking Input From the User
//
//      Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Something: ");
//      String input = scan.nextLine();
//        System.out.println(input);
//
//        /*If we use String input = scan.next();
//         It will show words before space
//
//        */
//        //toUpperCase()
//        String myname = "Masab";
//        String surname = "ALi";
//        System.out.println(myname.toUpperCase());
//        //toLowerCase()
//        System.out.println(myname.toLowerCase());
//        //For finding length
//        System.out.println(myname.length());
//        //Concatenation
//        System.out.println(myname +" " + surname);
//
//        // To use special characters use / and those characters will called escape sequence characters
//
//        //To Check Characters
//
//        System.out.println(name.contains("sab"));
//
//        // To check index
//
//        System.out.println(myname.charAt(3));
//
//        // "Index of" method
//        //It tells the starting index
//
//        System.out.println(myname.indexOf("sab"));

        //***********MATH CLASS*********
//        int num1 = 8, num2 = 10;
//        //It will tell us the maximum number
//        System.out.println(Math.max(num1, num2));
//        //It will tell us the minimum number
//        System.out.println(Math.min(num1, num2));
//        //It will give us the square root of number
//        System.out.println(Math.sqrt(90));
//        // It gives absolute values
//
//        System.out.println(Math.abs(-90));
//        System.out.println(Math.abs(90));
//        //It prints any random number between zero and one
//        System.out.println(Math.random());
//        //Random number between any two numbers
//        System.out.println((4 + (8 - 4)) * Math.random());
//        System.out.println((4 + (8 - 4)) * Math.random());
//        System.out.println((4 + (8 - 4)) * Math.random());
//        System.out.println((4 + (8 - 4)) * Math.random());
//        System.out.println((4 + (8 - 4)) * Math.random());
//
//        //To explore more about the Math class methods search it on google:
//
//        //If / Else conditionals******************
////        int age = 5;
////
////        if (age > 10) {
////            System.out.println("You are not kid");
////        } else {
////            System.out.println("You are a Kid");
////        }
//
//        //To automatically format your code in the current source code window, use Cmd+Alt+L
//        //To automatically comment code use ctrl+/
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Your Age: ");
//        int age =  scan.nextInt();
//        if (age >= 18)
//        {
//            System.out.println("You are an adult");
//        }
//        else if (age >= 10)
//        {
//            System.out.println("You are a Kid");
//        }
//        else
//        {
//            System.out.println("You are a baby");
//        }

        //  ********* Switch Statement
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any digit between 1 to 7");
        int days = scan.nextInt();
        switch (days) {
            case 1:
                System.out.println("Today is Monday");
                break;
            case 2:
                System.out.println("Today is tuesday");
                break;
            case 3:
                System.out.println("Today is Wednesday");
                break;
            case 4:
                System.out.println("Today is thursday");
                break;
            case 5:
                System.out.println("Today is Friday");
                break;
            case 6:
                System.out.println("Today is Saturday");
                break;
            case 7:
                System.out.println("Today is Sunday");
                break;
            default:
                System.out.println("Not Matched");


        }
        //********Loops********
        //While*********
//        int i = 0;
//        while (i < 100) {
//            System.out.println(i);
//            i += 1;
//        }
        //do while********
        int j = 0;
        do {
            System.out.println(j);
            j += 1;
        }while (j>100);
        //for*******
        int m;
        for (m=0; m<10; m++){

            System.out.println(m);

        }

        //Use continue; to escape an iteration




    }
}
