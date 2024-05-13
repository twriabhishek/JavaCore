import java.util.Scanner;

public class switchcase2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();

        System.out.println("Enter an operator (+, -, *, /): ");

        char operator = scanner.next().charAt(0);

        switch (operator) {
            case '+':
                System.out.println("Sum is: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Substraction is: " + (num1 - num2));
                break;
            case 'x':
                System.out.println("Multiplication is: " + (num1 * num2));
                break;
            case '/':
                try {
                    System.out.println("Division is: " + (num1 / num2));
                } catch (Exception e) {
                    System.out.println("Can't divide by Zero");
                }
                break;
            default:
                System.err.println("Enter Valid Operator");
                break;
        }
        scanner.close();
    }
}
