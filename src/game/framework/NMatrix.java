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
public class NMatrix implements Serializable 
{
    /**
     * 2D array of floats representing the data in the Matrix.
     */
    public final float[][] data;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor / Default Constructor
     * Takes a 2d-array of floats and creates a new NMatrix with the data.
     * @param data 
     */
    public NMatrix(float[][] data)
    {
        this.data = data;
    }
    
    /**
     * Copy Constructor
     * Creates a copy of the matrix provided.
     * @param a A Matrix we want to copy.
     */
    public NMatrix(NMatrix a)
    {
        this(a.data);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    public static NMatrix add(NMatrix a, NMatrix b)
    {
        return null;
    }
    
    public NMatrix add(NMatrix that)
    {
        return NMatrix.add(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Determinant">
    public static float determinant(NMatrix a)
    {
        return 0;
    }
    
    public float determinant()
    {
        return NMatrix.determinant(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    public static NMatrix divide(NMatrix a, float scalar)
    {
        return null;
    }
    
    public NMatrix divide(float scalar)
    {
        return NMatrix.divide(this, scalar);
    }
    
    public static NMatrix divide(NMatrix a, NMatrix b)
    {
        return null;
    }
    
    public NMatrix divide(NMatrix that)
    {
        return NMatrix.divide(this, that);
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
    public static NMatrix inverse(NMatrix a)
    {
        return null;
    }
    
    public NMatrix inverse()
    {
        return NMatrix.inverse(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LU Decomposition">
    public static NMatrix[] luDecomposition(NMatrix a)
    {
        return null;
    }
    
    public NMatrix[] luDecomposition()
    {
        return NMatrix.luDecomposition(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public static NMatrix multiply(NMatrix a, float scalar)
    {
        return null;
    }
    
    public NMatrix multiply(float scalar)
    {
        return NMatrix.multiply(this, scalar);
    }
    
    public NMatrix multiply(NMatrix a, NMatrix b)
    {
        return null;
    }
    
    public NMatrix multiply(NMatrix that)
    {
        return NMatrix.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Rank">
    public static int rank(NMatrix a)
    {
        return 0;
    }
    
    public int rank()
    {
        return NMatrix.rank(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reduced Row Echelon Form (rref)">
    public static NMatrix rref(NMatrix a)
    {
        return null;
    }
    
    public NMatrix rref()
    {
        return NMatrix.rref(this);
    }
    //</editor-fold>
 
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    public static NMatrix identity(int size)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public static NMatrix subtract(NMatrix a, NMatrix b)
    {
        return null;
    }
    
    public NMatrix subtract(NMatrix that)
    {
        return NMatrix.subtract(this, that);
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
    public static NMatrix transpose(NMatrix a)
    {
        return null;
    }
    
    public NMatrix transpose()
    {
        return NMatrix.transpose(this);
    }
    //</editor-fold>
    
    
    
    
}