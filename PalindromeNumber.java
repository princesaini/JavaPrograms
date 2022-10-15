class PalindromeNumber {
    public static boolean isPalindrome(int x) {
        String number = x + "";
        boolean answer = true;
        
            for (int i = 0; i <= number.length() / 2; i++)
                if (number.charAt(i) != number.charAt(number.length() - (i+1))) {
                 answer = false;
                 break;
                }

        return answer;
    }
    public static void main(String[] args) {
        boolean x = PalindromeNumber.isPalindrome(121);
        System.out.println(x);
    }
}