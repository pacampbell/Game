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
 *  <li>Invert</li>
 *  <li>Linear Interpolation</li>
 *  <li>Transform</li>
 * </ul>
 * @version incomplete
 * @author paul
 */

public class Matrix 
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
     * Value at row 1 column 4 of this Matrix.
     */
    public final float M14; 
    
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
     * Value at row 2 column 4 of this Matrix.
     */
    public final float M24; 
    
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
    
    /**
     * Value at row 3 column 4 of this Matrix.
     */
    public final float M34; 
    
    /**
     * Value at row 4 column 1 of this Matrix.
     */
    public final float M41; 
    
    /**
     * Value at row 4 column 2 of this Matrix.
     */
    public final float M42; 
    
    /**
     * Value at row 4 column 3 of this Matrix.
     */
    public final float M43; 
    
    /**
     * Value at row 4 column 4 of this Matrix.
     */
    public final float M44;
    
    /**
     * Internal Representation of the matrix to simplify certain calculations.
     */
    private final float[][] data;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * Creates a Matrix with the float[][] provided.
     * @param data An array of float[4][4] containing the representation of a Matrix. 
     */
    public Matrix(float[][] data)
    {
        this.data = data;
        this.M11 = data[0][0];
        this.M12 = data[0][1];
        this.M13 = data[0][2];
        this.M14 = data[0][3];
        this.M21 = data[1][0];
        this.M22 = data[1][1];
        this.M23 = data[1][2];
        this.M24 = data[1][3];
        this.M31 = data[2][0];
        this.M32 = data[2][1];
        this.M33 = data[2][2];
        this.M34 = data[2][3];
        this.M41 = data[3][0];
        this.M42 = data[3][1]; 
        this.M43 = data[3][2];
        this.M44 = data[3][3];
    }
    
    /**
     * Creates a Matrix with the elements provided.
     * @param M11 Value at row 1 column 1 of Matrix.
     * @param M12 Value at row 1 column 2 of Matrix.
     * @param M13 Value at row 1 column 3 of Matrix.
     * @param M14 Value at row 1 column 4 of Matrix.
     * @param M21 Value at row 2 column 1 of Matrix.
     * @param M22 Value at row 2 column 2 of Matrix.
     * @param M23 Value at row 2 column 3 of Matrix.
     * @param M24 Value at row 2 column 4 of Matrix.
     * @param M31 Value at row 3 column 1 of Matrix.
     * @param M32 Value at row 3 column 2 of Matrix.
     * @param M33 Value at row 3 column 3 of Matrix.
     * @param M34 Value at row 3 column 4 of Matrix.
     * @param M41 Value at row 4 column 1 of Matrix.
     * @param M42 Value at row 4 column 2 of Matrix.
     * @param M43 Value at row 4 column 3 of Matrix.
     * @param M44 Value at row 4 column 4 of Matrix. 
     */
    public Matrix(float M11, float M12, float M13, float M14, 
                  float M21, float M22, float M23, float M24, 
                  float M31, float M32, float M33, float M34, 
                  float M41, float M42, float M43, float M44)
    {
        this(
                new float[][]
                {
                    {M11, M12, M13, M14},
                    {M21, M22, M23, M24},
                    {M31, M32, M33, M34},
                    {M41, M42, M43, M44}
                });
    }
    
    /**
     * Copy Constructor
     * Creates a new Matrix with identical properties of the Matrix provided.
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
     * Creates an identity matrix.
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
    /**
     * Calculates the determinant of the matrix.
     * @param a A Matrix we want to find the determinant of.
     * @return Returns det A.
     */
    public static float determinant(Matrix a)
    {
        float r1 =  a.M11 * ((a.M22 * (a.M23 * a.M44 - a.M34 * a.M43)) - (a.M23 * (a.M32 * a.M44 - a.M34 * a.M42)) + (a.M24 * (a.M32 * a.M43 - a.M33 * a.M42))); 
        float r2 = -a.M12 * ((a.M21 * (a.M33 * a.M44 - a.M34 * a.M43)) - (a.M22 * (a.M31 * a.M44 - a.M34 * a.M41)) + (a.M24 * (a.M31 * a.M42 - a.M32 * a.M41)));
        float r3 =  a.M13 * ((a.M21 * (a.M32 * a.M44 - a.M34 * a.M42)) - (a.M22 * (a.M31 * a.M44 - a.M34 * a.M41)) + (a.M24 * (a.M31 * a.M42 - a.M32 * a.M41)));
        float r4 = -a.M14 * ((a.M21 * (a.M32 * a.M43 - a.M33 * a.M42)) - (a.M22 * (a.M31 * a.M43 - a.M33 * a.M41)) + (a.M23 * (a.M31 * a.M42 - a.M32 * a.M41)));
        return r1 + r2 + r3 + r4;
    }
    
    /**
     * Calculates the determinant of this Matrix.
     * @return Returns det this.
     */
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
        return new Matrix
                (
                    a.M11 / scalar, a.M12 / scalar, a.M13 / scalar, a.M14 / scalar,
                    a.M21 / scalar, a.M22 / scalar, a.M23 / scalar, a.M24 / scalar,
                    a.M31 / scalar, a.M32 / scalar, a.M33 / scalar, a.M34 / scalar,
                    a.M41 / scalar, a.M42 / scalar, a.M43 / scalar, a.M44 / scalar
                );
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
     * Matrix b divides Matrix a component wise.
     * @param a A Matrix we want to divide.
     * @param b A Matrix we want to divide. 
     * @return Returns a / b.
     */
    public static Matrix divide(Matrix a, Matrix b)
    {
        return new Matrix
                (
                    a.M11 / b.M11, a.M12 / b.M12, a.M13 / b.M13, a.M14 / b.M14,
                    a.M21 / b.M21, a.M22 / b.M22, a.M23 / b.M23, a.M24 / b.M24,
                    a.M31 / b.M31, a.M32 / b.M32, a.M33 / b.M33, a.M34 / b.M34,
                    a.M41 / b.M41, a.M42 / b.M42, a.M43 / b.M43, a.M44 / b.M44
                );
    }
    
    /**
     * Matrix that divides Matrix this component wise.
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
     * Checks to see if the Object provided is a matrix. 
     * If so is it equals to this Matrix.
     * @param obj An object believed to be a Matrix. 
     * @return Returns this == that.
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean equals = false;
        if(obj != null && obj instanceof Matrix)
        {
            Matrix that = (Matrix)obj;
            if(this.M11 == that.M11 && this.M12 == that.M12 && this.M13 == that.M13 && this.M14 == that.M14 &&
               this.M21 == that.M21 && this.M22 == that.M22 && this.M23 == that.M23 && this.M24 == that.M24 &&
               this.M31 == that.M31 && this.M32 == that.M32 && this.M33 == that.M33 && this.M34 == that.M34 &&
               this.M41 == that.M41 && this.M42 == that.M42 && this.M43 == that.M43 && this.M44 == that.M44)
                equals = true;
        }
        return equals;
        
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Hash Code">
    /**
     * Generates a hash code for this Matrix.
     * Auto-Generated by the IDE.
     * @return Returns the hash code for this Matrix.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Float.floatToIntBits(this.M11);
        hash = 73 * hash + Float.floatToIntBits(this.M12);
        hash = 73 * hash + Float.floatToIntBits(this.M13);
        hash = 73 * hash + Float.floatToIntBits(this.M14);
        hash = 73 * hash + Float.floatToIntBits(this.M21);
        hash = 73 * hash + Float.floatToIntBits(this.M22);
        hash = 73 * hash + Float.floatToIntBits(this.M23);
        hash = 73 * hash + Float.floatToIntBits(this.M24);
        hash = 73 * hash + Float.floatToIntBits(this.M31);
        hash = 73 * hash + Float.floatToIntBits(this.M32);
        hash = 73 * hash + Float.floatToIntBits(this.M33);
        hash = 73 * hash + Float.floatToIntBits(this.M34);
        hash = 73 * hash + Float.floatToIntBits(this.M41);
        hash = 73 * hash + Float.floatToIntBits(this.M42);
        hash = 73 * hash + Float.floatToIntBits(this.M43);
        hash = 73 * hash + Float.floatToIntBits(this.M44);
        return hash;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Invert">
    /**
     * Finds the Inverse of a Matrix.
     * @param a A Matrix we want to find the inverse of.
     * @return Returns the inverse of a. If no inverse exists a null Matrix is returned.
     */
    public static Matrix invert(Matrix a)
    {
        Matrix[] lud = Matrix.luDecomposition(a);
        Matrix inverse = null;
        if((lud[1].M11 * lud[1].M22 * lud[1].M33 * lud[1].M44) != 0)
        {
            /**
             * Solve L * Z = C
             * Solve U * B = Z
             * B = i-th Column of the Inverse Matrix
             */
            Matrix identity = Matrix.identity();
            float[] z = new float[4];
            float[] c = new float[4];
            float[] b = new float[4];
            float[][] finverse = new float[4][4];
            
            for(int col = 0; col < z.length; ++col)
            {
                for(int row = 0; row < identity.data.length; ++row)
                {
                    c[row] = identity.data[row][col];
                }
                
                z[0] = c[0]; // Z1 will always be equal to c1 at this stage.
                z[1] = -(lud[0].M21 * z[0]);
                z[2] = -(lud[0].M31 * z[0]) - (lud[0].M32 * z[1]);
                z[3] = -(lud[0].M41 * z[0]) - lud[0].M42 * z[1] - lud[0].M43 * z[2]; 
                
                b[3] = z[3] / lud[1].M44;
                b[2] = (z[2] - (lud[1].M34 * b[3])) / lud[1].M33;
                b[1] = (z[1] - (lud[1].M23 * b[2]) - (lud[1].M24 * b[3])) / lud[1].M22;
                b[0] = (z[0] - (lud[1].M12 * b[1]) - (lud[1].M13 * b[2]) - (lud[1].M14 * b[3])) /  lud[1].M11;
                
                for(int i = 0; i < b.length; ++i)
                    finverse[i][col] = b[i];
                
                z = b = new float[4];
            }
            inverse = new Matrix(finverse);
            
        }
        return inverse;
    }
    
    /**
     * Finds the Inverse of this Matrix.
     * @return Returns the inverse of this Matrix.
     */
    public Matrix invert()
    {
        return Matrix.invert(this);
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
     * Performs LU Decomposition of a Matrix.
     * @param a A Matrix we want to perform LU decomposition on.
     * @return Returns an array containing a lower triangular Matrix L and a upper triangular Matrix U where LU = A.
     */
    public static Matrix[] luDecomposition(Matrix a)
    {
        float l21 = a.M21 / a.M11;
        float l31 = a.M31 / a.M11;
        float l41 = a.M41 / a.M11;
        
        
        float u22 = a.M22 - (l21 * a.M12);
        float u23 = a.M23 - (l21 * a.M13);
        float u24 = a.M24 - (l21 * a.M14);
        
        float l32 = (a.M32 - (l31 * a.M12)) / u22;
        float u33 = a.M33 - (l31 * a.M13) - (l32 * u23);
        float u34 = a.M34 - (l31 * a.M14) - (l32 * u24);
        
        float l42 = (a.M42 - (l41 * a.M12)) / u22;
        float l43 = (a.M43 - (l41 * a.M13) - (l42 * u23)) / u33;
        float u44 = a.M44 - (l41 * a.M14) - (l43 * u34);
        
        
        Matrix l = new Matrix(new float[][]
        {
            {1  ,   0,   0, 0},
            {l21,   1,   0, 0},
            {l31, l32,   1, 0},
            {l41, l42, l43, 1}
        });
        
        Matrix u = new Matrix(new float[][]
        {
            {a.M11, a.M12, a.M13, a.M14},
            {0    ,   u22,   u23,   u24},
            {0    ,     0,   u33,   u34},
            {0    ,     0,     0,   u44}
        });
        
        return new Matrix[]{l, u};
    }
    
    /**
     * Performs LU Decomposition of this Matrix.
     * @return Returns an array containing a lower triangular Matrix and a upper triangular Matrix.
     */
    public Matrix[] luDecomposition()
    {
        return Matrix.luDecomposition(this);
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
     * @return Returns scalar * a
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
    
    /**
     * Matrix Vector multiplication
     * @param a A Matrix that we want to multiply.
     * @param x A Vector4 that we want to multiply.
     * @return Returns a Vector4 containing the product of Ax.
     */
    public static Vector4 multiply(Matrix a, Vector4 x)
    {
        return new Vector4
                (
                    a.M11 * x.x + a.M12 * x.y + a.M13 * x.z + a.M14 * x.w,
                    a.M21 * x.x + a.M22 * x.y + a.M23 * x.z + a.M24 * x.w,
                    a.M31 * x.x + a.M32 * x.y + a.M33 * x.z + a.M34 * x.w,
                    a.M41 * x.x + a.M42 * x.y + a.M43 * x.z + a.M44 * x.w
                );
    }
    
    /**
     * Matrix Vector multiplication
     * @param v A Vector4 that we want to multiply with this Matrix.
     * @return Returns a Vector4 containing the product of Ax.
     */
    public Vector4 multiply(Vector4 x)
    {
        return Matrix.multiply(this, x);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * Negates all the components of a Matrix.
     * @param a A Matrix we want to negate.
     * @return Returns -a.
     */
    public static Matrix negate(Matrix a)
    {
        return new Matrix
                (
                    -1 * a.M11, -1 * a.M12, -1 * a.M13, -1 * a.M14,
                    -1 * a.M21, -1 * a.M22, -1 * a.M23, -1 * a.M24,
                    -1 * a.M31, -1 * a.M32, -1 * a.M33, -1 * a.M34,
                    -1 * a.M41, -1 * a.M42, -1 * a.M43, -1 * a.M44
                );
    }
    
    /**
     * Negates all the components of this Matrix.
     * @return Returns -this.
     */
    public Matrix negate()
    {
        return Matrix.negate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reduced Row Echelon Form">
    /**
     * Finds the Reduced Row Echelon Form(rref) of the provided Matrix.
     * @param a A Matrix we want to find the rref of.
     * @return Returns a Matrix in Reduced Row Echelon Form.
     */
    public static Matrix rref(Matrix a)
    {
        Matrix rref = null;
        float[][] ws = a.data; // Set the Working Set to the inital data.
        
        
        return rref;
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
     * Subtracts that Matrix from this Matrix.
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
    /**
     * Transposes the provided Matrix.
     * @param a A Matrix we want to transpose.
     * @return Returns the transpose of Matrix a.
     */
    public static Matrix transpose(Matrix a)
    {
        return new Matrix
                (
                    a.M11, a.M21, a.M31, a.M41,
                    a.M12, a.M22, a.M32, a.M42,
                    a.M13, a.M23, a.M33, a.M43,
                    a.M14, a.M24, a.M34, a.M44
                );
    }
    
    /**
     * Transposes this Matrix.
     * @return Returns the transpose of this Matrix.
     */
    public Matrix transpose()
    {
        return Matrix.transpose(this);
    }
    //</editor-fold>
}
