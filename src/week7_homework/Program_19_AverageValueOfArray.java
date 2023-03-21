package week7_homework;

/**
 * 19. Write a Java program to calculate the average value of array elements.  ---> (DONE)
 */
public class Program_19_AverageValueOfArray {

    public static void myArray(){                    // static method

        int[] numbers = new int[]{20, 30, 25, 35, -16, 49, -100};
        //calculate sum of all array elements

        int sum = 0;

        for(int i=0; i < numbers.length ; i++)
            sum = sum + numbers[i];

        //calculate average value
        double average = sum / numbers.length;

        System.out.println("Average value of the array elements is : " + average);
    }
    public static void main(String[] args) {             // Main method
        myArray();                                       // Static method called via class name
    }

}