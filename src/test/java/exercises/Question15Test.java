package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
public class Question15Test {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            {
                new char[] {},
                new char[] {} },
            {
                new char[] { ' ', ' ' },
                new char[] { '%', '2', '0', '%', '2', '0', } },
            {
                new char[] { 'a', ' ', 'c', 'd', ' ' },
                new char[] { 'a', '%', '2', '0', 'c', 'd', '%', '2', '0' } },
            {
                new char[] { 'a', 'b', 'c', ' ' },
                new char[] { 'a', 'b', 'c', '%', '2', '0', } },
        };
    }

    @SuppressWarnings("boxing")
    @Test(dataProvider = "data")
    public void testEncodeSpaces(
        final char[] string,
        final char[] expected) {
        assertThat(
            Question15.encodeSpaces(string),
            equalTo(expected));
    }
}