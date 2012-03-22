package game.framework;

/**
 * Quaternion represents a 4D Vector. Used for rotation around 
 * an object about the (x, y, z) vector by the angle theta, where w = cos(theta/2).
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Concatenate</li>
 *  <li>Conjugate</li>
 *  <li>CreateFromAxisAngle</li>
 *  <li>CreateFromRotationMatrix</li>
 *  <li>CreateFromYawPitchRoll</li>
 *  <li>Inverse</li>
 *  <li>Linear Interpolation</li>
 *  <li>Spherical Linear Interpolation</li>
 * </ul>
 * @version incomplete
 * @author paul
 */
public class Quaternion 
{   
    //<editor-fold defaultstate="collapsed" desc="Properties">
    /**
     * The x value of the vector component of the Quaternion.  
     */
    public final float x;
    
    /**
     * The y value of the vector component of the Quaternion.  
     */
    public final float y;
    
    /**
     * The z value of the vector component of the Quaternion.  
     */
    public final float z;
 
    /**
     * The rotation component of the Quaternion.
     */
    public final float w;
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Complete Constructor.
     * @param x Float representing the x value of the vector component of the Quaternion.
     * @param y Float representing the y value of the vector component of the Quaternion.
     * @param z Float representing the z value of the vector component of the Quaternion.
     * @param w Float representing the rotation component of the Quaternion.
     */
    public Quaternion(float x, float y, float z, float w)
    {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }
    
