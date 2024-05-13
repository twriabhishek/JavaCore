import java.util.Scanner;

public class sumofgivenrange {
    public static int SumInRange(int num1, int num2){
        int sum = 0;
        for(int i=num1; i<=num2; i++){
            sum+=i;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two Number");
        int number1 = scanner.nextInt(), number2 = scanner.nextInt();
        System.out.println(SumInRange(number1, number2));
        scanner.close();
    }
}
