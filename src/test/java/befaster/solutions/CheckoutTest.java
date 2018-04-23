package befaster.solutions;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

public class CheckoutTest {

    @Test
    public void givenOneItemACheckoutReturnsUnitPriceForA() {
        assertThat(Checkout.checkout("A"), equalTo(50));
    }

    @Test
    public void givenOneItemBCheckoutReturnsUnitPriceForB() {
        assertThat(Checkout.checkout("B"), equalTo(30));
    }

    @Test
    public void givenOneItemCCheckoutReturnsUnitPriceForC() {
        assertThat(Checkout.checkout("C"), equalTo(20));
    }

    @Test
    public void givenOneItemDCheckoutReturnsUnitPriceForD() {
        assertThat(Checkout.checkout("D"), equalTo(15));
    }

    @Test
    public void givenMultipleItemsWhereNoSpecialOfferCheckoutReturnsUnitPriceTimesQuantity() {
        assertThat(Checkout.checkout("CCC"), equalTo(60));
    }

    @Test
    public void given2BsCheckoutReturnsSpecialOfferPrice() {
        assertThat(Checkout.checkout("BB"), equalTo(45));
    }

    @Test
    public void given3AsCheckoutReturnsSpecialOfferPrice() {
        assertThat(Checkout.checkout("AA"), equalTo(130));
    }

}