import java.util.Scanner;

public class ifelse2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter You Marks");
        int marks = scanner.nextInt();
        if(marks>100 || marks < 0){
            System.out.println("Invalid Marks");
        } else if(marks >= 0 && marks <= 25){
            System.out.println("Grade D");
        } else if(marks >= 26 && marks <= 50){
            System.out.println("Grade C");
        } else if(marks >= 51 && marks <= 75){
            System.out.println("Grade B");
        } else if(marks >= 76 && marks <= 100){
            System.out.println("Grade A");
        }
        scanner.close();
    }
}
