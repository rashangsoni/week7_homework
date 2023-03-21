package week7_homework;

import java.util.Scanner;

/**
 * 9. Same as above program-8 using switch statement. ---> (DONE)
 */


public class Program_9_SwitchStatement {
    public void city(){                          // Instance method used
        Scanner scan = new Scanner(System.in);   // Scanner called for user input
        System.out.print("Enter any letter = "); //sout statement for print and user input.
        char city = scan.next().charAt(0);       // Char data type used to identify the single characters.
        String alpha;
        switch (Character.toUpperCase(city)){                       //  Switch statement used to identify the char.
            case 'A':                                              //  case and break are used for the requirement.
                System.out.println("Your city name is AmarnathShaktipeeth"); //sout statement for print.
                break;
            case 'B':                                             //  case and break are used for the requirement.
                System.out.println("Your city name is BhairavparvatShaktipeeth"); //sout statement for print.
                break;
            case 'C':                                             //  case and break are used for the requirement.
                System.out.println("Your city name is ChatalShaktipeeth"); //sout statement for print.
                break;
            case 'D':                                            //  case and break are used for the requirement.
                System.out.println("Your city name is Dwarka"); //sout statement for print.
                break;
            case 'E':                                           //  case and break are used for the requirement.
                System.out.println("Your city name is Edinburgh"); //sout statement for print.
                break;
            case 'F':                                             //  case and break are used for the requirement.
                System.out.println("Your city name is Florida"); //sout statement for print.
                break;
            default:
                System.out.println("Invalid entry");  //sout statement for print the invalid entry
                scan.close();                         // Scanner closed.
        }
    }
    public static void main(String[] args) {                                //Main Method
        Program_9_SwitchStatement obj = new Program_9_SwitchStatement();   //Instance method calling
        obj.city();                                                        //Object created.
    }
}