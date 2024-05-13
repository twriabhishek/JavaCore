import java.util.Scanner;

public class automorphic {
    public static boolean isAutomorphic(int number) {
        int duplicate = number;
        int sqrt = duplicate * duplicate;
        int last2digit = sqrt % 100;
        if (last2digit == number) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if (isAutomorphic(number)) {
            System.out.println("Automorphic Number");
        } else {
            System.out.println("Not a Automorphic Number");
        }
        scanner.close();
    }
}
