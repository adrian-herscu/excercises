package exercises.linkedlists;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import exercises.arraystrings.*;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
@SuppressWarnings({ "javadoc", "static-method" })
public class Question21Test {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            {}
        };
    }

    @Test(dataProvider = "data")
    public void testDedup(
        final LinkedList<?> original,
        final LinkedList<?> deduped) {
        assertThat(
            Question21.dedup(original),
            equalTo(deduped));
    }
}