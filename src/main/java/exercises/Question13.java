package exercises;

/**
 * @author adrian
 */
public class Question13 {
    public static final char[] dedup(final char[] string) {
        final boolean[] charOccurs = new boolean[Character.MAX_VALUE];

        for(int index = 0, dedupedIndex = 0; index < string.length; index++) {
            if(!charOccurs[string[index]]) {
                charOccurs[string[index]] = true;
                dedupedIndex = index;
            } else {
                string[dedupedIndex++] = string[index];
            }
        }

        return string;
    }
}
