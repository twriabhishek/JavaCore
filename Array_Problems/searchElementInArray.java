package Array_Problems;

public class searchElementInArray {
    public static int findIndexOfElement(int arr[], int size, int k){
        int index = -1;
        for (int i = 0; i < size; i++) {
            if(k == arr[i]){
                index = i;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        int arr[] = {6,7,9,5,3,10};
        int size = arr.length;
        int k = 6;
        int indexOfElement = findIndexOfElement(arr, size, k);
        System.out.println("Index is :"+ indexOfElement);
    }
}
