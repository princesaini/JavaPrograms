// Find longest word in a sentence.
// If two words are of same length then pick the first one.
// Do not count special characters or numbers.

public class LongestWord {
    static String longestWord(String sentence) { 
        String[] words = sentence.replaceAll("[^a-zA-Z ]", "").split(" ");
        String result = words[0];
        
        for (String x : words) {
            if (x.length() > result.length())
                result = x;
        }

        return result;
    }
    public static void main(String[] args) {
        System.out.println(longestWord("Hi I'm Sai99"));
    }
}