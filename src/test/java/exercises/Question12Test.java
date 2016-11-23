/**
 * 
 */
package exercises;

import static org.junit.Assert.*;

import org.junit.*;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question12Test {

    @Test
    public void shouldReverseOddString() {
        assertTrue(Question12.reverse(new char[] { 'a', 'b', 'c', 0 })
            .equals("cba"));
    }

    @Test
    public void shouldReverseEvenString() {
        assertTrue(Question12.reverse(new char[] { 'a', 'b', 'c', 'd', 0 })
            .equals("dcba"));
    }

}
