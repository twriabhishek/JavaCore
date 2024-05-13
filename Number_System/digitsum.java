import java.util.Scanner;

public class digitsum {
    public static int digitSumOfNumber(int number){
        int duplicate = number;
        int sum = 0;
        while (duplicate!=0) {
            int digit = duplicate%10;
            sum+=digit;
            duplicate = duplicate/10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        System.out.println(digitSumOfNumber(number));
        scanner.close();
    }
}
