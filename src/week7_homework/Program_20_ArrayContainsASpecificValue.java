package week7_homework;
/**
 * 20. Write a Java program to test if an array contains a specific value.  ---> (DONE)
 */
public class Program_20_ArrayContainsASpecificValue {
    public static boolean contains(int[] arr, int item) {    // static method
        for (int num : arr) {
            if (item == num) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {   // main method
        int[] my_array1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(contains(my_array1, 10));
        System.out.println(contains(my_array1, 20));
    }
}