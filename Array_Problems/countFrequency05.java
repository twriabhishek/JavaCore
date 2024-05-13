package Array_Problems;

public class countFrequency05 {
    public static void countFrequency(int arr[]) {
        int size = arr.length;
        int element;
        int elementCount = 0;
        boolean isVisted[] = new boolean[size];
        for (int i = 0; i < size; i++) {
            if (!isVisted[i]) {
                element = arr[i];
                for (int j = 0; j < size; j++) {
                    if (element == arr[j]) {
                        elementCount = elementCount + 1;
                        isVisted[j] = true;
                    }
                }
                System.out.println(element+"--"+elementCount);
                elementCount = 0;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 34, 67, 34, 34, 90, 90, 67, 90, 32, 19, 90, 5, 5 };
        countFrequency(arr);
    }
}
