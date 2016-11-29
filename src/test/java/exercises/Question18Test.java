package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
@SuppressWarnings({ "javadoc", "static-method" })
public class Question18Test {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            {
                "",
                "",
                true },
            {
                "abcd",
                "bcda",
                true },
            {
                "abcd",
                "cdab",
                true },
            {
                "abcd",
                "abcd",
                true },
            {
                "abcd",
                "bcdf",
                false },
            {
                "abcd",
                "bcdaa",
                false },
        };
    }

    @Test(dataProvider = "data")
    public void testIsRotated(
        final String original,
        final String rotated,
        final boolean expected) {
        assertThat(
            Question18.isRotated(original, rotated),
            equalTo(expected));
    }
}