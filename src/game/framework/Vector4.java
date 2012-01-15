package game.framework;

/**
 * Vector4 class representing a vector of <x, y, z, w> components.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Barycentric</li>
 *  <li>CatmullRom</li>
 *  <li>Clamp</li>
 *  <li>Distance</li>
 *  <li>Distance Squared</li>
 *  <li>Divide</li>
 *  <li>Dot Product</li>
 *  <li>Equals</li>
 *  <li>Hermite</li>
 *  <li>Linear Interpolation</li>
 *  <li>Magnitude</li>
 *  <li>Magnitude Squared</li>
 *  <li>Max</li>
 *  <li>Min</li>
 *  <li>Multiply</li>
 *  <li>Negate</li>
 *  <li>Normalize</li>
 *  <li>Subtract</li>
 *  <li>SmoothStep</li>
 *  <li>Transform</li>
 * </ul>
 * @version incomplete
 * @author paul
 */
public class Vector4 extends Vector3
{
    /**
     * The w component of the Vector4.
     */
    public final float w;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * Sets x, y, z, and w components of the Vector4
     * @param x x component of Vector4
     * @param y y component of Vector4
     * @param z z component of Vector4
     * @param w w component of Vector4
     */
    public Vector4(float x, float y, float z, float w)
    {
        super(x, y, z);
        this.w = w;
    }
    
    /**
     * Sets x, y, z, and w components of the Vector4. 
     * Converts integer arguments to float.
     * @param x x component of Vector4
     * @param y y component of Vector4
     * @param z z component of Vector4
     * @param w w component of Vector4
     */
    public Vector4(int x, int y, int z, int w)
    {
        this((float)x, (float)y, (float)z, (float)w);
    }
    
    /**
     * Sets x, y, z, and w components of Vector4 to value.
     * @param value Float value used to set all components to.
     */
    public Vector4(float value)
    {
        this(value, value, value, value);
    }
    
    
    /**
     * Sets x, y, z, and w components of Vector4 to value.
     * Converts integer arguments to float.
     * @param value Integer value used to set all components to.
     */
    public Vector4(int value)
    {
        this((int)value, (int)value, (int)value, (int)value);
    }
    
    /**
     * Empty Constructor.
     * Sets all components of the Vector4 to zero.
     */
    public Vector4()
    {
        this(0.0f, 0.0f, 0.0f, 0.0f);
    }
    
    /**
     * Copy Constructor.
     * Makes a copy of the Vector4 provided.
     * @param copy Vector4 to be copied.
     */
    public Vector4(Vector4 copy)
    {
        this(copy.x, copy.y , copy.z, copy.w);
    }
    
    /**
     * Creates a Vector4 with a Vector3 parameter.
     * @param vec3 A Vector3 we want to change to a Vector4.
     */
    public Vector4(Vector3 vec3)
    {
        this(vec3.x, vec3.y, vec3.z, 0.0f);
    }
    
    /**
     * Creates a Vector4 with a Vector3 and a float w.
     * @param vec3 A Vector3 we want to change to a Vector4.
     * @param w A float value we want to set the w value to.
     */
    public Vector4(Vector3 vec3, float w)
    {
        this(vec3.x, vec3.y, vec3.z, w);
    }
    
    /**
     * Creates a Vector4 with a Vector2.
     * @param vec2 A Vector2 we want to change to a Vector4.
     */
    public Vector4(Vector2 vec2)
    {
        this(vec2.x, vec2.y, 0.0f, 0.0f);
    }
    
