import java.util.Scanner;

public class harshad {
    public static boolean isHarshad(int number) {
        int duplicate = number;
        int sum = 0;
        while (duplicate != 0) {
            int digit = duplicate % 10;
            sum += digit;
            duplicate /= 10;
        }
        if (number % sum == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = scanner.nextInt();
        if (isHarshad(number1)) {
            System.out.println("Number is Harshad");
        } else {
            System.out.println("Not a Harshad Number");
        }
        scanner.close();
    }
}