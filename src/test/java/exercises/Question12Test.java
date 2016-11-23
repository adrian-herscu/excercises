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
            { new char[] { 0 }, new char[] { 0 } },
            { new char[] { 'a', 0 }, new char[] { 'a', 0 } },
            { new char[] { 'a', 'b', 'c', 0 }, new char[] { 'c', 'b', 'a', 0 } },
            { new char[] { 'a', 'b', 'c', 'd', 0 }, new char[] { 'd', 'c', 'b', 'a', 0 } }
        };
    }

    @Test(dataProvider = "data")
    public void shouldReverseString(
        final char[] cstring,
        final char[] expected) {
        assertThat(
            Question12.reverse(cstring),
            equalTo(expected));
    }
}
