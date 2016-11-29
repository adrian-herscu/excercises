package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
@SuppressWarnings({ "javadoc", "static-method" })
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
            {
                new long[][] {
                    { 1, 2, 3, 4 },
                    { 5, 6, 7, 8 },
                    { 9, 10, 11, 12 },
                    { 13, 14, 15, 16 } },
                new long[][] {
                    { 13, 9, 5, 1 },
                    { 14, 10, 6, 2 },
                    { 15, 11, 7, 3 },
                    { 16, 12, 8, 4 } } },
            {
                new long[][] {
                    { 1,   2,  3,  4, 5 },
                    { 6,   7,  8,  9, 10 },
                    { 11, 12, 13, 14, 15 },
                    { 16, 17, 18, 19, 20 },
                    { 21, 22, 23, 24, 25 } },
                new long[][] {
                    { 21, 16, 11,  6, 1 },
                    { 22, 17, 12,  7, 2 },
                    { 23, 18, 13,  8, 3 },
                    { 24, 19, 14,  9, 4 },
                    { 25, 20, 15, 10, 5 } } },
        };
    }

    @Test(dataProvider = "data")
    public void testRotateRight(
        final long[][] matrix,
        final long[][] expected) {
        assertThat(
            Question16.rotateRight(matrix),
            equalTo(expected));
    }

    @Test(dataProvider = "data")
    public void testRotateInPlaceRight(
        final long[][] matrix,
        final long[][] expected) {
        assertThat(
            Question16.rotateRightInPlace(matrix),
            equalTo(expected));
    }
}