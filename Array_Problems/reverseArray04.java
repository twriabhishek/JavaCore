package Array_Problems;

public class reverseArray04 {
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

    public static void main(String[] args) {
        int arr[] = { 34, 67, 21, -100, 90, 25, 67, 560, 32, 19, 80, 5, 400 };
        reverseArray(arr);
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}
