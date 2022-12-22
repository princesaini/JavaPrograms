// Return the First Recurring Character
// Assume array will have atleast one recurring character

public class FirstRecurringCharacter {
    public static int FindFirstRecurringCharacter(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j])
                    return numbers[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] array = {3,4,2,5,7,8,9,5,1};
        System.out.println(FindFirstRecurringCharacter(array));
    }
}
