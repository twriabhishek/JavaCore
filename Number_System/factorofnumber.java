import java.util.Scanner;

public class factorofnumber {
    public static void factorOfNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        factorOfNumber(number);
        scanner.close();
    }
}