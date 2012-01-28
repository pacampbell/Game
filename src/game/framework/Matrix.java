package game.framework;

/**
 * Matrix class representing a 4x4 matrix.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Create Billboard</li>
 *  <li>Create Constrained Billboard</li>
 *  <li>Create from Axis Angle</li>
 *  <li>Create from Quaternion</li>
 *  <li>Create from Yaw Pitch Roll</li>
 *  <li>Create Look At</li>
 *  <li>Create Orthographic</li>
 *  <li>Create Orthographic Off-Center</li>
 *  <li>Create Perspective</li>
 *  <li>Create Perspective Field of View</li>
 *  <li>Create Perspective Off Center</li>
 *  <li>Create Reflection</li>
 *  <li>Create Rotation X</li>
 *  <li>Create Rotation Y</li>
 *  <li>Create Rotation Z</li>
 *  <li>Create Scale</li>
 *  <li>Create Shadow</li>
 *  <li>Create Translation</li>
 *  <li>Create World</li>
 *  <li>Decompose</li>
 *  <li>Determinant</li>
 *  <li>Divide</li>
 *  <li>Equals</li>
 *  <li>Invert</li>
 *  <li>Lerp</li>
 *  <li>Negate</li>
 *  <li>To String</li>
 *  <li>Transform</li>
 *  <li>Transpose</li>
 * </ul>
 * @version incomplete
 * @author paul
 */

public class Matrix 
{
    public final float M11; 
    public final float M12;
    public final float M13; 
    public final float M14; 
    public final float M21; 
    public final float M22; 
    public final float M23; 
    public final float M24; 
    public final float M31; 
    public final float M32; 
    public final float M33; 
    public final float M34; 
    public final float M41; 
    public final float M42; 
    public final float M43; 
    public final float M44;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * @param M11
     * @param M12
     * @param M13
     * @param M14
     * @param M21
     * @param M22
     * @param M23
     * @param M24
     * @param M31
     * @param M32
     * @param M33
     * @param M34
     * @param M41
     * @param M42
     * @param M43
     * @param M44 
     */
    public Matrix(float M11, float M12, float M13, float M14, 
                  float M21, float M22, float M23, float M24, 
                  float M31, float M32, float M33, float M34, 
                  float M41, float M42, float M43, float M44)
    {
        this.M11 = M11;
        this.M12 = M12;
        this.M13 = M13;
        this.M14 = M14;
        this.M21 = M21;
        this.M22 = M22;
        this.M23 = M23;
        this.M24 = M24;
        this.M31 = M31;
        this.M32 = M32;
        this.M33 = M33;
        this.M34 = M34;
        this.M41 = M41;
        this.M42 = M42;
        this.M43 = M43;
        this.M44 = M44;
    }
    
    /**
     * @param data An array of float[4][4] containing the representation of a Matrix. 
     */
    public Matrix(float[][] data)
    {
        this(
                data[0][0], data[0][1], data[0][2], data[0][3],
                data[1][0], data[1][1], data[1][2], data[1][3],
                data[2][0], data[2][1], data[2][2], data[2][3],
                data[3][0], data[3][1], data[3][2], data[3][3]
            );
    }
    
    /**
     * Copy Constructor
     * Takes in a matrix that we want to make a copy of.
     * @param matrix A Matrix we want to copy. 
     */
    public Matrix(Matrix matrix)
    {
        this(
                matrix.M11, matrix.M12, matrix.M13, matrix.M14,
                matrix.M21, matrix.M22, matrix.M23, matrix.M24,
                matrix.M31, matrix.M32, matrix.M33, matrix.M34,
                matrix.M41, matrix.M42, matrix.M43, matrix.M44
            );
    }
    
