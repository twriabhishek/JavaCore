package Array_Problems;

import java.util.Arrays;

public class secondsmallandlargest {
    public static void secondSmallAndLargest(int arr[], int size) {
        Arrays.sort(arr);
        System.out.println(arr[1] + ", " + arr[size - 2]);
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6 };
        int size = arr.length;
        secondSmallAndLargest(arr, size);
    }
}