package week7_homework;
import java.util.*;

/***
 * 5. WAP to input employee id, name, basic salary then find HRA, TA, DA, PF and Gross
 * salary
 * HRA = basic salary 10%
 * DA = Basic salary 8%
 * TA = Basic salary 9%
 * PF= Basic salary 20%
 * Gross salary = basic salary + HRA + TA + DA –PF
 * Print in following format ---> (DONE)
 */
public class Program_5_GrossSalary {
        public void salaryslip() {                       // instance method used
            Scanner scan = new Scanner(System.in);       // Scanner called for user input
            System.out.print("Plese enter employee ID: "); // For Print Statement and user input
            int empID = scan.nextInt();
            System.out.print("Please enter employee name: "); // For Print Statement and user input
            String empName = scan.next();
            scan.close();
            System.out.print("Please enter basic Salary: ");// For Print Statement and user input
            double basic = scan.nextDouble();
            double hra = basic * 10 / 100;
            double da = basic * 8 / 100;
            double ta = basic * 9 / 100;
            double pf = basic * 20 / 100;
            double gross = basic + hra + ta + da - pf;

            System.out.println("________________________________");
            System.out.println("|          Salary Slip         |");
            System.out.println("|______________________________|");
            System.out.println("| Employee Id   :" + empID + " |");
            System.out.println("| Employee Name :" + empName +"|");
            System.out.println("|______________________________|");
            System.out.println("| Basic Salary  :" + basic + " |");
            System.out.println("| HRA 10%       :" + hra + "   |");
            System.out.println("| TA 8%         :" + ta + "    |");
            System.out.println("| DA 9%         :" + da + "    |");
            System.out.println("| PF - 20&      :" + pf + "    |");
            System.out.println("|______________________________|");
            System.out.println("| Gross Salary  :" + gross + " |");
            System.out.println("|==============================|");

        }

        public static void main(String[] args) {                     // Main method
            Program_5_GrossSalary obj = new Program_5_GrossSalary(); // instance method call
            obj.salaryslip();
        }
    }