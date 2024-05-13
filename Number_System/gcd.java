import java.util.Scanner;

public class gcd {
    public static int gcdofTwoNumber(int num1, int num2) {
        int smaller = Integer.MAX_VALUE;
        if (num1 <= num2) {
            smaller = num1;
        } else {
            smaller = num2;
        }
        for (int i = smaller; i >= 1; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();
        System.out.println(gcdofTwoNumber(number1, number2));
        scanner.close();
    }
}
