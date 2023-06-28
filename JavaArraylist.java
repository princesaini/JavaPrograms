import java.util.*;

public class JavaArraylist {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        Scanner input = new Scanner(System.in);

        int noOfRows = input.nextInt();
        System.out.println("Number of Rows: " + noOfRows);

        for (int i = 0; i < noOfRows; i++) {
            int noOfValues = input.nextInt();
            System.out.println("Number of Values: " + noOfValues);

            ArrayList<Integer> values = new ArrayList<>();
            for (int j = 0; j < noOfValues; j++) {
                values.add(input.nextInt());
            }
            arr.add(values);
        }
        
        int noOfQueries = input.nextInt();
        System.out.println("Number of Queries: " + noOfQueries);
        List<Object> result = new ArrayList<>();

        for (int i = 0; i < noOfQueries; i++) {
            int row = input.nextInt();
            int column = input.nextInt();
            try {
                result.add(arr.get(row - 1).get(column - 1));
            } 
            catch(Exception e) {
                result.add("ERROR!");
            }
        }

        input.close();

        System.out.println(arr);
        System.out.println("Result: ");
        for (Object object : result) {
            System.out.println(object);
        }
    }
}