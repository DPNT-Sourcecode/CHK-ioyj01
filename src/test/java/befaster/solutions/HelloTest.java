package befaster.solutions;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HelloTest {

    @Test
    public void givenANameReturnsPersonalisedGreeting() {
        assertThat(Hello.hello("John"), equalTo("Hello, John!"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void givenNullThrowsIllegalArgumentException() {
        Hello.hello(null);
    }

    @Test
    public void givenBlankNameReturnsGreetingWithBlankName() {
        assertThat(Hello.hello(""), equalTo("Hello, !"));
    }

}