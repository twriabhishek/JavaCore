import java.util.Scanner;

public class sumoffirstnnaturalnumber {
    public static int sumN(int number){
        int sum = 0;
        for(int i=0; i<=number; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int n = scanner.nextInt();
        System.out.println("Sum of first "+n+" natural number is: "+sumN(n));
        scanner.close();
    }
}
