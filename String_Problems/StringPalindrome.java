package String_Problems;

import java.util.Scanner;

public class StringPalindrome {
    public static boolean isPalindrome(String str, int size){
        String lowerStr = str.toLowerCase();
        boolean isPalindrome = true;
        int i = 0;
        int j = size-1;
        while (i<=j) {
            if(lowerStr.charAt(i)!=lowerStr.charAt(j)){
                isPalindrome = false;
                break;
            }
            i++;j--;
        }
        return isPalindrome;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter String");
        String str = scanner.nextLine();
        int size = str.length();
        if(isPalindrome(str, size)){
            System.out.println("Palindrome String");
        } else{
            System.out.println("Not a Palindrome String");
        }
        System.out.println(str);
        scanner.close();
    }
}