import java.util.Scanner;

public class givennumbersumoftwoprimenumber {
    public static boolean isPrime(int number) {
        if (number == 0 || number == 1 || number < 0) {
            return false;
        }
        int duplicate = number;
        boolean isNumberPrime = true;
        for (int i = 2; i <= (duplicate - 1); i++) {
            if (number % i == 0) {
                isNumberPrime = false;
                break;
            }
        }
        return isNumberPrime;
    }

    public static void represent(int num){
        int duplicate = num;
        boolean flag = false;
        for(int i=2; i<=(duplicate-2); i++){
            if(isPrime(i) && isPrime(duplicate-i) && i<(duplicate-i)){
                System.out.println(i+", "+(duplicate-i));
                flag = true;
            }
        }
        if (!flag) {
            System.out.println("False");
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = scanner.nextInt();
        represent(number1);
        scanner.close();
    }
}
