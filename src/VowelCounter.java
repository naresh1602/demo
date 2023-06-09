public class VowelCounter {
    public static int countVowels(String input) {
        int count = 0;
        String vowels = "aeiouAEIOU"; // Vowel characters

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (vowels.contains(String.valueOf(ch))) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String input = "Hello, World!";
        int vowelCount = countVowels(input);
        System.out.println("Number of vowels: " + vowelCount);
    }
}
