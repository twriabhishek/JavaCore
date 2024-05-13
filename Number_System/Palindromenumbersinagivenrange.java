import java.util.Scanner;

public class Palindromenumbersinagivenrange {
    public static boolean isPalindrome(int number) {
        int duplicate = number;
        int reverseNum = 0;
        boolean isNumberPalindrome = false;
        while (duplicate != 0) {
            int lastdigit = duplicate % 10;
            reverseNum = reverseNum * 10 + lastdigit;
            duplicate = duplicate / 10;
        }
        if (number == reverseNum) {
            isNumberPalindrome = true;
            return isNumberPalindrome;
        }
        return isNumberPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Upper range and Lower Range");
        int lrange = scanner.nextInt(), urange = scanner.nextInt();
        if (urange < lrange) {
            System.out.println("Upper Range must be greater than lower range");
        } else {
            System.out.println("Palindrome in the given range: ");
            for (int i = lrange; i <= urange; i++) {
                if (isPalindrome(i)) {
                    System.out.print(i + " ");
                }
            }
        }
        scanner.close();
    }
}
