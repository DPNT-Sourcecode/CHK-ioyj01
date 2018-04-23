package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

import java.util.HashMap;

public class Checkout {
    private static final HashMap<String, Integer> SKUToPriceMappings = new HashMap<>();


    public static Integer checkout(String skus) {
        int quantity = countMatches(skus,"C");
        if(quantity > 1) {
            return quantity * 20;
        }

        return 50;
    }

    private static int countMatches(String mainString, String whatToFind){
        String tempString = mainString.replaceAll(whatToFind, "");
        return (mainString.length()-tempString.length())/whatToFind.length();
    }
}
