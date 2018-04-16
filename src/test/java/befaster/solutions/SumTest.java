package befaster.solutions;

import org.junit.Test;

import static befaster.solutions.Sum.sum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    private static final int ONE_MORE_THAN_MAX = 101;
    private static final int ONE_LESS_THAN_MIN = -1;
    private static final int MIN_ALLOWED = 1;
    private static final int MAX_ALLOWED = 100;

    @Test
    public void givenIntegersInAllowedRangeSumReturnsTotal() {
        assertThat(sum(MIN_ALLOWED, MAX_ALLOWED), equalTo(101));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        sum(ONE_LESS_THAN_MIN, MIN_ALLOWED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        sum(MIN_ALLOWED, ONE_LESS_THAN_MIN);
    }


    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        sum(ONE_MORE_THAN_MAX, MIN_ALLOWED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        sum(MIN_ALLOWED, ONE_MORE_THAN_MAX);
    }
}