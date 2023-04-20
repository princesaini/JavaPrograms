// program to swap two strings without using third variable

class StringSwap {
    public static void main(String[] args) {
        String a = "Prince";
        String b = "ABC";

        a = a + b; // PrinceABC
        b = a.substring(0, a.length()-b.length()); //
        a = a.substring(b.length());
        
        System.out.println("A: " + a);
        System.out.println("B: " + b);
    }
}