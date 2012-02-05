package game.framework;

import java.io.Serializable;

/**
 * A generalized Matrix with n x m dimensions.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Determinant</li>
 *  <li>Equals</li>
 *  <li>Inverse</li>
 *  <li>LU-Decomposition</li>
 *  <li>Rank</li>
 *  <li>Reduced Row Echelon Form</li>
 * </ul>
 * @version incomplete
 * @author mike, paul
 */
public class Matrix implements Serializable 
{
    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * 2D array of floats representing the data in the Matrix.
     */
    public final float[][] data;
    
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
     * Takes a 2d-array of floats and creates a new NMatrix with the data.
     * @param data 
     */
    public Matrix(float[][] data)
    {
        this.data = data;
        this.ROWS = data.length;
        this.COLUMNS = data[0].length;
    }
    
    /**
     * Copy Constructor
     * Creates a copy of the matrix provided.
     * @param a A Matrix we want to copy.
     */
    public Matrix(Matrix a)
    {
        this(a.data);
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
        if(a.ROWS == b.ROWS && a.COLUMNS == b.COLUMNS)
        {
            float[][] ws = new float[a.ROWS][a.COLUMNS];
            for(int j = 0; j < a.ROWS; ++j)
            {
                for(int i = 0; i < a.COLUMNS; ++i)
                {
                    ws[j][i] = a.data[j][i] + b.data[j][i];
                }
            }
            sum = new Matrix(ws);
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
        return 0;
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
     * @return Returns a / scalar.
     */
    public static Matrix divide(Matrix a, float scalar)
    {
        float[][] ws = new float[a.ROWS][a.COLUMNS];
        for(int j = 0; j < a.ROWS; ++j)
        {
            for(int i = 0; i < a.COLUMNS; ++i)
            {
                ws[j][i] = a.data[j][i] / scalar; 
            }
        }
        return new Matrix(ws);
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
     * @return Returns a / b.
     */
    public static Matrix divide(Matrix a, Matrix b)
    {
        Matrix quotient = null;
        if(a.ROWS == b.ROWS && a.COLUMNS == b.COLUMNS)
        {
            float[][] ws = new float[a.ROWS][a.COLUMNS];
            for(int j = 0; j < a.ROWS; ++j)
            {
                for(int i = 0; i < a.COLUMNS; ++i)
                {
                    ws[j][i] = a.data[j][i] / b.data[j][i]; 
                }
            }
            quotient = new Matrix(ws);
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
    @Override
    public boolean equals(Object obj)
    {
        return false;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Helper Methods">
    /**
     * Search an array to see if any rows contain all zero.
     * @param a A Matrix we want to search for all zero rows.
     * @return Returns an array listing which rows contain all zeros.
     */
    private static boolean[] findZeros(Matrix a)
    {
        boolean[] zeros = new boolean[a.ROWS];
        // Search for any rows containing all zeros.
        for(int j = 0; j < a.ROWS; ++j)
        {
            int count = 0;
            for(int i = 0; i < a.COLUMNS; ++i)
            {
                if(a.data[j][i] == 0)
                    ++count;
            }
            if(count == a.COLUMNS)
                zeros[j] = true;
        }
        return zeros;
    }
    
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inverse">
    public static Matrix inverse(Matrix a)
    {
        return null;
    }
    
    public Matrix inverse()
    {
        return Matrix.inverse(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LU Decomposition">
    public static Matrix[] luDecomposition(Matrix a)
    {
        return null;
    }
    
    public Matrix[] luDecomposition()
    {
        return Matrix.luDecomposition(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Multiplies a scalar value into the Matrix.
     * @param a A Matrix we want to multiply.
     * @param scalar A scalar value we want to multiply into the provided Matrix.
     * @return Returns scalar * A.
     */
    public static Matrix multiply(Matrix a, float scalar)
    {
        float[][] ws = new float[a.ROWS][a.COLUMNS];
        for(int j = 0; j < a.ROWS; ++j)
        {
            for(int i = 0; i < a.COLUMNS; ++i)
            {
                ws[j][i] = a.data[j][i] * scalar;
            }
        }
        return new Matrix(ws);
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
     * Perform Matrix multiplication between two matrices.
     * @param a A Matrix we want to multiply.
     * @param b A matrix we want to multiply.
     * @return Returns a * b.
     */
    public static Matrix multiply(Matrix a, Matrix b)
    {
        Matrix product = null;
        if(a.COLUMNS == b.ROWS)
        {
            float[][] ws = new float[a.ROWS][b.COLUMNS];
            for(int j = 0; j < a.ROWS; ++j)
            {
                for(int i = 0; i < b.COLUMNS; ++i)
                {
                    for(int k = 0; k < a.COLUMNS; ++k)
                    {
                        ws[j][i] += a.data[j][k] * b.data[k][i]; 
                    }
                }
            }
            product = new Matrix(ws);
        }
        return product;
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
    public static int rank(Matrix a)
    {
        return 0;
    }
    
    public int rank()
    {
        return Matrix.rank(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reduced Row Echelon Form (rref)">
    /**
     * Step 1: Check for a row containing all zeros
     * Step 2: If a11 is zero swap places with another row to make it non-zero
     * Step 3: Start going through each row and setting up the pivot points through. Repeat until done.
     * @param a A Matrix we want to find the Reduced Row Echelon Form of.
     * @return Returns the Reduced Row Echelon Form of A. 
     */
    public static Matrix rref(Matrix a)
    {
        Matrix rref = null;
        boolean[] zeroRows = Matrix.findZeros(a);
        for(int i = 0; i < zeroRows.length; ++i)
            System.out.println("Is row[" + i + "] zero?" + zeroRows[i]);
        return rref;
    }
    
    public Matrix rref()
    {
        return Matrix.rref(this);
    }
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    /**
     * nxn Identity Matrix
     * @param n A integer defininf the size of the Identity Matrix.
     * @return Returns a nxn Identity Matrix.
     */
    public static Matrix identity(int n)
    {
        float[][] ws = new float[n][n];
        for(int i = 0; i < n; ++i)
        {
            ws[i][i] = 1;
        }
        return new Matrix(ws);
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
        Matrix sum = null;
        if(a.ROWS == b.ROWS && a.COLUMNS == b.COLUMNS)
        {
            float[][] ws = new float[a.ROWS][a.COLUMNS];
            for(int j = 0; j < a.ROWS; ++j)
            {
                for(int i = 0; i < a.COLUMNS; ++i)
                {
                    ws[j][i] = a.data[j][i] - b.data[j][i];
                }
            }
            sum = new Matrix(ws);
        }
        return sum;
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
    @Override
    public String toString()
    {
        String out = "";
        for(int j = 0; j < this.ROWS; ++j)
        {
            for(int i = 0; i < this.COLUMNS; ++i)
            {
                out += this.data[j][i] + " ";
            }
            out += "\n";
        }
        return out;
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
        float[][] t = new float[a.COLUMNS][a.ROWS];
        for(int j = 0; j < a.ROWS; ++j)
        {
            for(int i = 0; i < a.COLUMNS; ++i)
            {
                t[i][j] = a.data[j][i];
            }
        }
        return new Matrix(t);
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
}