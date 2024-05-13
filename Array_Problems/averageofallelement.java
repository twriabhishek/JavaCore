package Array_Problems;

public class averageofallelement {
    public static void averageOfArray(int arr[], int size){
        int sum = 0;
        for(int i = 0; i<size; i++){
            sum+=arr[i];
        }
        System.out.println("Average of array is: "+ sum/(float)size);
    }
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 2, 9, 1, 5, 2, 9, 1, 6, 2, 9, 1, 23, 65, 78, 22, 1, 78 };
        int size = arr.length;
        averageOfArray(arr, size);
    }
}
