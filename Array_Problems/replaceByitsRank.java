package Array_Problems;

import java.util.Arrays;

public class replaceByitsRank {
    public static void rankedArray(int arr[], int size) {
        int duplicateArr[] = Arrays.copyOf(arr, size);
        Arrays.sort(duplicateArr);
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(duplicateArr));
        for(int i=0; i<size; i++){
            for(int j=0; j<size; j++){
                if(duplicateArr[i] == arr[j]){
                    arr[j] = i+1;
                }
            }
        }
        System.out.println("Ranked Array is :"+ Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 1, 5, 8, 15, 8, 25, 9 };
        int size = arr.length;
        rankedArray(arr, size);
    }

}
