public class MinMaxIn1DArray {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, -14, 28};
        minmax(arr);
    }
    static void minmax(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];

            if (max < arr[i])
                max = arr[i];

        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
