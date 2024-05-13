import java.util.Scanner;

public class lcm {
    public static int lcmOfTwoNumber(int a, int b){
        int larger = Math.max(a, b);
        int prod = a*b;
        for(int i = larger; i<=prod; i++){
            System.out.println(i+ " ");
            if(i%a==0 && i%b==0){
                System.out.println("if "+ i);
                return i;
            }
        }
        return prod;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();
        System.out.println(lcmOfTwoNumber(number1, number2));
        scanner.close();
    }
}
