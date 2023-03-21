package week7_homework;
import java.util.Scanner;
/**
 * 11. Write a java program to print the numbers between 1 to 100 which can be divided by 3
 * and 5 separately. ---> (DONE)
 */

public class Program_11_Between1To100 {
    public void numBetween() {

        Scanner input = new Scanner(System.in);

        int n;
        System.out.print("Range of the number between 1 to 100: ");
        n=input.nextInt();

        System.out.println("Divided by : 3");
        for (int i = 1; i <= 100; i++) {
            if(i%3==0) System.out.print(i+", ");
        }
        System.out.println("\nDivided by : 5");
        for (int i = 1; i <= 100; i++) {
            if(i%5==0) System.out.print(i+", ");
        }
        System.out.println("\nDivided by : 3 & 5");
        for (int i = 1; i <= 100; i++) {
            if(i%3==0 && i%5==0) System.out.print(i+", ");
            input.close();
        }
    }
    public static void main(String[] args) {
        Program_11_Between1To100 obj = new Program_11_Between1To100();
        obj.numBetween();
    }
}