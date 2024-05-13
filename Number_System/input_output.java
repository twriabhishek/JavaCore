import java.util.Scanner;

public class input_output {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Your Name");
        String username = scanner.nextLine();

        System.out.println("Enter Your Age");
        String userage = scanner.nextLine();

        System.out.println("Enter Your Email");
        String useremail = scanner.nextLine();
        
        System.out.println("You name is "+ username +" Your age is "+userage+" Your email address is "+useremail);
        scanner.close();
    }
}
