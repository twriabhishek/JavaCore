import java.util.Scanner;

public class palindromeorNot {
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
        System.out.println("Enter Number thats you want to check:");
        int num = scanner.nextInt();
        int rev_num = reverse(num);

        if(num == rev_num){
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Number is not a Palindrome");
        }
        scanner.close();
    }
}
