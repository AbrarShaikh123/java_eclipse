package Java;

import java.util.Scanner;

public class employeeId {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Your age: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter Your salary: ");
        float num2 = scanner.nextFloat();
        
//        String result = name;
//        int resul = num1;
//        float res = num2;
//        
        System.out.println("This is Your  Name   Age And salary : " + name  +" / " + num1 +" / " + num2);

        scanner.close();
    }
}

//import java.util.Scanner;
//
//public class math {
//    public static void main(String[] args) {
//        // Create a Scanner object to read input
//        Scanner scanner = new Scanner(System.in);
//
//        // Prompt the user to enter their name
//        System.out.print("Enter your name: ");
//
//        // Read a line of text (the user's name)
//        String name = scanner.nextLine();
//
//        // Display the name back to the user
//        System.out.println("Assalamu alaikum " + name + ".");
//
//        // Close the scanner
//        scanner.close();
//    }

