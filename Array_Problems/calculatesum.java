package Array_Problems;

public class calculatesum {
    public static void sumOfArray(int arr[]){
        int size = arr.length;
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println("Sum of given array is: "+ sum);
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 6, 2, 9, 1, 5, 2, 9, 1, 6, 2, 9, 1, 23, 65, 78, 22, 1, 78};
        sumOfArray(arr);
    }
}
