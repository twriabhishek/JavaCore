import java.util.Scanner;

public class fibonacci {
    public static void fibUptoNthTerm(int n) {
        int first = 0;
        int second = 1;
        int sum = 0;
        for (int i = 0; i <= n; i++) {
            System.out.print(sum + " ");
            first = second;
            second = sum;
            sum = first + second;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter term: ");
        int term = scanner.nextInt();
        fibUptoNthTerm(term);
        scanner.close();
    }
}
