package week7_homework;
import java.util.Scanner;
/**
 *10.Write a java program to input any two number and ask user to enter their symbol (+, -,
 * /, *) find addition, Subtraction, multiplication and division according to their symbol
 * (using if else)  ---> (DONE)
 */

    public class Program_10_TwoNumberAndSymbol {
    public void myNumbers() {                             // instance method
        Scanner scan = new Scanner(System.in);
        System.out.println("Input the first number");
        int firstNum = scan.nextInt();
        System.out.println("Input the second number");
        int secondNum = scan.nextInt();

        System.out.println("Please enter the symbol20 to perform operation");
        char operation = scan.next().charAt(0);
        if (operation == '+') {
            System.out.println("Addition of two numbers is:" + (firstNum + secondNum));
        } else if (operation == '-') {
            System.out.println("Subtraction of two numbers is:" + (firstNum - secondNum));
        } else if (operation == '*') {
            System.out.println("Multiplication of two numbers is:" + (firstNum * secondNum));
        } else if (operation == '/') {
            System.out.println("Division of two numbers is: " + (firstNum / secondNum));
            scan.close();
        }
    }

    public static void main(String[] args) {                          // Main method
        Program_10_TwoNumberAndSymbol obj = new Program_10_TwoNumberAndSymbol(); // Instance calling
        obj.myNumbers();                                                         // Obj Created
    }
}