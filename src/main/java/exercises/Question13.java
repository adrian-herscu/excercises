package exercises;

/**
 * @author adrian
 */
public class Question13 {
    public static final char[] dedup(final char[] string) {
        final boolean[] charOccurs = new boolean[Character.MAX_VALUE];

        for(int index = 0; index < string.length && 0 != string[index]; index++) {
            if(charOccurs[string[index]]) {
                shiftLeft(string, index--);
            } else {
                charOccurs[string[index]] = true;
            }
        }

        return string;
    }
    
    private static final void shiftLeft(
        final char[] string,
        final int fromIndex) {
        
        for(int index = fromIndex + 1; index < string.length; index++) {
            string[index - 1] = string[index];
        }
        
        string[string.length-1] = 0;
    }
}
