import java.util.Scanner;

public class ifelse1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your age");
        int age = scanner.nextInt();

        if (age <= 0 || age >= 100) {
            System.out.println("Invalid Age");
        } else if (age < 18) {
            System.out.println("You are Minor");
        } else if (age >= 18) {
            System.out.println("You are Adult");
        }
        scanner.close();
    }
}
