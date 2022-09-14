import java.util.HashMap;
import java.util.Map;
import java.util.Set;

class HashMapProgram {
    public static void main(String[] args) {
        // Creating HashMap that contain country and its population
        // Key: Country and Value: Population in Crores
        HashMap<String, Integer> countryPopulation = new HashMap<>();

        // Insertion
        countryPopulation.put("India", 120);
        countryPopulation.put("China", 150);
        countryPopulation.put("US", 30);

        System.out.println(countryPopulation);

        // Searching Key
        if (countryPopulation.containsKey("India"))
            System.out.println("Key is present in countryPopulation Map.");
        
        // Searching Value
        if (countryPopulation.containsValue(120))
            System.out.println("Value is present in countryPopulation Map.");

        // Get value of a Key
        System.out.println(countryPopulation.get("India"));
        System.out.println(countryPopulation.get("Netherlands"));

        // Iteration (Method 1)
        for (Map.Entry<String, Integer> element : countryPopulation.entrySet()) {
            System.out.println(element.getKey() + "'s population is " + element.getValue() + "Cr.");
        }
        
        // Iteration Method 2
        Set<String> keys = countryPopulation.keySet();
        for (String string : keys) {
            System.out.println(string + ": " + countryPopulation.get(string));
        } 

        // Removing
        countryPopulation.remove("China");
        System.out.println(countryPopulation);
    }
}