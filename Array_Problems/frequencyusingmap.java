package Array_Problems;

import java.util.HashMap;
import java.util.Map;

public class frequencyusingmap {
    public static void frequency(int arr[]){
        Map<Integer, Integer> numberfrequency = new HashMap<>();
        int size = arr.length;
        for(int i=0; i<size; i++){
            if(numberfrequency.containsKey(arr[i])){
                numberfrequency.put(arr[i], numberfrequency.get(arr[i])+1);
            } else{
                numberfrequency.put(arr[i], 1);
            }
        }
        System.out.println(numberfrequency);
    }
    public static void main(String[] args) {
        int arr[] = {5, 2, 9, 1, 6, 2, 9, 1, 5, 2, 9, 1, 6, 2, 9, 1};
        frequency(arr);
    }
}
