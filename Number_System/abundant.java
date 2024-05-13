import java.util.Scanner;

public class abundant {
    public static Boolean isAbundant(int num) {
        int duplicate = num;
        int sumoffactor = 0;
        for (int i = 1; i < duplicate; i++) {
            if (duplicate % i == 0) {
                sumoffactor = sumoffactor + i;
            }
        }
        if (sumoffactor > num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if (isAbundant(number)) {
            System.out.println("Number is Abundant");
        } else {
            System.out.println("Not a Abundant Number");
        }
        scanner.close();
    }
}
