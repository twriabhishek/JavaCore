package Array_Problems;

import java.util.*;

public class printaccordingtofrequency {
    public static void printAccordingToFrequency(int arr[], int size){
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int i = 0; i < size; i++) {
            frequencyMap.put(arr[i], frequencyMap.getOrDefault(arr[i], 0) + 1);
        }

        Integer[] integerArray = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            integerArray[i] = arr[i];
        }

        Arrays.sort(integerArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                int freqCompare = frequencyMap.get(num2).compareTo(frequencyMap.get(num1));
                if (freqCompare == 0) {
                    return num1.compareTo(num2);
                }
                return freqCompare;
            }
        });

        System.out.println("Sorted Array By Frequency:");
        for (int num : integerArray) {
            System.out.print(num + " ");
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,2,4,3,1,2};
        int size = arr.length;
        printAccordingToFrequency(arr, size);
    }
}
