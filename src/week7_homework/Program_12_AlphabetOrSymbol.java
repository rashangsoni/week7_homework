package week7_homework;
import java.util.Scanner;

/**
 * 12. Write a program that tells us input value is number or an alphabet or symbol. ---> (DONE)
 */
public class Program_12_AlphabetOrSymbol {

    public void charr() {                                                   // Instance method
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter anything from keyboard to know what you entered: ");
        char key = scan.next().charAt(0);
        System.out.println(key >= 'a' && key <= 'z' ? "Small case alphabet"
                : key >= 'A' && key <= 'Z' ? "Capital Alphabet"
                :key>='0'&&key<='9' ? "Digit"
                :"Symbol");
        scan.close();
    }

    public static void main(String[] args) {                                   // Main mehtod
        Program_12_AlphabetOrSymbol obj = new Program_12_AlphabetOrSymbol();   // Instance calling
        obj.charr();                                                           // Obj. created
    }
}

