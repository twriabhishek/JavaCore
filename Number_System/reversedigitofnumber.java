import java.util.Scanner;

public class reversedigitofnumber {
    public static int reverse(int number){
        int duplicate = number;
        int reverseNum = 0;
        while(duplicate!=0){
            int lastdigit = duplicate%10;
            reverseNum = reverseNum*10+lastdigit;
            duplicate = duplicate/10;
        }
        return reverseNum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scanner.nextInt();
        System.out.println("Reverse of Number is: "+reverse(number));
        scanner.close();
    }
}
