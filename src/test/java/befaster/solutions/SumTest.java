package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class SumTest {

    @Test
    public void givenPositiveIntegersSumReturnsTotal() {
        assertThat(Sum.sum(1, 1), equalTo(2));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentIsNegativeSumThrowsIllegalArgumentException() {
        Sum.sum(-1, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentIsNegativeSumThrowsIllegalArgumentException() {
        Sum.sum(1, -1);
    }


    @Test(expected = IllegalArgumentException.class)
    public void givenFirstArgumentGreaterThanMaxSumThrowsIllegalArgumentException() {
        Sum.sum(101, 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenSecondArgumentGreaterThanMaxSumThrowsIllegalArgumentException() {
        Sum.sum(1, 101);
    }
}