package befaster.solutions;

import org.junit.Test;

import static befaster.solutions.Sum.sum;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutTest {

    @Test
    public void givenOneItemCheckoutReturnsUnitPrice() {
        assertThat(Checkout.checkout("A"), equalTo(50));
    }

    @Test
    public void givenMultipleItemsWhereNoSpecialOfferCheckoutReturnsUnitPriceTimesQuantity() {
        assertThat(Checkout.checkout("CCC"), equalTo(60));
    }

}