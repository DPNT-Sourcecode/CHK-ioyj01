package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    public static final int ONE_MORE_THAN_MAX = 101;
    public static final int ONE_LESS_THAN_MIN = -1;
    public static final int MIN_ALLOWED = 1;

    @Test
    public void givenIntegersInAllowedRangeSumReturnsTotal() {
        assertThat(Sum.sum(1, 100), equalTo(101));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(ONE_LESS_THAN_MIN, MIN_ALLOWED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(MIN_ALLOWED, ONE_LESS_THAN_MIN);
    }


    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(ONE_MORE_THAN_MAX, MIN_ALLOWED);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(MIN_ALLOWED, ONE_MORE_THAN_MAX);
    }
}