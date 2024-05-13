package Array_Problems;

import java.util.HashMap;

public class symetricPairUsingMap {
    public static void findSymmetric(int arr[][], int size){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < size; i++) {
            int first = arr[i][0];
            int second = arr[i][1];
            if(mp.get(second) != null && mp.get(second) == first){
                System.out.print("("+first + " " + second+") ");
            }else{
                mp.put(first, second);
            }
        }
    }
    public static void main(String[] args){
        int arr[][] = {{1, 2}, {2, 1}, {3, 4}, {4, 5}, {5, 4}, {78, 90}, {90, 78}};
        int size = arr.length;
        findSymmetric(arr, size);
    }
}