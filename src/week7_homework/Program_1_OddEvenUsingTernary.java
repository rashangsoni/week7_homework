package week7_homework;

import java.util.Scanner;

/**
 * 1. Write a java program that tells us that Input number is odd or even?
 * HINT: use ternary operator (? :) ---> (DONE)
 */
public class Program_1_OddEvenUsingTernary {

    public static void main(String[] args) {
        Scanner rashang = new Scanner(System.in);    // Scanner called for user input
        System.out.println("Test - Input the number to check if is odd or even");  //sout statement for print and user input.
        int number = rashang.nextInt();         // Int data type called due to numeric value.
        rashang.close(); // Scanner close

        String result = number % 2 == 0 ? "Even" : "Odd";       //ternary operator to check and String Dta type used due to words.
        System.out.println(number + " is " + result); //  Final print statement for result
    }
}

