import java.util.Scanner;

public class primefactor {
    public static boolean isPrime(int number) {
        int duplicate = number;
        boolean isNumberPrime = true;
        for (int i = 2; i <= (duplicate - 1); i++) {
            if (number % i == 0) {
                isNumberPrime = false;
                break;
            }
        }
        return isNumberPrime;
    }

    public static void primefactorization(int number) {
        int duplicate = number;
        for (int i = 2; i <= duplicate; i++) {
            if (number % i == 0 && isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        primefactorization(number);
        scanner.close();
    }
}
