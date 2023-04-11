public class BinarySearchOrderAgnostic {
    public static void main(String[] args) {
        int arrAsc[] =  {-6, -2, 1, 3, 6, 8, 28};
        int arrDes[] =  {87, 23, 16, 10, 3, -6, -19};
        
        System.out.println("BS in Ascending Arr: " + binarySearchOrderAgnostic(arrAsc, 6));
        System.out.println("BS in Descending Arr: " + binarySearchOrderAgnostic(arrDes, -19));
    }

    // returns the index of target element
    // returns -1 if element not found
    static int binarySearchOrderAgnostic(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isaAscending = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target)
                return mid;

            if (isaAscending) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target < mid) 
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }

        return -1;
    }
}
