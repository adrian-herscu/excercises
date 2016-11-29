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
public class Question16 {

    /**
     * @param matrix
     * @return
     */
    public static long[][] rotate(final long[][] matrix) {
        final int dimension = matrix.length;
        final long[][] rotated = new long[dimension][dimension];

        for (int row = 0; row < dimension; row++) {
            for (int col = 0; col < dimension; col++) {
                rotated[row][col] = matrix[dimension - col - 1][row];
            }
        }

        return rotated;
    }

    /**
     * @param matrix
     * @return
     */
    public static long[][] rotateInPlace(long[][] matrix) {
        // TODO Auto-generated method stub
        return matrix;
    }

}
