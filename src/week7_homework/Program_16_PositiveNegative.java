package week7_homework;

import java.util.Scanner;

/**
 * 16. Write the java program to check if enter number is “POSITIVE”, “NEGATIVE” or
 * “ZERO” ---> (DONE)
 */
public class Program_16_PositiveNegative {

    public void myNumbers() {                                 //instance method
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = in.nextInt();
        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
            in.close();
        }
    } public static void main(String[] args) {             // main method
        Program_16_PositiveNegative  obj = new Program_16_PositiveNegative();   // instance calling
        obj.myNumbers();                                                        // Obj created
    }
}
