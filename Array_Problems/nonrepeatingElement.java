package Array_Problems;

import java.util.HashMap;
import java.util.Map;

public class nonrepeatingElement {
    public static void nonRepeating(int arr[], int size){
        HashMap<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<size; i++){
            if(mp.get(arr[i])==null){
                mp.put(arr[i], 1);
            } else{
                mp.put(arr[i], mp.get(arr[i])+1);
            }
        }
        System.out.println("Non-repeating Elements are:");
        for (Map.Entry<Integer, Integer> entry: mp.entrySet()) {
            if(entry.getValue()==1){
                System.out.print(entry.getKey()+" ");
            }
        }
    }
    public static void main(String[] args){
        int arr[] = {45, 76, 90, 32, 13, 57, 76, 12, 13, 90};
        int size = arr.length;
        nonRepeating(arr, size);
    }
     
}