package exercises;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.hamcrest.MatcherAssert.*;
import static org.hamcrest.Matchers.*;

/**
 * @author adrian
 */
@SuppressWarnings({ "javadoc", "static-method" })
public class Question17Test {
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
                    { 1, 0 },
                    { 3, 4 } },
                new long[][] {
                    { 0, 0 },
                    { 3, 0 } } },
            {
                new long[][] {
                    { 1, 2, 3 },
                    { 4, 0, 6 },
                    { 7, 8, 9 } },
                new long[][] {
                    { 1, 0, 3 },
                    { 0, 0, 0 },
                    { 7, 0, 9 } } },
            {
                new long[][] {
                    {  1,  2,  3,  4 },
                    {  5,  6,  0,  8 },
                    {  9,  0, 11, 12 },
                    { 13, 14, 15, 16 } },
                new long[][] {
                    {  1, 0, 0,  4 },
                    {  0, 0, 0,  0 },
                    {  0, 0, 0,  0 },
                    { 13, 0, 0, 16 } } },
        };
    }

    @Test(dataProvider = "data")
    public void testFillZerosInColumnAndRow(
        final long[][] matrix,
        final long[][] expected) {
        assertThat(
            Question17.fillZerosInColumnAndRow(matrix),
            equalTo(expected));
    }
}