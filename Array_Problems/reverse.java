package Array_Problems;

import java.util.Arrays;

public class reverse {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int arr[], int size) {
        int i = 0;
        int j = size - 1;
        while (i < j) {
            swap(arr, i, j);
            i++;
            j--;
        }

    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6 };
        int size = arr.length;
        reverseArray(arr, size);
        System.out.println(Arrays.toString(arr));
    }
}
