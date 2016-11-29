package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
public class Question16Test {
    @DataProvider
    private static Object[][] data() {
        return new Object[][] {
            {
                new long[][] {},
                new long[][] {} },
            {
                new long[][] { { 2 } },
                new long[][] { { 2 } } },
            {
                new long[][] {
                    { 1, 2 },
                    { 3, 4 } },
                new long[][] {
                    { 3, 1 },
                    { 4, 2 } } },
            {
                new long[][] {
                    { 1, 2, 3 },
                    { 4, 5, 6 },
                    { 7, 8, 9 } },
                new long[][] {
                    { 7, 4, 1 },
                    { 8, 5, 2 },
                    { 9, 6, 3 } } },
        };
    }

    @SuppressWarnings("boxing")
    @Test(dataProvider = "data")
    public void testRotateRight(
        final long[][] matrix,
        final long[][] expected) {
        assertThat(
            Question16.rotate(matrix),
            equalTo(expected));
    }
    
    @SuppressWarnings("boxing")
    @Test(dataProvider = "data")
    public void testRotateInPlaceRight(
        final long[][] matrix,
        final long[][] expected) {
        assertThat(
            Question16.rotateInPlace(matrix),
            equalTo(expected));
    }
}