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
public class Question18 {

    /**
     * @param original
     * @param rotated
     * @return
     */
    public static boolean isRotated(String original, String rotated) {
        return (original + original).contains(rotated);
    }

}
