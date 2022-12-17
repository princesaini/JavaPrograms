public class ReverseString {

    static String ReverseFunction(String name) {
        String reversedString = "";
        for (int i = name.length() - 1; i >= 0; i--) {
            reversedString = reversedString + name.charAt(i);
        }
        return reversedString;
    }
    public static void main(String[] args) {
        String name = "prince";
        String reverse = ReverseFunction(name);
        System.out.println(reverse);
    }
}