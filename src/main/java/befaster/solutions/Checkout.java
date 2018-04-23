package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {
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
