package Array_Problems;

import java.util.Arrays;

public class increasinganddecreasing {
    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }

    public static void decreasing(int arr[], int l, int u) {
        int size = arr.length;

        if (l < 0 && u >= size) {
            System.out.println("Enter Valid Limit");
            return;
        }

        int subarray[] = Arrays.copyOfRange(arr, l, u);
        int subarraySize = subarray.length;
        Arrays.sort(subarray);
        reverseArray(subarray);

        for (int i = l, j = 0; i <= u && j < subarraySize; i++, j++) {
            arr[i] = subarray[j];
        }
    }

    public static void increasing(int arr[], int l, int u) {
        int size = arr.length;

        if (l < 0 && u >= size) {
            System.out.println("Enter Valid Limit");
            return;
        }
        int subarray[] = Arrays.copyOfRange(arr, l, u);
        int subarraySize = subarray.length;
        Arrays.sort(subarray);

        for (int i = l, j = 0; i <= u && j < subarraySize; i++, j++) {
            arr[i] = subarray[j];
        }
    }

    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 2, 9, 1, 5, 2, 9, 1, 6, 2, 9, 1, 23, 65, 78, 22, 1, 78};
        increasing(arr, 0, 4);
        decreasing(arr, 4, 22);
        System.out.println(Arrays.toString(arr));
    }
}
