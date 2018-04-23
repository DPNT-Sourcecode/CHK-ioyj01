package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;

public class Checkout {

    public static Integer checkout(String skus) {
        HashMap<String, Integer> SKUToPriceMappings = getSKUToPriceMappings();
        int total = 0;

        SKUToPriceMappings.forEach((sku, price) -> {
            int quantity = countMatches(skus,sku);
            total += quantity * price;
        }


        if(quantity > 1) {
            return quantity * 20;
        }

        return 50;
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
