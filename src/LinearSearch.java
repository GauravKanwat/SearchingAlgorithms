import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 13, 35, 65, 45, 76, 25, 86, 42, -11, 53, 87};
        int value = 25;
        int ans = linearSearch(arr, value);
        System.out.println(Arrays.toString(arr));
        if(ans == -1)
            System.out.println(value + " is not present.");
        else System.out.println("Index of " +value+ ": " + ans);
    }
    static int linearSearch(int[] arr, int value) {
        if(arr.length == 0)
            return -1;
        for (int index = 0; index < arr.length; index++) {
            if(arr[index] == value) {
                return index;
            }
        }
        return -1;
    }
}