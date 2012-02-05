package game.framework;

import java.io.Serializable;

/**
 * A generalized Matrix with n x m dimensions.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Add</li>
 *  <li>Determinant</li>
 *  <li>Divide</li>
 *  <li>Equals</li>
 *  <li>Identity</li>
 *  <li>Inverse</li>
 *  <li>LU-Decomposition</li>
 *  <li>Multiply</li>
 *  <li>Rank</li>
 *  <li>Reduced Row Echelon Form</li>
 *  <li>Subtract</li>
 *  <li>To-String</li>
 *  <li>Transpose</li>
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
            float[][] ws = new float[a.COLUMNS][a.ROWS];
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
    public static Matrix divide(Matrix a, float scalar)
    {
        return null;
    }
    
    public Matrix divide(float scalar)
    {
        return Matrix.divide(this, scalar);
    }
    
    public static Matrix divide(Matrix a, Matrix b)
    {
        return null;
    }
    
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
    public static Matrix multiply(Matrix a, float scalar)
    {
        return null;
    }
    
    public Matrix multiply(float scalar)
    {
        return Matrix.multiply(this, scalar);
    }
    
    public Matrix multiply(Matrix a, Matrix b)
    {
        return null;
    }
    
    public Matrix multiply(Matrix that)
    {
        return Matrix.divide(this, that);
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
    public static Matrix rref(Matrix a)
    {
        return null;
    }
    
    public Matrix rref()
    {
        return Matrix.rref(this);
    }
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    public static Matrix identity(int size)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public static Matrix subtract(Matrix a, Matrix b)
    {
        return null;
    }
    
    public Matrix subtract(Matrix that)
    {
        return Matrix.subtract(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To-String">
    @Override
    public String toString()
    {
        return "";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transpose">
    public static Matrix transpose(Matrix a)
    {
        return null;
    }
    
    public Matrix transpose()
    {
        return Matrix.transpose(this);
    }
    //</editor-fold>
    
    
    
    
}