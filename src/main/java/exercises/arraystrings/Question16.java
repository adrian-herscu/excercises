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
public class Question16 {

    /**
     * @param matrix
     * @return
     */
    public static long[][] rotateRight(final long[][] matrix) {
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
    public static long[][] rotateRightInPlace(long[][] matrix) {
        final int dimension = matrix.length;
        for (int layer = 0; layer < dimension / 2; layer++) {
            final int first = layer;
            final int last = dimension - layer - 1;
            for (int forwardIndex = first; forwardIndex < last; forwardIndex++) {
                final int backwardIndex = dimension - forwardIndex - 1;
                final long tmp = matrix[backwardIndex][first];
                matrix[backwardIndex][first] = matrix[last][backwardIndex];
                matrix[last][backwardIndex] = matrix[forwardIndex][last];
                matrix[forwardIndex][last] = matrix[first][forwardIndex];
                matrix[first][forwardIndex] = tmp;
            }
        }
        return matrix;
    }

}
