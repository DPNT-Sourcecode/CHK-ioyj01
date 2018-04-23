package befaster.solutions;

import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;


public class HelloTest {

    @Test
    public void givenANameReturnsPersonalisedGreeting() {
        assertThat(Hello.hello("John"), equalTo("Hello, John!"));
    }

}