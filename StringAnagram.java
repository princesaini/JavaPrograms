import java.util.Scanner;

public class StringAnagram {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length())
            return false;
            
        a = a.toLowerCase();
        b = b.toLowerCase();
        
        int count = 0;
        
        for (int index = 0; index < a.length(); index++) {
            int countOfCharacterFromA = 0;
            int countOfCharacterFromB = 0;

            for (int internalIndex = 0; internalIndex < a.length(); internalIndex++) {
                if (a.charAt(index) == a.charAt(internalIndex))
                    countOfCharacterFromA += 1;
                if (a.charAt(index) == b.charAt(internalIndex))
                    countOfCharacterFromB += 1;
            }

            if (countOfCharacterFromA == countOfCharacterFromB)
                count += 1;
                
            countOfCharacterFromA = 0;
            countOfCharacterFromB = 0;
        }
        if (a.length() == count)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("String 1: ");
        String a = sc.next();
        System.out.print("String 2: ");
        String b = sc.next();
        sc.close();

        boolean result = isAnagram(a, b);

        System.out.println(result?"Strings are Anagram":"Strings are not Anagram");
    }
}
