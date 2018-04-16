package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    public static final int ONE_MORE_THAN_MAX = 101;
    public static final int ONE_LESS_THAN_MIN = -1;

    @Test
    public void givenPositiveIntegersSumReturnsTotal() {
        assertThat(Sum.sum(1, 1), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(ONE_LESS_THAN_MIN, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentIsLessThanMinAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(1, ONE_LESS_THAN_MIN);
    }


    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(ONE_MORE_THAN_MAX, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentGreaterThanMaxAllowedSumThrowsIllegalArgumentException() {
        Sum.sum(1, ONE_MORE_THAN_MAX);
    }
}