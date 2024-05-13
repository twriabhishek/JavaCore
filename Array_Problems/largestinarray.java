package Array_Problems;

public class largestinarray {
    public static void LargestInArray(int arr[], int size){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            largest=Math.max(largest, arr[i]);
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9,4,3,2,1,0,-2,-4,100};
        int size = arr.length;
        LargestInArray(arr, size);
    }
}
