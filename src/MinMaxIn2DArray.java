public class MinMaxIn2DArray {
    public static void main(String[] args) {
        int[][] arr = {
                {35,64,24,67,87},
                {42,56,8,35,1,54,76,34},
                {54,89,65,23,53,17,83,43,14,98}
        };
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        minmax(arr, min, max);
    }

    static void minmax(int[][] arr, int min, int max) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(min > arr[i][j]) {
                    min = arr[i][j];
                }
                if(max < arr[i][j]) {
                    max = arr[i][j];
                }
            }
        }
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
    }
}
