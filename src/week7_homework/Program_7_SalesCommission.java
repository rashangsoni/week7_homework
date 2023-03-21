package week7_homework;

import java.util.Scanner;

/**
 * 7. Write a java program input sales id, seller's name, sales amount, and salary basic and
 * then fined this sales                                                   ---> (DONE)
 * Commission
 * Sales amount >= 50,000 35%
 * Sales amount >= 30,000 20%
 * >= 20,000 10%
 * >= 10,000 5%
 * < 10,000 2%      ---> (DONE)
 */
public class Program_7_SalesCommission {

        public void sales() {                           // Instance method
            Scanner scan = new Scanner(System.in);       // scanner called
            System.out.print(" Please enter your sales ID: ");
            int salesID = scan.nextInt();

            System.out.print("Please enter seller's name: ");
            String sName = scan.next();

            System.out.print("Please enter the Sales amount: ");
            int sales = scan.nextInt();

            System.out.print("Please enter your basic salary: ");
            int basic = scan.nextInt();
 scan.close();
            int comm;

            if (sales >= 50000) {
                comm = sales * 35 / 100;
                System.out.println("Your commission is :" + comm);
            } else if (sales >= 30000) {
                comm = sales * 20 / 100;
                System.out.println(("Your commission is: " + comm));
            } else if (sales >= 20000) {
                comm = sales * 10 / 100;
                System.out.println("Your commission is: " + comm);
            } else if (sales >= 10000) {
                comm = sales * 5 / 100;
                System.out.println("Your commission is: " + comm);
            } else if (sales < 10000) {
                comm = sales * 2 / 100;
                System.out.println("Your commission is: " + comm);
            } else {
                System.out.println("Thank you for taking part");

            }

        }

        public static void main(String[] args) {                             // Main method
            Program_7_SalesCommission obj = new Program_7_SalesCommission(); // Obj called
            obj.sales();                                                     // Obj created

        }
    }