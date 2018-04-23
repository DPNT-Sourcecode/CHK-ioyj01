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
    public void givenMultipleItemsInCommaSeparatedFormatCheckoutReturnsUnitPriceTimesQuantity() {
        assertThat(Checkout.checkout("C,C,C"), equalTo(60));
    }

    @Test
    public void given2BsCheckoutReturnsSpecialOfferPrice() {
        assertThat(Checkout.checkout("BB"), equalTo(45));
    }

    @Test
    public void givenMoreThan2BsCheckoutReturnsPriceWithSpecialOfferDiscounts() {
        assertThat(Checkout.checkout("BBB"), equalTo(75));
    }

    @Test
    public void given3AsCheckoutReturnsSpecialOfferPrice() {
        assertThat(Checkout.checkout("AAA"), equalTo(130));
    }

    @Test
    public void givenMoreThan3AsCheckoutReturnsPriceWithSpecialOfferDiscounts() {
        assertThat(Checkout.checkout("AAAA"), equalTo(180));
    }

    @Test
    public void givenUnknownSKUIncludedCheckoutReturnsMinusOne() {
        assertThat(Checkout.checkout("AEA"), equalTo(-1));
    }

    @Test
    public void givenNullCheckoutReturnsMinusOne() {
        assertThat(Checkout.checkout(null), equalTo(-1));
    }

    @Test
    public void givenNoSKUSCheckoutReturnsZero() {
        assertThat(Checkout.checkout(""), equalTo(0));
    }
}
