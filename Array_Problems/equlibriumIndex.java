package Array_Problems;

public class equlibriumIndex {
    public static int arraySum(int arr[], int s, int e) {
        int result = 0;
        for (int i = s; i <= e; i++) {
            result = result + arr[i];
        }
        return result;
    }

    public static int equiIndexInArray(int arr[], int size) {
        int equiIndex = -1;
        int leftSum = 0;
        int rightSum = 0;
        for (int i = 0; i < size; i++) {
            leftSum = arraySum(arr, 0, i - 1);
            rightSum = arraySum(arr, i + 1, size - 1);
            if (leftSum == rightSum) {
                equiIndex = i;
                break;
            }
            leftSum = 0;
            rightSum = 0;
        }
        return equiIndex;
    }

    public static void main(String[] args) {
        int arr[] = { 1,-1,4 };
        int size = arr.length;
        int equlibrium = equiIndexInArray(arr, size);
        System.out.println("Equlibrium Index of array is: "+ equlibrium);
    }
}