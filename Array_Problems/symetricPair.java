package Array_Problems;

public class symetricPair {
    public static void symmetricPair(int arr[][], int size) {
        System.out.println(size);
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[j][0] == arr[i][1] && arr[j][1] == arr[i][0]) {
                    System.out.print("(" + arr[i][1] + " " + arr[i][0] + ")" + " ");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int arr[][] = { { 1, 2 }, { 2, 1 }, { 3, 4 }, { 4, 5 }, { 5, 4 } };
        int size = arr.length;
        symmetricPair(arr, size);
    }
}
