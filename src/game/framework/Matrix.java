package game.framework;

import java.io.Serializable;

/**
 * A generalized Matrix with n x m dimensions.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Determinant</li>
 *  <li>Inverse</li>
 *  <li>LU-Decomposition</li>
 *  <li>Multiply</li>
 *  <li>Rank</li>
 *  <li>Reduced Row Echelon Form</li>
 *  <li>Row Echelon Form</li>
 *  <li>Transpose</li>
 * </ul>
 * @version incomplete
 * @author mike, paul
 */
public class Matrix implements Serializable 
{
    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * Array of floats representing the data in the Matrix.
     */
    public final float[] data;
    
    /**
     * A integer that contains the number of rows in the Matrix.
     */
    public final int ROWS; 
    
    /**
     * A integer that contains the number of columns in the Matrix.
     */
    public final int COLUMNS;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor / Default Constructor
     * Takes a array of floats and creates a new Matrix with the data.
     * @param data An array of floats containing the data of the Matrix.
     * @param rows Integer representing the number of rows in the Matrix.
     * @param columns Integer representing the number of columns in the Matrix.
     */
    public Matrix(float[] data, int rows, int columns)
    {
        // If we have bad data throw a RuntimeException.
        if(data == null || rows < 1 || columns < 1)
            throw new InvalidDimensionsException();
        this.data = data;
        this.ROWS = rows;
        this.COLUMNS = columns;
    }
    
