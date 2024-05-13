package Array_Problems;

public class removeDuplicateusingArray {
    public static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void removeDuplicateFromSorted(int arr[]) {
        int i = 0;
        int j = 1;
        int size = arr.length;
        while (j < size && i < j) {
            if (arr[i] == arr[j]) {
                i = i + 1;
                j = j + 1;
            } else {
                swap(arr, i, j);
                j = j + 1;
            }
        }
        for(int l = 0; l<i; l++){
            System.out.print(arr[l]+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 2, 3, 3 };
        removeDuplicateFromSorted(arr);
    }
}
