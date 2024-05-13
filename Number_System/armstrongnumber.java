import java.util.Scanner;

public class armstrongnumber {
    public static boolean isArmstrong(int number){
        int duplicate1 = number;
        int duplicate2 = number;
        int length = 0;
        double armstrongsum = 0;
        boolean isnumberarmstrong = false;
        while (duplicate1 != 0) {
            length++;
            duplicate1 = duplicate1/10;
        }
        while (duplicate2 != 0) {
            int digit = duplicate2%10;
            armstrongsum = armstrongsum + Math.pow(digit, length);
            duplicate2 = duplicate2/10;
        }
        if(armstrongsum == number){
            isnumberarmstrong=true;
        }
        return isnumberarmstrong;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if(isArmstrong(number)){
            System.out.println("Number is Armstrong");
        }
        else{
            System.out.println("Number is not Armstrong");
        }
        scanner.close();
    }
}
