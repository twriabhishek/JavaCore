package Array_Problems;

import java.util.Arrays;

public class medianofarray {
    public static void medianOfArray(int arr[]){
        int size = arr.length;
        float median;
        Arrays.sort(arr);
        if(size%2 == 0){
            median = (arr[(size/2)-1]+arr[((size/2)+1)-1])/(float)2;
        } else{
            median = arr[((size+1)/2)-1];
        }
        System.out.println("Median of array is "+median);
    }
    public static void main(String[] args) {
        int arr[] = { 5, 2, 9, 1, 6, 2, 9, 1, 5, 2, 9, 1, 6, 2, 9, 1, 23, 65, 78, 22, 1, 78 };
        medianOfArray(arr);
    }
}
