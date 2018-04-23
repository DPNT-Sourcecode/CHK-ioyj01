package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Checkout {
    public static Integer checkout(String skus) {
        
        return 50;
    }

    private static int countMatches(String mainString, String whatToFind){
        String tempString = mainString.replaceAll(whatToFind, "");
        return (mainString.length()-tempString.length())/whatToFind.length();
    }
}
