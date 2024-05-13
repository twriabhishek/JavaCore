package Array_Problems;

import java.util.HashSet;
import java.util.Set;

public class removeDuplicate {
    public static void removeDuplicateFromSorted(int arr[]){
        Set<Integer> set = new HashSet<>();
        for (Integer integer : arr) {
            set.add(integer);
        }
        for (Integer integer : set) {
            System.out.print(integer+" ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {4, 3, 9, 2, 4, 1, 10, 89, 3, 4};
        removeDuplicateFromSorted(arr);
    }
}
