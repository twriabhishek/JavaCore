import java.util.Scanner;

public class factorial {
    public static int factorials(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult = mult*i;
        }
        return mult;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        int number = scanner.nextInt();
        int fact = factorials(number);
        System.out.println("Factorial is: "+ fact);
        scanner.close();
    }
}
