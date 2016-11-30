/**
 * 
 */
package exercises.arraystrings;

import java.util.*;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question14 {

    public static boolean isAnagram(char[] string, char[] anagram) {
        Arrays.sort(string);
        Arrays.sort(anagram);
        return Arrays.equals(string, anagram);
    }

}
