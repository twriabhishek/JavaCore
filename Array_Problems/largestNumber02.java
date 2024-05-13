package Array_Problems;

public class largestNumber02 {
    public static void largestNumber(int arr[]){
        int size = arr.length;
        int maxi = Integer.MIN_VALUE;
        for(int i=0; i<size; i++){
            maxi = Math.max(maxi, arr[i]);
        }
        System.out.println("Largest: "+maxi);
    }
    public static void main(String[] args) {
        int arr[] = {34, 67, 21, -100, 90, 25, 67, 560, 32, 19, 80, 5, 400};
        largestNumber(arr);
    }
}
