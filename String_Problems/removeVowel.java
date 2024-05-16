package String_Problems;

import java.util.Scanner;

public class removeVowel {
    public static void removal(String str, int size) {
        StringBuilder newString = new StringBuilder();
        for (int i = 0; i < size; i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' 
            || letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                newString.append(" ");
            } else{
                newString.append(letter);
            }
        }
        System.out.println(newString);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int size = str.length();
        removal(str, size);
        sc.close();
    }
}
