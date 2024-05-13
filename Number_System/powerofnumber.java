import java.util.Scanner;

public class powerofnumber {
    public static long powerofnumbers(int n, int p){
        long result = 1;
        for(int i = 1; i <= p; i++){
            result = result*n;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number and Power: ");
        int n = scanner.nextInt(), p = scanner.nextInt();
        System.out.println("Result is: "+ powerofnumbers(n, p));
        scanner.close();
    }
}
