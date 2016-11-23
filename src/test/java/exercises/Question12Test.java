/**
 * 
 */
package exercises;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.*;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question12Test {
    @DataProvider
    private Object[][] data() {
        return new Object[][] {
            { new char[] { 'a', 'b', 'c', 0 }, "cba" },
            { new char[] { 'a', 'b', 'c', 'd', 0 }, "dcba" }
        };
    }

    @Test(dataProvider = "data")
    public void shouldReverseString(
        final char[] cstring,
        final String expected) {
        assertThat(
            Question12.reverse(cstring),
            equalTo(expected));
    }
}
