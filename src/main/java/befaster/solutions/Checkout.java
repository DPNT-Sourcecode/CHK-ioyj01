package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Checkout {

    public static Integer checkout(String skus) {
        HashMap<String, Integer> SKUToPriceMappings = getSKUToPriceMappings();
        final List<Integer> totals = new ArrayList<Integer>();

        SKUToPriceMappings.forEach((sku, price) -> {
            int quantity = countMatches(skus,sku);
            totals.add(quantity * price);
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

    private static int countMatches(String mainString, String whatToFind){
        String tempString = mainString.replaceAll(whatToFind, "");
        return (mainString.length()-tempString.length())/whatToFind.length();
    }
}