import java.util.Scanner;

public class CountVowelConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase(); 
        
        // Count vowels and consonants
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < inputString.length(); i++) {
            char ch = inputString.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }
        
        // Output
        System.out.println("Number of vowels: " + vowel);
        System.out.println("Number of consonants: " + consonant);
        
        scanner.close();
    }
}
