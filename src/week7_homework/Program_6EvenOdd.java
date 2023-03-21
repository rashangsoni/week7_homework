package week7_homework;

import java.util.Scanner;
/**
 * 6. Write a java program to input any number and find out if it’s odd or even ---> (DONE)
 */
public class Program_6EvenOdd {                         // instance method

    public void oddeven(){
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter any numeric number to know if it's even or odd: ");
        int num = scan.nextInt();
        if (num%2==0){
            System.out.println(num +" is Even number");
        } else System.out.println(num + " Is Odd number");
    }

    public static void main(String[] args) {            // Main method
        Program_6EvenOdd obj = new Program_6EvenOdd();  // obj created
        obj.oddeven();
    }
}