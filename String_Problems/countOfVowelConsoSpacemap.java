package String_Problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class countOfVowelConsoSpacemap {
    public static void countOfVowelandConso(String str, int size) {
        HashMap<Character, Integer> mp = new HashMap<>();
        int vowelCount = 0;
        int consoCount = 0;
        int whiteSpace = 0;
        for (int i = 0; i < size; i++) {
            if (mp.containsKey(str.charAt(i))) {
                mp.put(str.charAt(i), mp.get(str.charAt(i)) + 1);
            } else {
                mp.put(str.charAt(i), 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : mp.entrySet()) {
            char letter = entry.getKey();
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'A'
                    || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
                vowelCount = vowelCount + entry.getValue();
            } else if (letter == ' ') {
                whiteSpace = whiteSpace + entry.getValue();
            } else {
                consoCount = consoCount + entry.getValue();
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
