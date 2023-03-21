package week7_homework;
import java.util.Scanner;

/**
 * 2. Write a java program to input any year like (ex.2007) and find out if it is leap year or
 * not?  ---> (DONE)
 */

public class Program_2_LeapYearOrNot {

    public static void main(String[] args) {    //Main Method
        Scanner rashang = new Scanner(System.in); // Scanner called
        System.out.print("Input the year: "); // sout statement for print and user input
        int year = rashang.nextInt(); // int data type used due to numeric value
        rashang.close();             // Scanner closed

        boolean x = (year % 4) == 0;                     // Boolean data type used to find the outcome
        boolean y = (year % 100) != 0;                   // Boolean data type used to find the outcome
        boolean z = ((year % 100 == 0) && (year % 400 == 0));     // Boolean data type used to find the outcome

        if (x && (y || z)) {                                     // If statement use for positive output
            System.out.println(year + " is a leap year");        // For print statement
        }
        else                                                    // if for negative output
        {
            System.out.println(year + " is not a leap year");  // For print statement
        }
        }
        }
