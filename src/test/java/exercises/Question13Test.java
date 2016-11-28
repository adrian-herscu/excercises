package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

/**
 * @author adrian
 */
public class Question13Test {
    @DataProvider
    private Object[][] data() {
        return new Object[][] {
            { new char[] {}, new char[] {} },
            {
                new char[] { 'a', 'b', 'c', 'b' },
                new char[] { 'a', 'b', 'c', 0 } },
            {
                new char[] { 'f', 'b', 'c', 'b', 'c', 'j' },
                new char[] { 'f', 'b', 'c', 'j', 0, 0 } }
        };
    }

    @Test(dataProvider = "data")
    public void testDedup(
        final char[] string,
        final char[] expected) {
        assertThat(
            Question13.dedup(string),
            equalTo(expected));
    }
}