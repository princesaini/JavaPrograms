import java.util.ArrayList;
import java.util.Collections;

public class MergeTwoSortedArrays {
    static ArrayList<Integer> mergeArrays(int[] x, int[] y) {
        ArrayList<Integer> a1 = new ArrayList<>();

        for (int a : x) {
            a1.add(a);
        }
        for (int a : y) {
            a1.add(a);
        }
        Collections.sort(a1);
        return a1;
    }

    public static void main(String[] args) {
        int arr1[] = {1,2,5,4};
        int arr2[] = {2,3,7,8};

        // printArray(mergeArrays(arr1, arr2));
        System.out.println(mergeArrays(arr1, arr2));
    }
}