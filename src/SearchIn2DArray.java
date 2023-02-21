import java.util.Arrays;

public class SearchIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {35,64,24,67,87},
                {42,56,8,35,1,54,76,34},
                {54,89,65,23,53,17,83,43,14,98}
        };
        int value = 0;
//        searchIn2DArray(arr, value);
        int[] ans = searchIn2DArray(arr, value);
        System.out.println(Arrays.toString(ans));
    }

    static int[] searchIn2DArray(int[][] arr, int value) {
        if(arr.length == 0) {
            System.out.println("Empty Array!");
            return new int[]{-1, -1};
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(value == arr[i][j]) {
                    System.out.print(value+ " is present at index: ");
                    return new int[] {i, j};
                }
            }
        }
        System.out.println("Value " + value + " is not present in the array.");
        return new int[] {-1, -1};
    }
}
