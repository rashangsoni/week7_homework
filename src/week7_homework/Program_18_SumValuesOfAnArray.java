package week7_homework;

/**
 * 18. Write a Java program to sum values of an array. ---> (DONE)
 */
public class Program_18_SumValuesOfAnArray {

    public void arrayValues() {               // Instance Method
        int my_array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = 0;

        for (int i : my_array)
            sum += i;
        System.out.println("The sum is " + sum);
    }

    public static void main(String[] args) {                 // Main Method
        Program_18_SumValuesOfAnArray obj = new Program_18_SumValuesOfAnArray();   // instance calling
        obj.arrayValues();                                                // obj created
    }
}