    /**
     * Empty Constructor / Default Constructor
     * Creates a 4x4 identity matrix.
     */
    public Matrix()
    {
        this(Matrix.identity());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs addition with two matrices.
     * @param a A Matrix we want to add.
     * @param b A Matrix we want to add.
     * @return Returns a + b.
     */
    public static Matrix add(Matrix a, Matrix b)
    {
        return new Matrix
                (
                    a.M11 + b.M11, a.M12 + b.M12, a.M13 + b.M13, a.M14 + b.M14,
                    a.M21 + b.M21, a.M22 + b.M22, a.M23 + b.M23, a.M24 + b.M24,
                    a.M31 + b.M31, a.M32 + b.M32, a.M33 + b.M33, a.M34 + b.M34,
                    a.M41 + b.M41, a.M42 + b.M42, a.M43 + b.M43, a.M44 + b.M44
                );
    }
    
    /**
     * Performs addition with this Matrix and that Matrix.
     * @param that A matrix we want to add.
     * @return Returns this + that.
     */
    public Matrix add(Matrix that)
    {
        return Matrix.add(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Billboard">
    public static void createBillboard()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Constrained Billboard">
    public static void createConstrainedBillboard()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create From Axis Angle">
    public static void createFromAxisAngle()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create From Quaternion">
    public static void createFromQuaternion()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create From Yaw Pitch Roll">
    public static void createFromYawPitchRoll()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Look At">
    public static void createLookAt()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Orthographic">
    public static void createOrthographic()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Orthographic Off-Center">
    public static void createOrthographicOffCenter()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Perspective">
    public static void createPerspective()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Perspective Field of View">
    public static void createPerspectiveFieldOfView()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Perspective Off-Center">
    public static void createPerspectiveOffCenter()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Reflection">
    public static void createReflection()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Rotation X">
    public static void createRotationX()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Rotation Y">
    public static void createRotationY()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Rotation Z">
    public static void createRotationZ()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Scale">
    public static void createScale()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Shadow">
    public static void createShadow()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Translation">
    public static void createTranslation()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create World">
    public static void createWorld()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Decompose">
    public static void decompose()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Determinant">
    public static void determinant()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    public static void divide()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    public static void equals()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Invert">
    public static void invert()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static void lerp()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Perform Matrix multiplication between two matrices.
     * @param a A Matrix we want to multiply.
     * @param b A matrix we want to multiply.
     * @return Returns a * b.
     */
    public static Matrix multiply(Matrix a, Matrix b)
    {
        return new Matrix
                (
                    (a.M11 * b.M11) + (a.M12 * b.M21) + (a.M13 * b.M31) + (a.M14 * b.M41), (a.M11 * b.M12) + (a.M12 * b.M22) + (a.M13 * b.M32) + (a.M14 * b.M42), (a.M11 * b.M13) + (a.M12 * b.M23) + (a.M13 * b.M33) + (a.M14 * b.M43), (a.M11 * b.M14) + (a.M12 * b.M24) + (a.M13 * b.M34) + (a.M14 * b.M44),   
                    (a.M21 * b.M11) + (a.M22 * b.M21) + (a.M23 * b.M31) + (a.M24 * b.M41), (a.M21 * b.M12) + (a.M22 * b.M22) + (a.M23 * b.M32) + (a.M24 * b.M42), (a.M21 * b.M13) + (a.M22 * b.M23) + (a.M23 * b.M33) + (a.M24 * b.M43), (a.M21 * b.M14) + (a.M22 * b.M24) + (a.M23 * b.M34) + (a.M24 * b.M44),
                    (a.M31 * b.M11) + (a.M32 * b.M21) + (a.M33 * b.M31) + (a.M34 * b.M41), (a.M31 * b.M12) + (a.M32 * b.M22) + (a.M33 * b.M32) + (a.M34 * b.M42), (a.M31 * b.M13) + (a.M32 * b.M23) + (a.M33 * b.M33) + (a.M34 * b.M43), (a.M31 * b.M14) + (a.M32 * b.M24) + (a.M33 * b.M34) + (a.M34 * b.M44),
                    (a.M41 * b.M11) + (a.M42 * b.M21) + (a.M43 * b.M31) + (a.M44 * b.M41), (a.M41 * b.M12) + (a.M42 * b.M22) + (a.M43 * b.M32) + (a.M44 * b.M42), (a.M41 * b.M13) + (a.M42 * b.M23) + (a.M43 * b.M33) + (a.M44 * b.M43), (a.M41 * b.M14) + (a.M42 * b.M24) + (a.M43 * b.M34) + (a.M44 * b.M44)
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
    
    /**
     * Multiplies a scalar value into the Matrix.
     * @param a A Matrix we want to multiply.
     * @param scalar A scalar value we want to multiply into the provided Matrix.
     * @return Returns scalar * Matrix.
     */
    public static Matrix multiply(Matrix a, float scalar)
    {
        return new Matrix
                (
                    scalar * a.M11, scalar * a.M12, scalar * a.M13, scalar * a.M14,
                    scalar * a.M21, scalar * a.M22, scalar * a.M23, scalar * a.M24,
                    scalar * a.M31, scalar * a.M32, scalar * a.M33, scalar * a.M34,
                    scalar * a.M41, scalar * a.M42, scalar * a.M43, scalar * a.M44
                );
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
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    public static void negate()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    /**
     * @return Returns the identity of a 4x4 matrix. 
     */
    public static Matrix identity()
    {
        float temp[][] = {
                            {1, 0, 0, 0},
                            {0, 1, 0, 0},
                            {0, 0, 1, 0},
                            {0, 0, 0, 1}
                         };
        return new Matrix(temp);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    /**
     * Performs subtraction between two matrices.
     * @param a A Matrix we want to subtract from.
     * @param b A Matrix we want to subtract with.
     * @return Returns a - b.
     */
    public static Matrix subtract(Matrix a, Matrix b)
    {
        return new Matrix
                (
                    a.M11 - b.M11, a.M12 - b.M12, a.M13 - b.M13, a.M14 - b.M14,
                    a.M21 - b.M21, a.M22 - b.M22, a.M23 - b.M23, a.M24 - b.M24,
                    a.M31 - b.M31, a.M32 - b.M32, a.M33 - b.M33, a.M34 - b.M34,
                    a.M41 - b.M41, a.M42 - b.M42, a.M43 - b.M43, a.M44 - b.M44
                );
    }
    
    /**
     * Performs subtraction between this Matrix and that Matrix.
     * @param that A matrix we want to subtract.
     * @return Returns this - that.
     */
    public Matrix subtract(Matrix that)
    {
        return Matrix.subtract(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To-String">
    /**
     * @return Returns a String representation of a Matrix. 
     */
    @Override
    public String toString()
    {
        return  M11 + " " + M12 + " " + M13 + " " + M14 + "\n" + 
                M21 + " " + M22 + " " + M23 + " " + M24 + "\n" + 
                M31 + " " + M32 + " " + M33 + " " + M34 + "\n" + 
                M41 + " " + M42 + " " + M43 + " " + M44 + "\n";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transform">
    public static void transform()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transpose">
    public static void transpose()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
}
