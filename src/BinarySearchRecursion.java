public class BinarySearchRecursion {
    public static void main(String[] args) {
        int[] arr = {-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target = 3;
        int start = 0, end = arr.length-1;
        System.out.println(binarySearch(arr, start, end, target));
    }

    static int binarySearch(int[] arr, int start, int end, int target) {
        int mid = (start + end) / 2;
        if(target == arr[mid])
            return mid;
        if(target < arr[mid]) {
            return binarySearch(arr, start, mid - 1, target);
        }
        if(target > arr[mid]) {
            return binarySearch(arr, mid + 1, end, target);
        }
        return -1;
    }
}
