package game.framework;

/**
 * Matrix class representing a 3x3 matrix.
 * Can be used with the java AffineTransform.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Add</li>
 *  <li>Constructors</li>
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
 *  <li>Identity</li>
 *  <li>Invert</li>
 *  <li>Linear Interpolation</li>
 *  <li>LU Decomposition</li>
 *  <li>Multiply</li>
 *  <li>Negate</li>
 *  <li>Row Echelon Form</li>
 *  <li>Reduced Row Echelon Form</li>
 *  <li>Subtract</li>
 *  <li>To String</li>
 *  <li>Transform</li>
 *  <li>Transpose</li>
 * </ul>
 * @version incomplete
 * @author paul
 */

public class Matrix3 
{
    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * Value at row 1 column 1 of this Matrix.
     */
    public final float M11; 
    
    /**
     * Value at row 1 column 2 of this Matrix.
     */
    public final float M12;
    
    /**
     * Value at row 1 column 3 of this Matrix.
     */
    public final float M13; 
    
    /**
     * Value at row 2 column 1 of this Matrix.
     */
    public final float M21; 
    
    /**
     * Value at row 2 column 2 of this Matrix.
     */
    public final float M22; 
    
    /**
     * Value at row 2 column 3 of this Matrix.
     */
    public final float M23; 
    
    /**
     * Value at row 3 column 1 of this Matrix.
     */
    public final float M31; 
    
    /**
     * Value at row 3 column 2 of this Matrix.
     */
    public final float M32; 
    
