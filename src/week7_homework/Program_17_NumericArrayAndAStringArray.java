package week7_homework;

import java.util.Arrays;

/**
 * 17. Write a Java program to sort a numeric array and a string array. ---> (DONE)
 */


public class Program_17_NumericArrayAndAStringArray {


    public void myArrays(){                                      //instance method
        int[] num = {4, 5, 7, 6, 8};
        String[] str = {"Vensi", "Rashang"};

        Arrays.toString(num);
        Arrays.toString(str);


        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));

        Arrays.sort(num);
        Arrays.sort(str);

        System.out.println(Arrays.toString(num));
        System.out.println(Arrays.toString(str));
    }
    public static void main(String [] args){                          // main method
        Program_17_NumericArrayAndAStringArray obj = new Program_17_NumericArrayAndAStringArray();  // instance method calling
        obj.myArrays();                                                         // obj created

    }

}
