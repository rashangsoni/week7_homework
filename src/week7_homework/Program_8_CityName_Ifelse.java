package week7_homework;
import java.util.Scanner;

/**
 * 8. Input any alphabet from “A" to “F” and print their city name accordingly (use if else) if
 * any other alphabet should be invalid entry                              ---> (DONE)
 */

public class Program_8_CityName_Ifelse {

public void alphabet() {                            //instance method
        Scanner scanner = new Scanner(System.in);   // calling scanner
        System.out.println("Enter any letter = ");
        String city = scanner.nextLine();

        if (city.equalsIgnoreCase("a")) {
        System.out.println("Ambaji");
        } else if (city.equalsIgnoreCase("b")) {
        System.out.println("Bet-Dhwarka");
        } else if (city.equalsIgnoreCase("c")) {
        System.out.println("Cardiff");
        } else if (city.equalsIgnoreCase("d")) {
        System.out.println("Dubai");
        } else if (city.equalsIgnoreCase("e")) {
        System.out.println("Edinburgh");
        } else if (city.equalsIgnoreCase("f")) {
        System.out.println("France");
        } else {
        System.out.println("Invalid Entry");
        }
        scanner.close();
        }

public static void main(String[] args) {                               // main method
    Program_8_CityName_Ifelse obj = new Program_8_CityName_Ifelse();  // calling instance method
        obj.alphabet();                                              // obj. created
        }

        }
