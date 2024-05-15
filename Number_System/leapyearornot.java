import java.util.Scanner;

public class leapyearornot {
    public static boolean isLeap(int year) {
        int duplicate = year;
        if (duplicate % 100 == 0) {
            if (duplicate % 400 == 0) {
                return true;
            } else {
                return false;
            }
        } else {
            if (duplicate % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");
        int year = scanner.nextInt();
        if(isLeap(year)){
            System.out.println("Year is Leap Year");
        } else{
            System.out.println("Not a Leap Year");
        }
        scanner.close();

    }
}
