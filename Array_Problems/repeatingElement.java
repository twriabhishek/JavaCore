package Array_Problems;

import java.util.HashMap;
import java.util.Map;

public class repeatingElement {
    public static void repeatingInArray(int arr[], int size){
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < size; i++) {
            if(mp.get(arr[i])==null){
                mp.put(arr[i], 1);
            } else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }
        System.out.println("Repeating Element in array:");
        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
            // System.out.println(entry.getKey() +"-"+entry.getValue());
            if(entry.getValue()>1){
                System.out.print(entry.getKey()+" ");
            }
        }

    }
    public static void main(String[] args) {
        int arr[] = {4, 1, 89, 3, 4, 1, 3, 76, 90, 76};
        int size = arr.length;
        repeatingInArray(arr, size);
    }
}
