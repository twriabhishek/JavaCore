package Array_Problems;

public class subsetOfArray {
    public static Boolean isPresent(int arr[], int size, int k){
        Boolean isPresent = false;
        for(int i=0; i<size; i++){
            if(arr[i] == k){
                isPresent = true;
            }
        }
        return isPresent;
    }
    public static Boolean isSubset(int arr1[], int arr2[], int arr1Size, int arr2Size){
        Boolean isSubset = true;
        for(int i=0; i<arr1Size; i++){
            if(!isPresent(arr2, arr2Size, arr1[i])){
                isSubset = false;
                break;
            }
        }
        return isSubset;
    }
    public static void main(String[] args) {
        int arr1[] = {1,3,4,5,2};
        int arr2[] = {11,12,13,15,16};
        int arr1Size = arr1.length;
        int arr2Size = arr2.length;
        if(isSubset(arr1, arr2, arr1Size, arr2Size)){
            System.out.println("Yes, First array is Subset of Second Array");
        } else{
            System.out.println("No, First array is not a Subset of Second Array");
        }
    }
}
