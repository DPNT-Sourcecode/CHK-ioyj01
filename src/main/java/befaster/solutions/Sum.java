package befaster.solutions;

import befaster.runner.SolutionNotImplementedException;

public class Sum {

    public static int sum(int x, int y) {
        if ( x < 0 || y < 0) {
            throw new IllegalArgumentException("Received negative integer, brief restricts this method to positive integers between 0-100");
        }

        throw new SolutionNotImplementedException();
    }

}