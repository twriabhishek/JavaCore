package String_Problems;
import java.util.Scanner;

public class countVowelConso {
    public static void countOfVowelandConso(String str, int size) {
        int vowelCount = 0;
        int consoCount = 0;
        int whiteSpace = 0;
        
        for (int i = 0; i < size; i++) {
            char letter = str.charAt(i);
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
                    || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelCount = vowelCount + 1;
            } else if (letter == ' ') {
                whiteSpace = whiteSpace + 1;
            } else {
                consoCount = consoCount + 1;
            }
        }
        System.out.println("Vowel Count: "+vowelCount);
        System.out.println("Consonent Count: "+consoCount);
        System.out.println("WhiteSpace Count: "+whiteSpace);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        int size = str.length();
        countOfVowelandConso(str, size);
        sc.close();
    }
}
