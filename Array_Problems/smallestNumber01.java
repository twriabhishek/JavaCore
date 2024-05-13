package Array_Problems;

public class smallestNumber01 {
    public static void smallestNumber(int arr[]){
        int size = arr.length;
        int mini = Integer.MAX_VALUE;
        for(int i=0; i<size; i++){
            mini = Math.min(mini, arr[i]);
        }
        System.out.println("Smallest: "+mini);
    }
    public static void main(String[] args) {
        int arr[] = {34, 67, 21, -100, 90, 25, 67, 56, 32, 19, 80, 5, 4};
        smallestNumber(arr);
    }
}