    /**
     * Copy Constructor
     * Creates a copy of the matrix provided.
     * @param a A Matrix we want to copy.
     */
    public Matrix(Matrix a)
    {
        this(a.data, a.ROWS, a.COLUMNS);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs addition with two Matrices.
     * @param a A Matrix to be added.
     * @param b A Matrix to be added. 
     * @return Returns a + b.
     */
    public static Matrix add(Matrix a, Matrix b)
    {
        Matrix sum = null;
        if(a.data.length == b.data.length)
        {
            float[] ws = new float[a.data.length];
            for (int i = 0; i < a.data.length; i++) 
            {
                ws[i] = a.data[i] + b.data[i];
            }
            sum = new Matrix(ws, a.ROWS, a.COLUMNS);
        }
        return sum;
    }
    
    /**
     * Performs addition with this Matrix and that Matrix.
     * @param that A Matrix to be added.
     * @return Returns this + that.
     */
    public Matrix add(Matrix that)
    {
        return Matrix.add(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Determinant">
    public static float determinant(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public float determinant()
    {
        return Matrix.determinant(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    /**
     * Divides each component of a Matrix by a scalar value.
     * @param a A Matrix we want to divide.
     * @param scalar A scalar value we want to divide by.
     * @return Returns A / scalar.
     */
    public static Matrix divide(Matrix a, float scalar)
    {
        float[] ws = new float[a.data.length];
        for(int i = 0; i < ws.length; i++)
            ws[i] = a.data[i] / scalar;
        return new Matrix(ws, a.ROWS, a.COLUMNS);
    }
    
    /**
     * Divides each component of this Matrix by a scalar value.
     * @param scalar A scalar value we want to divide by.
     * @return Returns this / scalar.
     */
    public Matrix divide(float scalar)
    {
        return Matrix.divide(this, scalar);
    }
    
    /**
     * b Matrix divides a Matrix component wise.
     * @param a A Matrix we want to divide.
     * @param b A Matrix we want to divide. 
     * @return Returns A / B.
     */
    public static Matrix divide(Matrix a, Matrix b)
    {
        Matrix quotient = null;
        if(a.data.length == b.data.length)
        {
            float[] ws = new float[a.data.length];
            for(int i = 0; i < ws.length; i++)
            {
                ws[i] = a.data[i] / b.data[i];
            }
            quotient = new Matrix(ws, a.ROWS, a.COLUMNS);
        }
        return quotient;
    }
    
    /**
     * that Matrix divides this Matrix component wise.
     * @param that A Matrix we want to divide.
     * @return Returns this / that.
     */
    public Matrix divide(Matrix that)
    {
        return Matrix.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Compares this Matrix with another Object believed to be a Matrix.
     * @param obj An object believed to be a Matrix.
     * @return Returns the comparison of this == that.
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean equals = false;
        if(obj == this)
            equals = true;
        else if(obj != null && obj instanceof Matrix)
        {
            Matrix that = (Matrix)obj;
            if(this.data.length == that.data.length)
            {
                equals = true;
                for(int i = 0; i < this.data.length; i++)
                {
                    equals &= (this.data[i] == that.data[i]);
                }
            }
        }
        return equals;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Helper Methods">
    /**
     * Adds the data of two rows together.
     * @param row1 Data of a row to be added.
     * @param row2 Data of a row to be added.
     * @return row1 + row2.
     */
    private static float[] addRow(float[] row1, float[] row2)
    {
        float[] n_row = null;
        if(row1.length == row2.length)
        {
            n_row = new float[row1.length];
            for(int i = 0; i < row1.length; ++i)
                n_row[i] = row1[i] + row2[i];
        }
        return n_row;
    }
    
    /**
     * Multiplies the data of a row by a scalar value.
     * @param row Data of a row to scale.
     * @param scalar A value to scale the row by.
     * @return Returns row * scalar.
     */
    private static float[] multiplyRow(float[] row, float scalar)
    {
        float[] ws = new float[row.length];
        for(int i = 0; i < row.length; i++)
            ws[i] = row[i] * scalar;
        return ws;
    }
    
    /**
     * Replaces a row in a 2D-Array.
     * @param a Data of Matrix with row to be replaced.
     * @param index Index of row to be replaced.
     * @param row Data of new row.
     */
    private static void replaceRow(float[][] a, int index, float[] row)
    {
        a[index] = row;
    }
    
    /**
     * Debug Method prints out row contents
     */
    private static void rowPrinter(float[] row)
    {
        for(int i = 0; i < row.length; i++)
            System.out.print(row[i] + " ");
        System.out.println("");
    }
    
    /**
     * Moves all rows containing all zero to the bottom of the Matrix.
     * @param a A float[][] containing the data of a Matrix. 
     * @return Returns A Matrix with zeros in the proper locations for methods like rref.
     */
    private static float[][] swapZeros(float[][] a)
    {
        float[][] ws = a.clone();
        int startIndex = ws.length - 1;
        int endIndex = 0;
        for(int i = 0; i < a.length; ++i)
        {
            if(startIndex > endIndex && Matrix.zeroRow(ws, i))
            {
                for(int j = startIndex; j >= endIndex; --j)
                {
                    if(!Matrix.zeroRow(ws, j))
                    {
                        Matrix.swapRows(ws, i, j);
                        --startIndex; // With Each successfull swap this zero row is now in place. 
                        break;
                    }
                }
            }
            ++endIndex; // After Each iteration that row is considered sorted.
        }
        return ws;
    }
    
    /**
     * Swaps the rows of a float[][].
     * @param a A float[][] containing the data we want to swap the rows of.
     * @param r1 The index of a row we want to swap.
     * @param r2 The index of a row we want to swap.
     */
    private static void swapRows(float[][] a, int r1, int r2)
    {
        float[] temp = a[r1];
        a[r1] = a[r2];
        a[r2] = temp;
    }
    
    /**
     * Checks to see if a row is zero.
     * @param a A float[][] containing the data of a Matrix.
     * @param row The row index that we want to check.
     * @return Returns true if the row is all zeros.
     */
    private static boolean zeroRow(float[][] a, int row)
    {
        boolean zero = true;
        for(int i = 0; i < a[0].length; ++i)
            zero &= a[row][i] == 0;
        return zero;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inverse">
    public static Matrix inverse(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Matrix inverse()
    {
        return Matrix.inverse(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LU Decomposition">
    public static Matrix[] luDecomposition(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Matrix[] luDecomposition()
    {
        return Matrix.luDecomposition(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Helper Method for multiplying the data of a Matrix
     * @param a Data of a matrix we want to multiply.
     * @param scalar A scalar value we want to multiply into the provided data.
     * @return Returns scalar * A
     */
    private static float[] multiply(float[] a, float scalar)
    {
        float[] ws = new float[a.length];
        for(int i = 0; i < a.length; ++i)
        {
            ws[i] = a[i] * scalar; 
        }
        return ws;
    }
    
    /**
     * Multiplies a scalar value into the Matrix.
     * @param a A Matrix we want to multiply.
     * @param scalar A scalar value we want to multiply into the provided Matrix.
     * @return Returns scalar * A.
     */
    public static Matrix multiply(Matrix a, float scalar)
    {
        return new Matrix(Matrix.multiply(a.data, scalar), a.ROWS, a.COLUMNS);
    }
    
    /**
     * Multiplies a scalar value into this Matrix.
     * @param scalar A scalar value we want to multiply into the provided Matrix.
     * @return Returns scalar * this.
     */
    public Matrix multiply(float scalar)
    {
        return Matrix.multiply(this, scalar);
    }
    
    /**
     * Helper Method for Multiplying the data of two matrices. 
     * @param a Data of a matrix we want to multiply.
     * @param b Data of a Matrix we want to multiply.
     * @return Returns a * b.
     */
    private static float[] multiply(float[] a, float[] b, int aRows, int aColumns, int bRows, int bColumns)
    {
        float[] product = null;
        if(aColumns == bRows)
        {
            product = new float[aRows * bColumns];
            for(int k = 0; k < aRows; k++)
            {
                
            }
        }
        return product;
    }
    
    /**
     * Perform Matrix multiplication between two matrices.
     * @param a A Matrix we want to multiply.
     * @param b A matrix we want to multiply.
     * @return Returns a * b.
     */
    public static Matrix multiply(Matrix a, Matrix b)
    {
        float[] mData = Matrix.multiply(a.data, b.data, a.ROWS, a.COLUMNS, b.ROWS, b.COLUMNS);
        return new Matrix
                (
                    mData, 
                    (mData != null) ? a.ROWS : 0, 
                    (mData != null) ? b.COLUMNS : 0
                );
    }
    
    /**
     * Perform Matrix multiplication between this Matrix and that Matrix.
     * @param that A Matrix we want to multiply.
     * @return Returns this * that.
     */
    public Matrix multiply(Matrix that)
    {
        return Matrix.multiply(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rank">
    /**
     * Computes the rank of the provided Matrix.
     * @param a A Matrix we want to find the rank of.
     * @return Returns the ran of the Matrix.
     */
    public static int rank(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Computes the rank of this Matrix.
     * @return Returns the rank of this Matrix.
     */
    public int rank()
    {
        return Matrix.rank(this);
    }
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Row Echelon Form (ref)">
    /**
     * Finds the Row Echelon Form(ref) of the provided Matrix.
     * @param a A Matrix we want to find the Row Echelon Form of.
     * @return Returns a Matrix in Row Echelon Form. 
     */
    public static Matrix ref(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the Row Echelon Form(ref) of this Matrix.
     * @return Returns a Matrix in Row Echelon Form.
     */
    public Matrix ref()
    {
        return Matrix.ref(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reduced Row Echelon Form (rref)">
    /**
     * Finds the Reduced Row Echelon Form(rref) of the provided Matrix.
     * @param a A Matrix we want to find the rref of.
     * @return Returns a Matrix in Reduced Row Echelon Form.
     */
    public static Matrix rref(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the Reduced Row Echelon Form(rref) of this Matrix.
     * @return Returns a Matrix in Reduced Row Echelon Form.
     */
    public Matrix rref()
    {
        return Matrix.rref(this);
    }
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    /**
     * nxn Identity Matrix
     * @param n Integer defining the size of the Identity Matrix.
     * @return Returns a nxn Identity Matrix.
     */
    public static Matrix identity(int n)
    {
        float[] ws = new float[n * n];
        for(int i = 0; i < n; ++i)
            ws[i * n] = 1;
        return new Matrix(ws, n, n);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    /**
     * Performs subtraction between two Matrices.
     * @param a A Matrix to be subtracted from.
     * @param b A Matrix to subtract by. 
     * @return Returns a - b.
     */
    public static Matrix subtract(Matrix a, Matrix b)
    {
        Matrix difference = null;
        if(a.data.length == b.data.length)
        {
            float[] ws = new float[a.data.length];
            for (int i = 0; i < a.data.length; i++) 
            {
                ws[i] = a.data[i] - b.data[i];
            }
            difference = new Matrix(ws, a.ROWS, a.COLUMNS);
        }
        return difference;
    }
    
    /**
     * Performs subtraction between this Matrix and that Matrix. 
     * @param that A Matrix to subtract by.
     * @return Returns this - that.
     */
    public Matrix subtract(Matrix that)
    {
        return Matrix.subtract(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To-String">
    /**
     * Produces a String representation of the Matrix.
     * @return Returns the String representation of the Matrix.
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transpose">
    /**
     * Creates the transpose of a Matrix.
     * @param a A Matrix we want to transpose.
     * @return Returns the transpose of A.
     */
    public static Matrix transpose(Matrix a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Creates the transpose of this Matrix.
     * @return Returns the transpose of this.
     */
    public Matrix transpose()
    {
        return Matrix.transpose(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Invalid Dimensions Exception">
    /**
     * Custom Exception for Matrix classes.
     */
    private class InvalidDimensionsException extends RuntimeException
    {
        /**
         * Complete Constructor.
         * @param msg String containing the message outputted to console.
         */
        public InvalidDimensionsException(String msg)
        {
            super(msg);
        }
        
        /**
         * Default Constructor.
         * Echos out the text "The Dimensions of the Matrix are Invalid."
         */
        public InvalidDimensionsException()
        {
            super("The Dimensions of the Matrix are Invalid.");
        }
    }
    //</editor-fold>
}