package Array_Problems;

import java.util.Arrays;

public class arrayDecIncOrder06 {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void reverseArray(int arr[]) {
        int size = arr.length;
        int i = 0, j = size - 1;
        while (i < j) {
            swap(arr, i, j);
            i = i + 1;
            j = j - 1;
        }

    }

    public static void incresingOrder(int arr[], int size) {
        Arrays.sort(arr);
        System.out.println("Incresing Order");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void decreasingOrder(int arr[], int size) {
        Arrays.sort(arr);
        reverseArray(arr);
        System.out.println("Decreasing Order");
        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 34, 67, 34, 34, 5, 5, 90, 90, 67, 90, 32, 19, 90 };
        int size = arr.length;

        int[] arrCopy = Arrays.copyOf(arr, size);

        incresingOrder(arrCopy, size);
        decreasingOrder(arrCopy, size);
    }
}
