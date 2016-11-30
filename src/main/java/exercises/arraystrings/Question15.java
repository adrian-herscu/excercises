/**
 * 
 */
package exercises.arraystrings;

/**
 * 
 *
 * @author aherscu
 *
 */
public class Question15 {

    public static char[] encodeSpaces(final char[] string) {
        final char[] encodedString =
            new char[string.length + spacesCountIn(string) * 2];

        for (int index = 0, encodedIndex = 0; index < string.length; index++) {
            if (' ' == string[index]) {
                encodedString[encodedIndex++] = '%';
                encodedString[encodedIndex++] = '2';
                encodedString[encodedIndex++] = '0';
                
            } else {
                encodedString[encodedIndex++] = string[index];
            }
        }
        return encodedString;
    }

    private static int spacesCountIn(final char[] string) {
        int spacesCounter = 0;
        for (int i = 0; i < string.length; i++) {
            if (' ' == string[i])
                spacesCounter++;
        }
        return spacesCounter;
    }

}
