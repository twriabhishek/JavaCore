import java.util.Scanner;

public class nCr {
    public static int factorials(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult = mult*i;
        }
        return mult;
    }

    public static int Combination(int n, int r){
        int combination = factorials(n)/factorials(n-r);
        return combination;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Number");
        int n = scanner.nextInt(), r = scanner.nextInt();
        System.out.println(Combination(n, r));
        scanner.close();
    }
}
