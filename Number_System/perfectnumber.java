import java.util.*;

public class perfectnumber {
    public static boolean isPerfect(int number){
        int duplicate = number;
        boolean isPerfectNumber = false;
        int sum = 0;
        for(int i=1; i<duplicate; i++){
            if(number%i == 0){
                sum+=i;
            }
        }
        if(duplicate==sum){
            isPerfectNumber=true;
        }
        return isPerfectNumber;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number");
        int number = scanner.nextInt();
        if(isPerfect(number)){
            System.out.println("Number is Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        scanner.close();
    }
}