    /**
     * Creates a Vector4 with a Vector2, a float z, and a float w.
     * @param vec2 A Vector3 we want to change to a Vector4.
     * @param z A float value we want to set the z value to.
     * @param w A float value we want to set the w value to.
     */
    public Vector4(Vector2 vec2, float z, float w)
    {
        this(vec2.x, vec2.y, z, w);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs Vector4 Addition on two Vector4
     * @param a Vector4 to be added
     * @param b Vector4 to be added
     * @return Returns the result of a + b
     */
    public static Vector4 add(Vector4 a, Vector4 b)
    {
        return new Vector4(a.x + b.x, a.y + b.y, a.z + b.z, a.w + b.w);
    }
    
    /**
     * Performs Vector4 addition with a Vector4 and a Vector3
     * @param a Vector4 to be added.
     * @param b Vector3 to be added.
     * @return Returns the result of a + b.
     */
    public static Vector4 add(Vector4 a, Vector3 b)
    {
        return Vector4.add(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 addition with a Vector4 and a Vector2
     * @param a Vector4 to be added.
     * @param b Vector2 to be added.
     * @return Returns the result of a + b.
     */
    public static Vector4 add(Vector4 a, Vector2 b)
    {
        return Vector4.add(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector4
     * @param that Vector4 to be added.
     * @return returns the result of this + that.
     */
    public Vector4 add(Vector4 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector3
     * @param that Vector3 to be added.
     * @return Returns the result of this + that.
     */
    @Override
    public Vector4 add(Vector3 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and a Vector3 and a w value.
     * @param that Vector3 to be added.
     * @param w The w component to append to the Vector3.
     * @return Returns this + that;
     */
    public Vector4 add(Vector3 that, float w)
    {
        return Vector4.add(this, new Vector4(that, w));
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and that Vector2
     * @param that Vector2 to be added.
     * @return Returns the result of this + that.
     */
    @Override
    public Vector4 add(Vector2 that)
    {
        return Vector4.add(this, that);
    }
    
    /**
     * Performs Vector4 addition with this Vector4 and a Vector2, a z value, and a w value.
     * @param that Vector2 to be added.
     * @param z The z component to append to the Vector2.
     * @param w The w component to append to the Vector2.
     * @return Returns this + that;
     */
    public Vector4 add(Vector2 that, float z, float w)
    {
        return Vector4.add(this, new Vector4(that, z, w));
    }
    
    /**
     * Performs addition with this Vector4 and the x, y, z, and w values provided.
     * @param x The x component we want to add to this Vector4.
     * @param y The y component we want to add to this Vector4.
     * @param z The z component we want to add to this Vector4.
     * @param w The w component we want to add to this Vector4. 
     * @return Returns a Vector4 with x added to this.x, y added to this.y, z added to this.z, and w added to this.w
     */
    public Vector4 add(float x, float y, float z, float w)
    {
        return Vector4.add(this, new Vector4(x, y, z, w));
    }
    
    /**
     * Performs addition with this Vector4 and the x, y, z, and w values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector4.
     * @param y The y component we want to add to this Vector4.
     * @param z The z component we want to add to this Vector4.
     * @param w The w component we want to add to this Vector4. 
     * @return Returns a Vector4 with x added to this.x, y added to this.y, z added to this.z, and w added to this.w
     */
    public Vector4 add(int x, int y, int z, int w)
    {
        return Vector4.add(this, new Vector4(x, y, z, w));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param x The x value we want to add to this Vector4.
     * @return Returns a Vector4 with x added to this.x
     */
    @Override
    public Vector4 addX(float x)
    {
        return Vector4.add(this, new Vector4(x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * Converts integer arguments to float.
     * @param x The x value we want to add to this Vector4.
     * @return Returns a Vector4 with x added to this.x
     */
    @Override
    public Vector4 addX(int x)
    {
        return Vector4.add(this, new Vector4((float)x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the y component.
     * @param y The y value we want to add to this Vector4.
     * @return Returns a Vector4 with y added to this.y
     */
    @Override
    public Vector4 addY(float y)
    {
        return Vector4.add(this, new Vector4(0.0f, y, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the y component.
     * Converts integer arguments to float.
     * @param y The y value we want to add to this Vector4.
     * @return Returns a Vector4 with y added to this.y
     */
    @Override
    public Vector4 addY(int y)
    {
        return Vector4.add(this, new Vector4(0.0f, (float)y, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the z component.
     * @param z The z value we want to add to this Vector4.
     * @return Returns a Vector4 with z added to this.z
     */
    @Override
    public Vector4 addZ(float z)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, z, 0.0f));
    }
    
    
    /**
     * Adds the value provided to the z component.
     * Converts integer arguments to float.
     * @param z The z value we want to add to this Vector4.
     * @return Returns a Vector4 with z added to this.z
     */
    @Override
    public Vector4 addZ(int z)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, (float)z, 0.0f));
    }
    
    /**
     * Adds the value provided to the w component.
     * @param w The w value we want to add to this Vector4.
     * @return Returns a Vector4 with w added to this.w
     */
    public Vector4 addW(float w)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, 0.0f, w));
    }

    /**
     * Adds the value provided to the w component.
     * Converts integer arguments to float.
     * @param w The w value we want to add to this Vector4.
     * @return Returns a Vector4 with w added to this.w
     */
    public Vector4 addW(int w)
    {
        return Vector4.add(this, new Vector4(0.0f, 0.0f, 0.0f, (float)w));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Barycentric">
    public static Vector4 barycentric()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CatmullRom">
    public static Vector4 catmullRom()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    public static Vector4 clamp(Vector4 value, Vector4 min, Vector4 max)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 clamp(Vector4 min, Vector4 max)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    public static Vector4 distance(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 distance(Vector4 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    public static Vector4 distanceSquared(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    public Vector4 distanceSquared(Vector4 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    public static Vector4 divide(Vector4 a, float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 divide(Vector4 a, int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    @Override
    public Vector4 divide(float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 divide(int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 divide(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    public static float dotProduct(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static float dotProduct(Vector4 a, Vector3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static float dotProduct(Vector4 a, Vector2 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public float dotProduct(Vector4 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public float dotProduct(Vector3 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public float dotProduct(Vector2 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    @Override
    public boolean equals(Object object)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static boolean equals(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Hermite">
    public static Vector4 hermite()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    public static float magnitude(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public float magnitude()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    public static float magnitudeSquared(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public float magnitudeSquared()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static Vector4 lerp(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max and Min">
    public static Vector4 max(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 min(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public static Vector4 multiply(Vector4 a, float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 multiply(Vector4 a, int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 multiply(float scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 multiply(int scalar)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    public static Vector4 negate(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 negate()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    public static Vector4 normalize(Vector4 a)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 normalize()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Smooth Step">
    public static Vector4 smoothStep(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Vectors">
    /**
     * Special type of Vector4; The One vector, <1.0, 1.0 ,1.0, 1.0>
     * @return Returns a Vector4 with all components set to 1.0.
     */
    public static Vector4 one()
    {
        return new Vector4(1.0f);
    }
    
    /**
     * Returns the unit vector for the x-axis. <1.0, 0.0, 0.0, 0.0>
     * @return Returns a Vector4 with the x component set to 1.0.
     */
    public static Vector4 unitX()
    {
        return new Vector4(1.0f, 0.0f, 0.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the y-axis. <0.0, 1.0, 0.0, 0.0>
     * @return Returns a Vector4 with the y component set to 1.0.
     */
    public static Vector4 unitY()
    {
        return new Vector4(0.0f, 1.0f, 0.0f, 0.0f);
    }
    
    
    /**
     * Returns the unit vector for the z-axis. <0.0, 0.0, 1.0, 0.0>
     * @return Returns a Vector4 with the z component set to 1.0.
     */
    public static Vector4 unitZ()
    {
        return new Vector4(0.0f, 0.0f, 1.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the w-axis. <0.0, 0.0, 0.0, 1.0>
     * @return Returns a Vector4 with the w component set to 1.0.
     */
    public static Vector4 unitW()
    {
        return new Vector4(0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    
    /**
     * Special type of Vector4; Zero vector also known as the null vector, <0.0, 0.0, 0.0, 0.0>
     * @return Returns a Vector4 with all components set to 0.0.
     */
    public static Vector4 zero()
    {
        return new Vector4(0.0f);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public static Vector4 subtract(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector4 a, Vector3 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector3 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector4 a, Vector2 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Vector4 subtract(Vector2 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector4 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtract(Vector3 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtract(Vector2 that)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(float x, float y, float z, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(int x, int y, int z, int w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector3 vec, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtract(Vector2 vec, float z, float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractX(float x)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractX(int x)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractY(float y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractY(int y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractZ(float z)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    @Override
    public Vector4 subtractZ(int z)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtractW(float w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Vector4 subtractW(int w)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Converts the Vector4 to a string. <x,y,z,w>
     * @return Returns a string representing the Vector4.
     */
    @Override
    public String toString()
    {
        return "<" + this.x + "," + this.y + "," + this.z + "," + this.w + ">";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transformations">
    public static Vector4 transform(Vector4 a, Vector4 b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
}
