package Array_Problems;

public class blockSwap {
    public static void blockSwaps(int arr[], int size, int k){
        int element;
        for(int i=k; i<size; i++){
            element = arr[size-1];
            for(int j=size; j>=0; j--){
                if(j<size && j>0){
                    arr[j]=arr[j-1];
                }
            }
            arr[0]=element;
        }
        for (int ele : arr) {
            System.out.print(ele+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = { 34, 67, 34, 34, 5, 5, 90, 90, 67, 90, 32, 19, 90};
        int size = arr.length;
        int k = 3;
        blockSwaps(arr, size, k);
    }
}