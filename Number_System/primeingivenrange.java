import java.util.Scanner;

public class primeingivenrange {
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1 || number < 0) {
            return false;
        }
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

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Upper range and Lower Range");
        int lrange = scanner.nextInt(), urange = scanner.nextInt();
        if (urange < lrange) {
            System.out.println("Upper Range must be greater than lower range");
        } else {
            System.out.println("PrimeNumber in the given range: ");
            for (int i = lrange; i <= urange; i++) {
                if (isPrime(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
