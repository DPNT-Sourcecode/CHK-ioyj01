package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.*;
import java.util.stream.Stream;

public class Checkout {

    private static final List<String> LIKELY_SEPARATORS = Arrays.asList(" ", ",");

    public static Integer checkout(String skus) {
        if ()


        HashMap<String, Integer> SKUToPriceMappings = getSKUToPriceMappings();
        final List<Integer> totals = new ArrayList<>();

        SKUToPriceMappings.forEach((sku, price) -> {
            int quantity = countMatches(skus,sku);

            if (quantity == 3 && sku.equals("A")) {
                totals.add(130);
            } else if(quantity == 2 && sku.equals("B")) {
                totals.add(45);
            } else {
                totals.add(quantity * price);
            }
        });

        return totals.stream().mapToInt(Integer::intValue).sum();
    }

    private static HashMap<String, Integer> getSKUToPriceMappings() {
        HashMap<String, Integer> SKUToPriceMappings = new HashMap<>();

        SKUToPriceMappings.putIfAbsent("A", 50);
        SKUToPriceMappings.putIfAbsent("B", 30);
        SKUToPriceMappings.putIfAbsent("C", 20);
        SKUToPriceMappings.putIfAbsent("D", 15);

        return SKUToPriceMappings;
    }

    private static boolean containsCharactersOtherThan(String toCheck, Set<String> charactersExpected) {
        Stream<String> charactersStream = charactersExpected.stream();
        
        toCheck.matches()

    }

    private static int countMatches(String mainString, String whatToFind){
        String tempString = mainString.replaceAll(whatToFind, "");
        return (mainString.length()-tempString.length())/whatToFind.length();
    }
}
