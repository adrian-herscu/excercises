/**
 * 
 */
package exercises;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question12 {
    public static char[] reverse(final char[] cstring) {
        int left = 0;
        int right = cstring.length - 2; // because of the null at end
        while(left < right) {
            final char temp = cstring[left];
            cstring[left] = cstring[right];
            cstring[right] = temp;
            left++;
            right--;
        }
        return cstring;
    }
}
