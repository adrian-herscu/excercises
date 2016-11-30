package exercises.arraystrings;

import org.testng.annotations.Test;

import exercises.arraystrings.*;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

/**
 * Created by adrian on 11/22/2016.
 */
public class Question11Test {
    @Test
    public void hasUniqueChars() throws Exception {
        assertTrue(Question11.hasUniqueChars("abc"));
    }

    @Test
    public void notHasUniqueChars() throws Exception {
        assertFalse(Question11.hasUniqueChars("abbc"));
    }

    @Test
    public void hasUniqueChars2() throws Exception {
        assertTrue(Question11.hasUniqueChars2("abc"));
    }

    @Test
    public void notHasUniqueChars2() throws Exception {
        assertFalse(Question11.hasUniqueChars2("abebc"));
    }
}