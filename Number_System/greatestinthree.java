import java.util.Scanner;

public class greatestinthree {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter three number");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt(), num3 = scanner.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println("First Number is greater");
            } else {
                System.out.println("Third Number is greater");
            }
        } else {
            if (num2 > num3) {
                System.out.println("Second Number is greater");
            } else {
                System.out.println("Third Number is greater");
            }
        }
        scanner.close();
    }
}
