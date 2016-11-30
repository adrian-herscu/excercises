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
public class Question17 {

    private static class Coords<T> {
        public Coords(final T row, final T column) {
            this.row = row;
            this.column = column;
        }

        final T row;
        final T column;
    }

    /**
     * @param matrix
     * @return
     */
    public static long[][] fillZerosInColumnAndRow(final long[][] matrix) {
        for(final Coords<Integer> zeroCoords : listOfZerosIn(matrix)) {
            for(int row = 0; row < matrix.length; row++) {
                matrix[row][zeroCoords.column] = 0;
            }
            for(int column = 0; column < matrix[0].length; column++) {
                matrix[zeroCoords.row][column] = 0;
            }
        }
        return matrix;
    }

    /**
     * @param matrix
     * @return
     */
    private static List<Coords<Integer>> listOfZerosIn(long[][] matrix) {
        final List<Coords<Integer>> listOfZeros = new LinkedList<>();
        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[row].length; column++) {
                if (0 == matrix[row][column])
                    listOfZeros.add(new Coords<>(row, column));
            }
        }
        return listOfZeros;
    }

}