    /**
     * Value at row 3 column 3 of this Matrix.
     */
    public final float M33; 
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * Creates a Matrix with the float[][] provided.
     * @param data An array of float[9] containing the representation of a Matrix. 
     */
    public Matrix3(float[] data)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Creates a Matrix with the elements provided.
     * @param M11 Value at row 1 column 1 of Matrix.
     * @param M12 Value at row 1 column 2 of Matrix.
     * @param M13 Value at row 1 column 3 of Matrix.
     * @param M21 Value at row 2 column 1 of Matrix.
     * @param M22 Value at row 2 column 2 of Matrix.
     * @param M23 Value at row 2 column 3 of Matrix.
     * @param M31 Value at row 3 column 1 of Matrix.
     * @param M32 Value at row 3 column 2 of Matrix.
     * @param M33 Value at row 3 column 3 of Matrix.
     */
    public Matrix3(float M11, float M12, float M13, 
                   float M21, float M22, float M23, 
                   float M31, float M32, float M33)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Copy Constructor
     * Creates a new Matrix with identical properties of the Matrix provided.
     * @param matrix A Matrix we want to copy. 
     */
    public Matrix3(Matrix3 matrix)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Empty Constructor / Default Constructor
     * Creates an identity matrix.
     */
    public Matrix3()
    {
        this(Matrix3.identity());
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs addition with two Matrix3.
     * @param a A Matrix3 we want to add.
     * @param b A Matrix3 we want to add.
     * @return Returns a + b.
     */
    public static Matrix3 add(Matrix3 a, Matrix3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Performs addition with this Matrix3 and that Matrix3.
     * @param that A Matrix3 we want to add.
     * @return Returns this + that.
     */
    public Matrix3 add(Matrix3 that)
    {
        return Matrix3.add(this, that);
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
    /**
     * Calculates the determinant of the Matrix3.
     * @param a A Matrix3 we want to find the determinant of.
     * @return Returns DET(A).
     */
    public static float determinant(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Calculates the determinant of this Matrix.
     * @return Returns det this.
     */
    public float determinant()
    {
        return Matrix3.determinant(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    /**
     * Divides each component of a Matrix3 by a scalar value.
     * @param a A Matrix3 we want to divide.
     * @param scalar A scalar value we want to divide by.
     * @return Returns A / scalar.
     */
    public static Matrix3 divide(Matrix3 a, float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Divides each component of this Matrix3 by a scalar value.
     * @param scalar A scalar value we want to divide by.
     * @return Returns this / scalar.
     */
    public Matrix3 divide(float scalar)
    {
        return Matrix3.divide(this, scalar);
    }
    
    /**
     * Matrix3 b divides Matrix3 a component wise.
     * @param a A Matrix3 we want to divide.
     * @param b A Matrix3 we want to divide. 
     * @return Returns A / B.
     */
    public static Matrix3 divide(Matrix3 a, Matrix3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Matrix3 that divides Matrix3 this component wise.
     * @param that A Matrix3 we want to divide.
     * @return Returns this / that.
     */
    public Matrix3 divide(Matrix3 that)
    {
        return Matrix3.divide(this, that);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Checks the equality between this Matrix3 and an Object believed to be a Matrix3.
     * @param obj An object believed to be a Matrix3. 
     * @return Returns this == that.
     */
    @Override
    public boolean equals(Object obj)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Invert">
    /**
     * Finds the Inverse of a Matrix3.
     * @param a A Matrix3 we want to find the inverse of.
     * @return Returns the inverse of A. If no inverse exists a null Matrix3 is returned.
     */
    public static Matrix3 invert(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the Inverse of this Matrix3.
     * @return Returns the inverse of this Matrix3.
     */
    public Matrix3 invert()
    {
        return Matrix3.invert(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static void lerp()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="LU Decomposition">
    /**
     * Performs LU Decomposition of a Matrix3.
     * @param a A Matrix3 we want to perform LU decomposition on.
     * @return Returns an array containing a lower triangular Matrix3 L and a upper triangular Matrix3 U where LU = A.
     */
    public static Matrix3[] luDecomposition(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Performs LU Decomposition of this Matrix3.
     * @return Returns an array containing a lower triangular Matrix3 and a upper triangular Matrix3.
     */
    public Matrix3[] luDecomposition()
    {
        return Matrix3.luDecomposition(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Perform Matrix3 multiplication between two matrices.
     * @param a A Matrix3 we want to multiply.
     * @param b A matrix3 we want to multiply.
     * @return Returns a * b.
     */
    public static Matrix3 multiply(Matrix3 a, Matrix3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Perform Matrix3 multiplication between this Matrix3 and that Matrix3.
     * @param that A Matrix3 we want to multiply.
     * @return Returns this * that.
     */
    public Matrix3 multiply(Matrix3 that)
    {
        return Matrix3.multiply(this, that);
    }
    
    /**
     * Multiplies a scalar value into the Matrix3.
     * @param a A Matrix3 we want to multiply.
     * @param scalar A scalar value we want to multiply into the provided Matrix3.
     * @return Returns scalar * a
     */
    public static Matrix3 multiply(Matrix3 a, float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    /**
     * Multiplies a scalar value into this Matrix3.
     * @param scalar A scalar value we want to multiply into the provided Matrix3.
     * @return Returns scalar * this.
     */
    public Matrix3 multiply(float scalar)
    {
        return Matrix3.multiply(this, scalar);
    }
    
    /**
     * Matrix Vector multiplication
     * @param a A Matrix3 that we want to multiply.
     * @param x A Vector3 that we want to multiply.
     * @return Returns a Vector3 containing the product of Ax.
     */
    public static Vector4 multiply(Matrix3 a, Vector3 x)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Matrix Vector multiplication
     * @param v A Vector3 that we want to multiply with this Matrix3.
     * @return Returns a Vector3 containing the product of Ax.
     */
    public Vector4 multiply(Vector3 x)
    {
        return Matrix3.multiply(this, x);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * Negates all the components of a Matrix3.
     * @param a A Matrix3 we want to negate.
     * @return Returns -A.
     */
    public static Matrix3 negate(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Negates all the components of this Matrix3.
     * @return Returns -this.
     */
    public Matrix3 negate()
    {
        return Matrix3.negate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Row Echelon Form">
    /**
     * Finds the Row Echelon Form of a Matrix3.
     * @param a A Matrix3 to find the row echelon form of.
     * @return Returns a Matrix3 representing the row echelon form of A.
     */
    public static Matrix3 ref(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the Row Echelon Form of this Matrix3.
     * @return Returns a Matrix3 representing the row echelon form of this.
     */
    public Matrix3 ref()
    {
        return Matrix3.ref(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reduced Row Echelon Form">
    /**
     * Finds the Reduced Row Echelon Form(rref) of the provided Matrix3.
     * @param a A Matrix3 we want to find the rref of.
     * @return Returns a Matrix3 in Reduced Row Echelon Form.
     */
    public static Matrix3 rref(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the Reduced Row Echelon Form(rref) of this Matrix3.
     * @return Returns a Matrix3 in Reduced Row Echelon Form.
     */
    public Matrix3 rref()
    {
        return Matrix3.rref(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Matrices">
    /**
     * @return Returns the identity of a Matrix3. 
     */
    public static Matrix3 identity()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    /**
     * Performs subtraction between two matrices.
     * @param a A Matrix3 we want to subtract from.
     * @param b A Matrix3 we want to subtract with.
     * @return Returns a - b.
     */
    public static Matrix3 subtract(Matrix3 a, Matrix3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Subtracts that Matrix3 from this Matrix3.
     * @param that A Matrix3 we want to subtract.
     * @return Returns this - that.
     */
    public Matrix3 subtract(Matrix3 that)
    {
        return Matrix3.subtract(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To-String">
    /**
     * @return Returns a String representation of a Matrix3. 
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transform">
    public static void transform()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transpose">
    /**
     * Transposes the provided Matrix3.
     * @param a A Matrix3 we want to transpose.
     * @return Returns the transpose of Matrix3 A.
     */
    public static Matrix3 transpose(Matrix3 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Transposes this Matrix3.
     * @return Returns the transpose of this Matrix3.
     */
    public Matrix3 transpose()
    {
        return Matrix3.transpose(this);
    }
    //</editor-fold>
}
