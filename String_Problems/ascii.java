package String_Problems;

import java.util.Scanner;

public class ascii {
    public static int findAscii(char ch) {
        return (int) ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int size = str.length();
        for(int i = 0; i<size; i++){
            System.out.print("{ "+str.charAt(i)+"--"+findAscii(str.charAt(i))+" },");
        }
        sc.close();
    }
}
