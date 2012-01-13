package game.framework;

import java.io.Serializable;

/**
 * A class that represents a matrix using a 2D array
 * @author mike, paul
 */
public class Matrix implements Serializable {
    
    /**
     * A variable that stores the default amount of rows in a Matrix
     */
    private final static int DEFAULT_SIZE_ROW = 10;
    
    /**
     * A variable that stores the default amount of columns in a Matrix
     */
    private final static int DEFAULT_SIZE_COlUMN = 10;
    
    /**
     * The 2D array that stores the data inside of the Matrix
     */
    private float[][] matrix;
    
    /**
     * The amount of rows this Matrix has
     */
    private int rows;
    
    /**
     * The amount of columns this matrix has
     */
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
     * A constructor that copies a Matrix
     * @param matrix the Matrix that will be copied.
     */
    public Matrix(Matrix matrix){
        this(matrix.getData());
    }

    /**
     * Constructs a new Matrix with null data but with the dimensions specified
     *
     * @param rows the amount of rows the new Matrix will have
     * @param columns the amount of columns the new Matrix will have.
     */
    public Matrix(int rows, int columns) {
        this(new float[rows][columns]);
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
        return Matrix.add(this, matrix);
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
    
    /**
     * Multiply this Matrix with another matrix
     * @param matrix the second Matrix
     * @return the result of this * matrix
     */
    public Matrix multiply(Matrix matrix){
        return Matrix.multiply(this,matrix);
    }    
   
     /**
     * Generates a String representing all of the data in this Matrix
     * @return the String that represents the data
     */
    @Override
    public String toString(){
        String str = "";
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                str += this.matrix[i][j] + " ";
            }
            str += "\n";
        }
        return str;
    }

    public static Matrix identity(int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    /**
     * returns an identity matrix if and only if the matrix argument is square
     * @param matrix the square matrix
     * @return an identity Matrix that has the same dimensions as the Matrix argument
     */
    public static Matrix identity(Matrix matrix){
        int dimention;
        boolean isSquare;
        
        isSquare = matrix.rows == matrix.columns;
        
        if(isSquare){
            dimention = matrix.rows;
        }else dimention = 0;
        
        return identity(dimention);
    }
    
    public Matrix identity(){
        return Matrix.identity(this);
    }
    
    public static Matrix transpose(Matrix matrix){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public Matrix transpose(){
        return Matrix.transpose(this);
    }
    
    public static Matrix vectorToMatrix(Vector2 vector2){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public static Matrix vectorToMatrix(Vector3 vector3){
        throw new UnsupportedOperationException("Not yet implemented");
    }
    
    public static Matrix vectorToMatrix(Vector4 vector4){
        throw new UnsupportedOperationException("Not yet implemented");
    }
}