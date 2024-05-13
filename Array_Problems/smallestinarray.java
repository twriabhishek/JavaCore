package Array_Problems;

public class smallestinarray {
    public static void smallestInArray(int arr[], int size){
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            smallest=Math.min(smallest, arr[i]);
        }
        System.out.println(smallest);
    }
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9,4,3,2,1,0,-2,-4};
        int size = arr.length;
        smallestInArray(arr, size);
    }
}
