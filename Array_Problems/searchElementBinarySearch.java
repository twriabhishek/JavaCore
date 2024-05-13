package Array_Problems;

public class searchElementBinarySearch {
    public static int findIndexK(int arr[], int size, int k){
        int index = -1;
        int start = 0;
        int end = size-1;
        int mid = (start+end)/2;
        while (start <= end) {
            if(arr[mid] == k){
                index = mid;
                break;
            } else if(arr[mid]<k){
                start = mid+1;
            } else{
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {1,4,6,7,8,10,11,12,23,45,67,89,90,100,103};
        int k = 6;
        int size = arr.length;
        int indexOfK = findIndexK(arr, size, k);
        System.out.println("Index of Element is:"+ indexOfK);
    }
}
