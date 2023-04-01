public class LinearSearch {
    public static void main(String[] args) {
        int array[] = {2,4,5,3,6,9,8,7,12,34,22,32,55};
        int target = 8;

        System.out.println(linearSearch(array, target));
    }

    static int linearSearch(int arr[], int target) {
        // check for empty array
        if (arr.length == 0) {
            return -1;
        }

        // comparing all elements of array with target
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }

        // if element not found in array, return -1
        return -1;
    }
}
