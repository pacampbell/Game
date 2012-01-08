package game.framework;

import java.io.Serializable;

/**
 * @author mike, paul
 */
public class Matrix implements Serializable {

    private final static int DEFAULT_SIZE_ROW = 10;
    private final static int DEFAULT_SIZE_COlUMN = 10;
    private float[][] matrix;
    private int rows;
    private int columns;

    /**
     * Constructs a Matrix that contains all of the data from the 2D array input
     *
     * @param matrix a 2D array containing all of that data to be included in
     * the new Matrix
     */
    public Matrix(float[][] matrix) {
        this.matrix = matrix;
        this.rows = matrix.length;
        this.columns = matrix[0].length;
    }

    /**
     * Constructs a new Matrix with null data but with the dimensions specified
     *
     * @param rows the amount of rows the new Matrix will have
     * @param columns the amount of columns the new Matrix will have.
     */
    public Matrix(int rows, int columns) {
        this.matrix = new float[rows][columns];
        this.rows = rows;
        this.columns = columns;
    }

    /**
     * A default constructor that constructs a new Matrix with null data and
     * with the dimensions specified in the DEFAULT_SIZE_ROW and
     * DEFAULT_SIZE_COlUMN variables
     */
    public Matrix() {
        this(new float[DEFAULT_SIZE_ROW][DEFAULT_SIZE_COlUMN]);
    }

    /**
     * Returns the number of columns in the matrix
     *
     * @return the amount of rows in this Matrix
     */
    public int getColumns() {
        return columns;
    }

    /**
     * Returns the number of rows in the matrix
     *
     * @return the amount of rows in this Matrix
     */
    public int getRows() {
        return rows;
    }

    /**
     * Returns a clone of the 2D array inside this Matrix
     *
     * @return the data inside of this Matrix
     */
    public float[][] getData() {
        return matrix.clone();
    }

    /**
     * Adds two matrices together
     *
     * @param matrix1 the first matrix to be added
     * @param matrix2 the second matrix to be added
     * @return a Matrix containing the result of matrix1 + matrix2
     */
    public static Matrix add(Matrix matrix1, Matrix matrix2) {
        Boolean addable = (matrix1.rows == matrix2.rows) && (matrix1.columns == matrix2.columns);
        float[][] a = matrix1.getData();
        float[][] b = matrix2.getData();
        float[][] summed = null;

        if (addable) {
            summed = new float[matrix1.rows][matrix2.columns];
            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {
                    summed[i][j] = a[i][j] + b[i][j];
                }
            }
        }//END IF
        return new Matrix(summed);
    }

    /**
     * adds a matrix to this matrix
     *
     * @param matrix the second matrix to be added
     * @return a Matrix containing the result of this + matrix
     */
    public Matrix add(Matrix matrix) {
        return add(this, matrix);
    }

    /**
     * Subtracts two matrices from each other
     *
     * @param matrix1 the first matrix to be subtracted
     * @param matrix2 the second matrix to be subtracted
     * @return a Matrix containing the result of matrix1 - matrix2
     */
    public static Matrix subtract(Matrix matrix1, Matrix matrix2) {
        Boolean subtractable = (matrix1.rows == matrix2.rows) && (matrix1.columns == matrix2.columns);
        float[][] a = matrix1.getData();
        float[][] b = matrix2.getData();
        float[][] differance = null;

        if (subtractable) {
            differance = new float[matrix1.rows][matrix2.columns];
            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {
                    differance[i][j] = a[i][j] - b[i][j];
                }
            }
        }//END IF
        return new Matrix(differance);
    }

    /**
     * Subtracts a matrix from this matrix
     *
     * @param matrix the matrix that will be subtracted from this matrix
     * @return a Matrix containing the result of this - matrix
     */
    public Matrix subtract(Matrix matrix) {
        return subtract(this, matrix);
    }

    /**
     * Multiply two matrices together
     * @param matrix1 the first Matrix
     * @param matrix2 the second Matrix
     * @return the result of matrix1 * matrix2
     */
    public static Matrix multiply(Matrix matrix1, Matrix matrix2) {
        float[][] result = new float[0][0];
        float[][] data1;
        float[][] data2;
        
        if (matrix1.columns == matrix2.rows) {
            data1 = matrix1.getData();
            data2 = matrix2.getData();
            result = new float[matrix1.rows][matrix2.columns];

            for (int i = 0; i < matrix1.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {
                    for (int k = 0; k < matrix1.columns; k++) {
                        result[i][j] += data1[i][k] * data2[k][j];
                    }
                }
            }
        }
        return new Matrix(result);
    }
    
    public Matrix multiply(Matrix matrix){
        return multiply(this,matrix);
    }
}
