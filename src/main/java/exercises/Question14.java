/**
 * 
 */
package exercises;

import static java.util.Arrays.*;

import java.util.*;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question14 {

    public static boolean isAnagram(char[] string, char[] anagram) {
        sort(string);
        sort(anagram);
        return Arrays.equals(string, anagram);
    }

}
