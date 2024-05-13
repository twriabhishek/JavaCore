import java.util.Scanner;

public class Checkprimeornot {
    public static boolean isPrime(int number){
        if(number == 0 || number == 1 || number<0){
            return false;
        }
        int duplicate = number;
        boolean isNumberPrime = true;
        for (int i = 2; i <= (duplicate-1); i++) {
            if(number%i == 0){
                isNumberPrime = false;
                break;
            }
        }
        return isNumberPrime;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = scanner.nextInt();
        if (isPrime(num)) {
            System.out.println("Number is Prime");
        } else {
            System.out.println("Number is not Prime");
        }
        scanner.close();
    }
}
