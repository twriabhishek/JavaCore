package Array_Problems;

public class secondSmallestLargest03 {
    public static void secondLargestSmallestNumber(int arr[]) {
        int size = arr.length;
        int largest = Integer.MIN_VALUE;
        int secondlargest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        int secondsmallest = Integer.MAX_VALUE;
        for (int i = 0; i < size; i++) {
            if (arr[i] > largest) {
                secondlargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondlargest && arr[i] != largest) {
                secondlargest = arr[i];
            }

            if (arr[i] < smallest) {
                secondsmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondsmallest && arr[i] != smallest) {
                secondsmallest = arr[i];
            }
        }
        System.out.println(secondlargest + "," + secondsmallest);
    }

    public static void main(String[] args) {
        int arr[] = { 34, 67, 21, -100, 90, 25, 67, 560, 32, 19, 80, 5, 400 };
        secondLargestSmallestNumber(arr);
    }
}
