package week7_homework;
import java.util.Scanner;
/**
 *13. Write a Java program which input any number between 1 to 7 and it print The Days
 * name MONDAY, TUESDAY.....SUNDAY of the week accordingly by using switch.
 * NOTE: if number is out of selection Print message “Week contains 1 to 7 days”  ---> (DONE)
 */

public class Program_13Between1to7days {

    public static void main(String[] args) {                // main method
        Scanner in = new Scanner(System.in);                // scanner called
        System.out.print("Input number: ");
        int day = in.nextInt();

        System.out.println(getDayName(day));

        in.close();
    }
    // Get the name for the Week
    public static String getDayName(int day) {                         // static method
        String dayName = "";
        switch (day) {
            case 1: dayName = "Monday"; break;
            case 2: dayName = "Tuesday"; break;
            case 3: dayName = "Wednesday"; break;
            case 4: dayName = "Thursday"; break;
            case 5: dayName = "Friday"; break;
            case 6: dayName = "Saturday"; break;
            case 7: dayName = "Sunday"; break;
            default:dayName = "Week contains 1 to 7 days";
        }
        return dayName;
    }
}
