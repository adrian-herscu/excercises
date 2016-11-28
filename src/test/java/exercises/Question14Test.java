package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
public class Question14Test {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            {
                new char[] {},
                new char[] {},
                true },
            {
                new char[] { 'a', 'b', 'c', 'd' },
                new char[] { 'c', 'b', 'a', 'f' },
                false },
            {
                new char[] { 'a', 'b', 'c', 'd' },
                new char[] { 'c', 'b', 'a', 'd' },
                true },
            {
                new char[] { 'a', 'b', 'c', 'd' },
                new char[] { 'c', 'b', 'a', 'd', 'a' },
                false },
        };
    }

    @SuppressWarnings("boxing")
    @Test(dataProvider = "data")
    public void testAnagram(
        final char[] string,
        final char[] anagram,
        final boolean expected) {
        assertThat(
            Question14.isAnagram(string, anagram),
            equalTo(expected));
    }
}