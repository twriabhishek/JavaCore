import java.util.Scanner;

public class strongnumber {
    public static int factorials(int number) {
        int mult = 1;
        for (int i = 1; i <= number; i++) {
            mult = mult*i;
        }
        return mult;
    }

    public static boolean isStrong(int number){
        int duplicate = number;
        int sum = 0;
        while(duplicate != 0){
            int digit = duplicate%10;
            sum = sum + factorials(digit);
            duplicate = duplicate/10;
        }
        if(sum == number){
            return true;
        }
        else{
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if(isStrong(number)){
            System.out.println("Strong Number");
        }
        else{
            System.out.println("Not a Strong Number");
        }
        scanner.close();
    }
}