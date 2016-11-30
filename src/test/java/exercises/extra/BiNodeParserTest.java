package exercises.extra;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

import org.testng.annotations.*;

import exercises.extra.*;

/**
 * @author adrian
 */
@SuppressWarnings({ "nls", "javadoc", "static-method" })
public class BiNodeParserTest {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            { null, "" },
            { new BiNode("A"), "A" },
            { new BiNode("A",
                new BiNode("B"),
                new BiNode("C")),
                "A(B,C)" },
            { new BiNode("A",
                new BiNode("B", new BiNode("B1")),
                new BiNode("C",
                    new BiNode("C1"),
                    new BiNode("C2"))),
                "A(B(B1),C(C1,C2))" }
        };
    }

    @Test(dataProvider = "data")
    public void testSerialization(
        final BiNode expression,
        final String expectedString) {
        assertThat(
            BiNodeParser.serialized(expression),
            equalTo(expectedString));
    }
    
    @Test(dataProvider = "data")
    public void testParsing(
        final BiNode expectedBiTree,
        final String string) {
        assertThat(
            BiNodeParser.parsed(string),
            equalTo(expectedBiTree));
    }
}