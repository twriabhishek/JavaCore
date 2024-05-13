package Array_Problems;

public class maxProdSubarray {
    public static int prodInRange(int arr[], int l, int u) {
        int result = 1;
        for (int i = l; i <= u; i++) {
            result = result * arr[i];
        }
        return result;
    }

    public static void maxProdSubArray(int arr[], int size) {
        int Prod = 1;
        int maxProd = 1;
        int lrange = 0;
        int urange = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                Prod = prodInRange(arr, i, j);
                if (Prod > maxProd) {
                    lrange = i;
                    urange = j;
                    maxProd = Prod;
                }
            }
        }
        System.out.println("Max Product of Subarray is: " + maxProd);
        System.out.print("Subarray is: ");
        for (int i = lrange; i <= urange; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, -3, 0, -4, -5 };
        int size = arr.length;
        maxProdSubArray(arr, size);
    }
}
