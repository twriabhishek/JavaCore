import java.util.*;

public class greatestintwo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two number");
        int num1 = scanner.nextInt(), num2 = scanner.nextInt();
        
        if(num1>num2){
            System.out.println("First Number is greater");
        } else if(num2>num1){
            System.out.println("Second Number is greater");
        } else{
            System.out.println("Both are equal");
        }

        scanner.close();
    }
}