import java.util.Scanner;

public class replace0with1 {
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

    public static void replace(int num){
        int duplicate = num;
        int rev_num = 0;
        while (duplicate!=0) {
            int digit = duplicate%10;
            if(digit == 0){
                rev_num = rev_num*10+1;
            } else{
                rev_num = rev_num*10+digit;
            }
            duplicate=duplicate/10;
        }
        System.out.println(reverse(rev_num));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number:");
        int number = scanner.nextInt();
        replace(number);
        scanner.close();
    }
}