    /**
     * Creates a Quaternion with a Vector3 and a float value representing the rotation of the quaternion.
     * @param v Vector3 representing the x, y, z values of the Quaternion.
     * @param w Float representing the rotation component of the Quaternion.
     */
    public Quaternion(Vector3 v, float w)
    {
        this(v.x, v.y, v.z, w);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Adds two Quaternion together.
     * @param a Quaternion to be added.
     * @param b Quaternion to be added.
     * @return Returns a + b. 
     */
    public static Quaternion add(Quaternion a, Quaternion b)
    {
        return new Quaternion(a.x + b.x, a.y + b.y, a.z + b.z, a.w + b.w);
    }
    
    /**
     * Adds this Quaternion with that Quaternion.
     * @param that Quaternion to be added.
     * @return Returns this + that.
     */
    public Quaternion add(Quaternion that)
    {
        return Quaternion.add(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Concatenate">
    public static Quaternion concatenate(Quaternion a, Quaternion b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Quaternion concatenate(Quaternion that)
    {
        return Quaternion.concatenate(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Conjugate">
    public static Quaternion conjugate(Quaternion q)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Quaternion conjugate()
    {
        return Quaternion.conjugate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create Axis From Angle">
    public static Quaternion createAxisFromAngle(Vector3 v, float angle)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create From Rotation Matrix">
    public static Quaternion createFromRotationMatrix(Matrix3 m)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Create From Yaw Pitch Roll">
    public static Quaternion createFromYawPitchRoll(float yaw, float pitch, float roll)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    /**
     * Performs component wise division with two Quaternion. 
     * @param a Quaternion to be divided.
     * @param b Quaternion to divide by.
     * @return Returns a new Quaternion with the components of a divided by the components of b.
     */
    public static Quaternion divide(Quaternion a, Quaternion b)
    {
        return new Quaternion(a.x / b.x, a.y / b.y, a.z / b.z, a.w / b.w);
    }
    
    /**
     * Divides this Quaternion component wise by that Quaternion.
     * @param that Quaternion to divide by.
     * @return Returns a new Quaternion with the components of this divided by the components of that.
     */
    public Quaternion divide(Quaternion that)
    {
        return Quaternion.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    /**
     * Performs the dot product between two Quaternion.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param a A Quaternion that we want to perform the dot product with.
     * @param b A Quaternion that we want to perform the dot product with.
     * @return Returns a dot b.
     */
    public static float dotProduct(Quaternion a, Quaternion b)
    {
        return (a.x * b.x) + (a.y + b.y) + (a.z + b.z) + (a.w + b.w);
    }
    
    /**
     * Performs the dot product between this Quaternion and that Quaternion.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param that A Quaternion that we want to perform the dot product with.
     * @return Returns this dot that.
     */
    public float dotProduct(Quaternion that)
    {
        return Quaternion.dotProduct(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Checks to see if two Quaternion are equal to each other.
     * @param obj Object believed to be a Quaternion.
     * @return Returns this == that.
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean equals = false;
        if(obj != null)
        {
            if(this == obj)
                equals = true;
            else if(obj instanceof Quaternion)
            {
                Quaternion that = (Quaternion)obj;
                equals = (this.x == that.x) && (this.y == that.y) && 
                         (this.z == that.z) && (this.w == that.w); 
            }
        }
        return equals;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Identity">
    /**
     * Creates the Identity Quaternion.
     * @return Returns a Quaternion with the components (0, 0, 0, 1). 
     */
    public static Quaternion identity()
    {
        return new Quaternion(0, 0, 0, 1);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inverse">
    public static Quaternion inverse(Quaternion q)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Quaternion inverse()
    {
        return Quaternion.inverse(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    /**
     * Finds the magnitude of the Quaternion.
     * @param q A Quaternion to find the magnitude of.
     * @return Returns the magnitude of the Quaternion. 
     */
    public static float magnitude(Quaternion q)
    {
        return (float)Math.sqrt(Quaternion.magnitudeSquared(q));
    }
    
    /**
     * Finds the magnitude of this Quaternion.
     * @return Returns the magnitude of this Quaternion. 
     */
    public float magnitude()
    {
        return Quaternion.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    /**
     * Finds the magnitude squared of the Quaternion.
     * @param q A Quaternion to find the magnitude squared of.
     * @return Returns the magnitude squared of the Quaternion. 
     */
    public static float magnitudeSquared(Quaternion q)
    {
        return (q.x * q.x) + (q.y * q.y) + (q.z * q.z) + (q.w * q.w); 
    }
    
    /**
     * Finds the magnitude squared of this Quaternion.
     * @return Returns the magnitude squared of this Quaternion. 
     */
    public float magnitudeSquared()
    {
        return Quaternion.magnitudeSquared(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static float lerp(Quaternion a, Quaternion b, float amount)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public float lerp(Quaternion that, float amount)
    {
        return Quaternion.lerp(this, that, amount);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Scales the components of a by the components of b.
     * @param a A Quaternion to be scaled.
     * @param b A Quaternion to scale by.
     * @return Returns a new Quaternion with the components of a scaled by the components of b.
     */
    public static Quaternion multiply(Quaternion a, Quaternion b)
    {
        return new Quaternion(a.x * b.x, a.y * b.y, a.z * b.z, a.w * b.w);
    }
    
    /**
     * Scales the components of this by the components of that.
     * @param that A Quaternion to scale by.
     * @return Returns a new Quaternion with the components of this scaled by the components of that.
     */
    public Quaternion multiply(Quaternion that)
    {
        return Quaternion.multiply(this, that);
    }
    
    /**
     * Scales a Quaternion by a scalar.
     * @param q Quaternion to be scaled.
     * @param scalar Float to scale the Quaternion by.
     * @return Returns scalar * q
     */
    public static Quaternion multiply(Quaternion q, float scalar)
    {
        return new Quaternion(q.x * scalar, q.y * scalar, q.y * scalar, q.w * scalar);
    }
    
    /**
     * Scales this Quaternion by a scalar.
     * @param scalar Float to scale the Quaternion by.
     * @return Returns scalar * this.
     */
    public Quaternion multiply(float scalar)
    {
        return Quaternion.multiply(this, scalar);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * Negates the provided Quaternion.
     * @param q Quaternion to be negated.
     * @return Returns the negation of the provided Quaternion.
     */
    public static Quaternion negate(Quaternion q)
    {
        return new Quaternion(-q.x, -q.y, -q.z, -q.w);
    }
    
    /**
     * Negates this Quaternion.
     * @return Returns the negation of this Quaternion.
     */
    public Quaternion negate()
    {
        return Quaternion.negate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    /**
     * Normalizes the provided Quaternion.
     * @param q A Quaternion to be normalized.
     * @return Returns q normalized.
     */
    public static Quaternion normalize(Quaternion q)
    {
        float magnitude = Quaternion.magnitude(q);
        return new Quaternion(q.x / magnitude, q.y / magnitude, q.z / magnitude, q.w / magnitude);
    }
    
    /**
     * Normalizes this Quaternion.
     * @return Returns this Quaternion normalized.
     */
    public Quaternion normalize()
    {
        return Quaternion.normalize(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Spherical Linear Interpolation">
    public static Quaternion slerp(Quaternion a, Quaternion b, float amount)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Quaternion slerp(Quaternion that, float amount)
    {
        return Quaternion.slerp(this, that, amount);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    /**
     * Finds the difference between two Quaternion.
     * @param a Quaternion to be subtracted from.
     * @param b Quaternion to be subtracted by.
     * @return Returns a - b.
     */
    public static Quaternion subtract(Quaternion a, Quaternion b)
    {
        return new Quaternion(a.x - b.x, a.y - b.y, a.z - b.z, a.w - b.w);
    }
    
    /**
     * Finds this difference between this Quaternion and that Quaternion.
     * @param that Quaternion to be subtracted by.
     * @return Returns this - that. 
     */
    public Quaternion subtract(Quaternion that)
    {
        return Quaternion.subtract(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Creates a String representation of this Quaternion.
     * @return Returns a String representing this Quaternion.
     */
    @Override
    public String toString()
    {
        return "(" + this.x + ", " + this.y + ", " + this.z + ", " + this.w + ")";
    }
    //</editor-fold>
}
