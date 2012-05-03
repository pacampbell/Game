package game.framework;

import java.io.Serializable;

/**
 * Vector4 class representing a vector of <x, y, z, w> components.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Transform</li>
 * </ul>
 * @version incomplete
 * @author paul
 */
public class Vector4 extends Vector3 implements Serializable
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
    /**
     * The Vector3 Barycentric method takes three vectors specifying the Cartesian coordinates of the triangle 
     * vertices, V1, V2, and V3), and two areal coordinates b2 and b3 of some point P (b2 is the amount1 argument 
     * and b3 is the amount2 argument). The b2 coordinate relates to vertex V2, and the b3coordinate relates to V3.
     * @param v1 A Vector4 representing a vertex of a triangle.
     * @param v2 A Vector4 representing a vertex of a triangle.
     * @param v3 A Vector4 representing a vertex of a triangle.
     * @param b2 Areal coordinate.
     * @param b3 Areal coordinate.
     * @return Returns a Vector4 containing the 4D Cartesian coordinates of the specified point.
     */
    public static Vector4 barycentric(Vector4 v1, Vector4 v2, Vector4 v3, float b2, float b3)
    {
        float b1 = 1 - b2 - b3;
        float px = (b1 * v1.x) + (b2 * v2.x) + (b3 * v3.x);
        float py = (b1 * v1.y) + (b2 * v2.y) + (b3 * v3.y);
        float pz = (b1 * v1.z) + (b2 * v2.z) + (b3 * v3.z);
        float pw = (b1 * v1.w) + (b2 * v2.w) + (b3 * v3.w);
        return new Vector4(px, py, pz, pw);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CatmullRom">
    /**
     * Definition found @ http://paulbourke.net/miscellaneous/interpolation/ & http://forums.indiegamer.com/showthread.php?4905-Teach-me-splines-for&p=66079#post66079
     * @param p0 The first position in the interpolation.
     * @param p1 The second position in the interpolation.
     * @param p2 The third position in the interpolation.
     * @param p3 The fourth position in the interpolation.
     * @param t A float value between zero and one.
     * @return Returns a Vector4 that is the result of the Catmull-Rom interpolation.
     */
    public static Vector4 catmullRom(Vector4 p0, Vector4 p1, Vector4 p2, Vector4 p3, float t)
    {
        float t2 = t * t;
        float t3 = t2 * t;
        float outX = 0.5f * ((2.0f * p1.x) +
                    (-p0.x + p2.x) * t +
                    (2.0f * p0.x - 5.0f * p1.x + 4 * p2.x - p3.x) * t2 +
                    (-p0.x + 3.0f * p1.x - 3.0f * p2.x + p3.x) * t3);
        
        float outY = 0.5f * ((2.0f * p1.y) +
                    (-p0.y + p2.y) * t +
                    (2.0f * p0.y - 5.0f * p1.y + 4 * p2.y - p3.y) * t2 +
                    (-p0.y + 3.0f * p1.y - 3.0f * p2.y + p3.y) * t3);
        
        float outZ = 0.5f * ((2.0f * p1.z) +
                    (-p0.z + p2.z) * t +
                    (2.0f * p0.z - 5.0f * p1.z + 4 * p2.z - p3.z) * t2 +
                    (-p0.z + 3.0f * p1.z - 3.0f * p2.z + p3.z) * t3);
        
        float outW = 0.5f * ((2.0f * p1.w) +
                    (-p0.w + p2.w) * t +
                    (2.0f * p0.w - 5.0f * p1.w + 4 * p2.w - p3.w) * t2 +
                    (-p0.w + 3.0f * p1.w - 3.0f * p2.w + p3.w) * t3);
        
        return new Vector4(outX, outY, outZ, outW);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    /**
     * Clamps a Vector4 between a min Vector4 and a max Vector4
     * @param value The Vector4 we want to clamp.
     * @param min A Vector4 containing the minimum values.
     * @param max A Vector4 containing the maximum values.
     * @return Returns a Vector4 clamped between min and max inclusive.
     */
    public static Vector4 clamp(Vector4 value, Vector4 min, Vector4 max)
    {
        return new Vector4
        (
            MathHelper.clamp(value.x, min.x, max.x), 
            MathHelper.clamp(value.y, min.y, max.y),
            MathHelper.clamp(value.z, min.z, max.z),
            MathHelper.clamp(value.w, min.w, max.w)
        );    
    }
    
    /**
     * Clamps this Vector4 between a min Vector4 and a max Vector4
     * @param min A Vector4 containing the minimum values.
     * @param max A Vector4 containing the maximum values.
     * @return Returns a Vector4 clamped between min and max inclusive.
     */
    public Vector4 clamp(Vector4 min, Vector4 max)
    {
        return Vector4.clamp(this, min, max);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    /**
     * Computes the distance between two Vector4.
     * @param a A Vector4 we want to compute the distance with.
     * @param b A Vector4 we want to compute the distance with.
     * @return Returns the distance between a and b.
     */
    public static float distance(Vector4 a, Vector4 b)
    {
        return Vector4.subtract(a, b).magnitude();
    }
    
    /**
     * Computes the distance between this and that.
     * @param that A Vector4 we want to compute the distance with this.
     * @return Returns the distance between this and that.
     */
    public float distance(Vector4 that)
    {
        return Vector4.distance(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    /**
     * Computes the distance between two Vector4 squared.
     * @param a A Vector4 we want to compute the distance squared with.
     * @param b A Vector4 we want to compute the distance squared with.
     * @return Returns the distance between a and b squared.
     */
    public static float distanceSquared(Vector4 a, Vector4 b)
    {
        return Vector4.subtract(a, b).magnitudeSquared();
    }
    
    /**
     * Computes the distance between this and that squared.
     * @param that A Vector4 we want to compute the distance squared with this.
     * @return Returns the distance between this and that squared.
     */
    public float distanceSquared(Vector4 that)
    {
        return Vector4.distanceSquared(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    /**
     * Performs scalar division between a Vector4 and a scalar. 
     * @param vec A Vector4 we want to divide.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    public static Vector4 divide(Vector4 a, float scalar)
    {
        return new Vector4(a.x / scalar, a.y / scalar, a.z / scalar, a.w / scalar);
    }
    
    /**
     * Performs scalar division between a Vector4 and a scalar. 
     * Converts integer arguments to float.
     * @param vec A Vector4 we want to divide.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    public static Vector4 divide(Vector4 a, int scalar)
    {
        return Vector4.divide(a, (float)scalar);
    }
    
    /**
     * Performs scalar division between this Vector4 and a scalar. 
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    @Override
    public Vector4 divide(float scalar)
    {
        return Vector4.divide(this, scalar);
    }
    
    /**
     * Performs scalar division between this Vector4 and a scalar. 
     * Converts integer arguments to float.
     * @param scalar A scalar we want to divide the Vector4 by.
     * @return Returns a new Vector4 divide by the scalar.
     */
    @Override
    public Vector4 divide(int scalar)
    {
        return Vector4.divide(this, (float)scalar);
    }
    
    /**
     * Performs scalar division component wise between two Vector4's
     * @param a A Vector4 we want to divide.
     * @param b A Vector4 we want to divide by.
     * @return Returns a new Vector4 divided component wise by another Vector4.
     */
    public static Vector4 divide(Vector4 a, Vector4 b)
    {
        return new Vector4(a.x / b.x, a.y / b.y, a.z / b.z, a.w / b.w);
    }
    
    /**
     * Performs scalar division component wise between this Vector4 and that Vector4
     * @param that A Vector4 we want to divide by.
     * @return Returns a new Vector4 divided component wise by another Vector4.
     */
    public Vector4 divide(Vector4 that)
    {
        return Vector4.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    /**
     * Performs the dot product between two Vector4's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector4 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector4 b)
    {
        return (a.x * b.x) + (a.y * b.y) + (a.z * b.z) + (a.w * b.w); 
    }
    
    /**
     * Performs the dot product between a Vector4 and a Vector3.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector3 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector3 b)
    {
        return Vector4.dotProduct(a, new Vector4(b));
    }
    
    /**
     * Performs the dot product between a Vector4 and a Vector2.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector4 that we want to perform the dot product on.
     * @param vecb A Vector2 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector4 a, Vector2 b)
    {
        return Vector4.dotProduct(a, new Vector4(b));
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector4.
     * @param that A Vector4 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    public float dotProduct(Vector4 that)
    {
        return Vector4.dotProduct(this, that);
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector3.
     * @param that A Vector3 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    @Override
    public float dotProduct(Vector3 that)
    {
        return Vector4.dotProduct(this, new Vector4(that));
    }
    
    /**
     * Performs the dot product between this Vector4 and that Vector2.
     * @param that A Vector2 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    @Override
    public float dotProduct(Vector2 that)
    {
        return Vector4.dotProduct(this, new Vector4(that));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    @Override
    /**
     * Checks if the object is a Vector4 and if so is it equal with this Vector4.
     * @param object An object that is believed to be a Vector4.
     * @return Returns the result of the comparison between this Vector4 and that Vector4.
     */
    public boolean equals(Object object)
    {
        boolean equals = false;
        if(object != null && object instanceof Vector4)
        {
            Vector4 that = (Vector4)object;
            equals = Vector4.equals(this, that);
        }
        return equals;
    }
    
    /**
     * Checks the equality between two Vector4
     * @param veca A Vector4 that we want to compare.
     * @param vecb A Vector4 that we want to compare.
     * @return Returns the result of the comparison between the two Vector4.
     */
    public static boolean equals(Vector4 a, Vector4 b)
    {
        boolean equals = false;
        if(a.x == b.x && a.y == b.y && a.z == b.z && a.w == b.w)
            equals = true;
        return equals;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Hermite">
    /**
     * Definition found @ http://cubic.org/docs/hermite.htm
     * Performs a Hermite spline interpolation.
     * @param p1 Start-point of the curve.
     * @param t1 Tangent(direction and speed) to how the curves leaves the start-point.
     * @param p2 End-point of the curve.
     * @param t2 Tangent (direction and speed) to how the curve meets the endpoint.
     * @param amount Weight factor.
     * @return Returns a Vector4 containing the result of the Hermite spline interpolation.
     */
    public static Vector4 hermite(Vector4 p1, Vector4 t1, Vector4 p2, Vector4 t2, float amount)
    {
        float h1, h2, h3, h4, amount2, amount3, outX, outY, outZ, outW;
        
        amount2 = amount * amount; // amount^2
        amount3 = amount2 * amount; // amount^3
        h1 = (2 * amount3) - (3 * amount2) + 1; // weight for p1
        h2 = (-2 * amount3) + (3 * amount2); // weight for p2
        h3 = amount3 - (2 * amount2) + amount; // weight for t1
        h4 = (amount3 - amount2); // weight for t2
        outX = (h1 * p1.x) + (h2 * p2.x) + (h3 * t1.x) + (h4 * t2.x);
        outY = (h1 * p1.y) + (h2 * p2.y) + (h3 * t1.y) + (h4 * t2.y);
        outZ = (h1 * p1.z) + (h2 * p2.z) + (h3 * t1.z) + (h4 * t2.z);
        outW = (h1 * p1.w) + (h2 * p2.w) + (h3 * t1.w) + (h4 * t2.w);
        return new Vector4(outX, outY, outZ, outW);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value1 A Vector4 we want to interpolate with.
     * @param value2 A Vector4 we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector4.
     */
    public static Vector4 lerp(Vector4 value1, Vector4 value2, float amount)
    {
        return new Vector4
        (
            MathHelper.lerp(value1.x, value2.x, amount),
            MathHelper.lerp(value1.y, value2.y, amount),
            MathHelper.lerp(value1.z, value2.z, amount),
            MathHelper.lerp(value1.w, value2.w, amount)
        );
    }
    
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value2 A Vector4 we want to interpolate with this Vector4.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector4.
     */
    public Vector4 lerp(Vector4 that, float amount)
    {
        return Vector4.lerp(this, that, amount);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    /**
     * Computes the magnitude of a Vector4.
     * @param a A Vector4 to find the magnitude of.
     * @return Returns the magnitude of the Vector4 provided.
     */
    public static float magnitude(Vector4 a)
    {
        return (float)Math.sqrt(a.magnitudeSquared());
    }
    
    /**
     * Computes the magnitude of this Vector4.
     * @return Returns the magnitude of this Vector4.
     */
    @Override
    public float magnitude()
    {
        return Vector4.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    /**
     * Computes the magnitude squared of a Vector4
     * @param a A Vector4 to find the magnitude squared of.
     * @return Returns the magnitude squared of the Vector4 provided.
     */
    public static float magnitudeSquared(Vector4 a)
    {
        return (a.x * a.x) + (a.y * a.y) + (a.z * a.z) + (a.w * a.w);
    }
    
    /**
     * Computes the magnitude squared of this Vector3
     * @return Returns the magnitude squared of this Vector4.
     */
    @Override
    public float magnitudeSquared()
    {
        return Vector4.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max and Min">
    /**
     * @param veca A Vector4 we want to find a max value from.
     * @param vecb A Vector4 we want to find a max value from.
     * @return Returns a Vector4 containing the max value from each components.
     */
    public static Vector4 max(Vector4 a, Vector4 b)
    {
        float mx = (a.x > b.x) ? a.x : b.x;
        float my = (a.y > b.y) ? a.y : b.y;
        float mz = (a.z > b.z) ? a.z : b.z;
        float mw = (a.w > b.w) ? a.w : b.w;
        return new Vector4(mx, my, mz, mw);
    }
    
    /**
     * @param veca A Vector4 we want to find a min value from.
     * @param vecb A Vector4 we want to find a min value from.
     * @return Returns a Vector4 containing the min value from each components.
     */
    public static Vector4 min(Vector4 a, Vector4 b)
    {
        float mx = (a.x < b.x) ? a.x : b.x;
        float my = (a.y < b.y) ? a.y : b.y;
        float mz = (a.z < b.z) ? a.z : b.z;
        float mw = (a.w < b.w) ? a.w : b.w;
        return new Vector4(mx, my, mz, mw);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Multiplies a Vector4 by a scalar.
     * @param veca A Vector4 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector4.
     * @return Returns a new Vector4 multiplied by the scalar.
     */
    public static Vector4 multiply(Vector4 a, float scalar)
    {
        return new Vector4(a.x * scalar, a.y * scalar, a.z * scalar, a.w * scalar);
    }
    
    /**
     * Multiplies a Vector4 by a scalar.
     * Converts integer arguments to float.
     * @param veca A Vector4 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector4.
     * @return Returns a new Vector4 multiplied by the scalar.
     */
    public static Vector4 multiply(Vector4 a, int scalar)
    {
        return Vector4.multiply(a, (float)scalar);
    }
    
    /**
     * Multiplies this Vector4 by a scalar.
     * @param scalar A scalar value we want to multiply into this Vector4.
     * @return Returns this Vector4 multiplied by the scalar
     */
    @Override
    public Vector4 multiply(float scalar)
    {
        return Vector4.multiply(this, scalar);
    }
    
    /**
     * Multiplies this Vector4 by a scalar.
     * Converts integer arguments to float.
     * @param scalar A scalar value we want to multiply into this Vector4.
     * @return Returns this Vector4 multiplied by the scalar
     */
    @Override
    public Vector4 multiply(int scalar)
    {
        return Vector4.multiply(this, (float)scalar);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * @param a The Vector4 we want to negate.
     * @return Returns A Vector4 that has been negated.
     */
    public static Vector4 negate(Vector4 a)
    {
        return new Vector4(-1 * a.x,-1 * a.y, -1 * a.z, -1 * a.w);
    }
    
    /**
     * @return Returns this Vector4 that has been negated.
     */
    @Override
    public Vector4 negate()
    {
        return Vector4.negate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    /**
     * Normalizes a input Vector4
     * @param vec Vector4 that we want to normalize.
     * @return Vector4 that is normalized.
     */
    public static Vector4 normalize(Vector4 a)
    {
        float magnitude = a.magnitude();
        return new Vector4(a.x / magnitude, a.y / magnitude, a.z / magnitude, a.w / magnitude);
    }
    
    /**
     * Normalizes this Vector4
     * @return Returns this Vector4 normalized.
     */
    @Override
    public Vector4 normalize()
    {
        return Vector4.normalize(this);
    }
    //</editor-fold>
   
    //<editor-fold defaultstate="collapsed" desc="Random Vector4">
    /**
     * Generates a Vector4 with random values for components from [-10000,10000].
     * @return Returns a new Vector4 with its x, y, z, and w components set randomly.
     */
    public static Vector4 random()
    {
        return new Vector4(Vector3.random(), MathHelper.random(-10000, 10000));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Smooth Step">
    /**
     * Performs a Smooth Step interpolation between two points.
     * Traditional: smoothstep(t) = 3t2 − 2t3
     * Ken Perlin: smootherstep(t) = 6t5 − 15t4 + 10t3 
     * @param a A Vector4 containing the starting point.
     * @param b A Vector4 containing the ending point.
     * @param amount A float value between zero and one.
     * @return Returns the interpolation between two values.
     */
    public static Vector4 smoothStep(Vector4 a, Vector4 b, float amount)
    {
        return new Vector4
        (
            MathHelper.smoothStep(a.x, b.x, amount),
            MathHelper.smoothStep(a.y, b.y, amount),
            MathHelper.smoothStep(a.z, b.z, amount),
            MathHelper.smoothStep(a.w, b.w, amount)
        );
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
    /**
     * Performs Vector4 Subtraction on two Vector4
     * @param veca A Vector4 to be subtracted.
     * @param vecb A Vector4 to be subtracted.
     * @return Returns a new Vector4 that is the difference between the two provided Vector4.
     */
    public static Vector4 subtract(Vector4 a, Vector4 b)
    {
        return new Vector4(a.x - b.x, a.y - b.y, a.z - b.z, a.w - b.w);
    }
    
    /**
     * Performs Vector4 Subtraction on a Vector4 and a Vector3
     * @param veca A Vector4 to be subtracted.
     * @param vecb A Vector3 to be subtracted.
     * @return Returns a new Vector4 that is the difference between the Vector4 and the Vector3.
     */
    public static Vector4 subtract(Vector4 a, Vector3 b)
    {
        return Vector4.subtract(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 Subtraction on a Vector3 and a Vector4
     * @param veca A Vector3 to be subtracted.
     * @param vecb A Vector4 to be subtracted.
     * @return Returns a new Vector4 that is the difference between the Vector3 and the Vector4.
     */
    public static Vector4 subtract(Vector3 a, Vector4 b)
    {
        return Vector4.subtract(new Vector4(a), b);
    }
    
    /**
     * Performs Vector4 Subtraction on a Vector4 and a Vector2
     * @param veca A Vector4 to be subtracted.
     * @param vecb A Vector2 to be subtracted.
     * @return Returns a new Vector4 that is the difference between the Vector4 and the Vector2.
     */
    public static Vector4 subtract(Vector4 a, Vector2 b)
    {
        return Vector4.subtract(a, new Vector4(b));
    }
    
    /**
     * Performs Vector4 Subtraction on a Vector2 and a Vector4
     * @param veca A Vector2 to be subtracted.
     * @param vecb A Vector4 to be subtracted.
     * @return Returns a new Vector4 that is the difference between the Vector2 and the Vector4.
     */
    public static Vector4 subtract(Vector2 a, Vector4 b)
    {
        return Vector4.subtract(new Vector4(a), b);
    }
    
    /**
     * Subtracts a Vector4 from this
     * @param that A Vector4 to be subtracted.
     * @return Returns a new Vector4 that is the difference between this Vector4 and that Vector4.
     */
    public Vector4 subtract(Vector4 that)
    {
        return Vector4.subtract(this, that);
    }
    
    /**
     * Subtracts a Vector4 from this
     * @param that A Vector3 to be subtracted.
     * @return Returns a new Vector4 that is the difference between this Vector4 and that Vector3.
     */
    @Override
    public Vector4 subtract(Vector3 that)
    {
        return Vector4.subtract(this, new Vector4(that));
    }
    
    /**
     * Subtracts a Vector4 from this
     * @param that A Vector2 to be subtracted.
     * @return Returns a new Vector4 that is the difference between this Vector4 and that Vector2.
     */
    @Override
    public Vector4 subtract(Vector2 that)
    {
        return Vector4.subtract(this, new Vector4(that));
    }
    
    /**
     * Performs subtraction with this Vector4 and the x, y, z, and w values provided.
     * @param x The x component we want to subtract from this Vector4.
     * @param y The y component we want to subtract from this Vector4.
     * @param z The z component we want to subtract from this Vector4.
     * @param w The w component we want to subtract from this Vector4.
     * @return Returns a Vector4 with x subtracted from this.x, y subtracted from this.y, z subtracted from this.z, and w subtracted from this.w
     */
    public Vector4 subtract(float x, float y, float z, float w)
    {
        return Vector4.subtract(this, new Vector4(x, y, z, w));
    }
    
    /**
     * Performs subtraction with this Vector4 and the x, y, z, and w values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector4.
     * @param y The y component we want to subtract from this Vector4.
     * @param z The z component we want to subtract from this Vector4.
     * @param w The w component we want to subtract from this Vector4.
     * @return Returns a Vector4 with x subtracted from this.x, y subtracted from this.y, z subtracted from this.z, and w subtracted from this.w
     */
    public Vector4 subtract(int x, int y, int z, int w)
    {
        return Vector4.subtract(this, new Vector4((int)x, (int)y, (int)z, (int)w));
    }
    
    /**
     * Creates a new Vector4 from a Vector3 and a w value and subtracts it from this.
     * @param a A Vector3 that we want to subtract.
     * @param w A w value we want to append to the Vector3.
     * @return Returns a new Vector4 that is the difference between this Vector4 and that Vector3 and a w value.
     */
    public Vector4 subtract(Vector3 vec, float w)
    {
        return Vector4.subtract(this, new Vector4(vec, w));
    }
    
    /**
     * Creates a new Vector4 from a Vector2, a z value, and a w value and subtracts it from this.
     * @param a A Vector2 that we want to subtract.
     * @param z A z value we want to append to the Vector2.
     * @param w A w value we want to append to the Vector2.
     * @return Returns a new Vector4 that is the difference between this Vector4 and that Vector3 and a w value.
     */
    public Vector4 subtract(Vector2 vec, float z, float w)
    {
        return Vector4.subtract(this, new Vector4(vec, z, w));
    }
    
    /**
     * Subtracts the value provided from the x component.
     * @param x The x component we want to subtract from this Vector4.
     * @return Returns a Vector4 with x subtracted from this.x
     */
    @Override
    public Vector4 subtractX(float x)
    {
        return Vector4.subtract(this, new Vector4(x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the x component.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector4.
     * @return Returns a Vector4 with x subtracted from this.x
     */
    @Override
    public Vector4 subtractX(int x)
    {
        return Vector4.subtract(this, new Vector4((float)x, 0.0f, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the y component.
     * @param y The y component we want to subtract from this Vector4.
     * @return Returns a Vector4 with y subtracted from this.y
     */
    @Override
    public Vector4 subtractY(float y)
    {
        return Vector4.subtract(this, new Vector4(0.0f, y, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the y component.
     * Converts integer arguments to float.
     * @param y The y component we want to subtract from this Vector4.
     * @return Returns a Vector4 with y subtracted from this.y
     */
    @Override
    public Vector4 subtractY(int y)
    {
        return Vector4.subtract(this, new Vector4(0.0f, (float)y, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the z component.
     * @param z The z component we want to subtract from this Vector4.
     * @return Returns a Vector4 with z subtracted from this.z
     */
    @Override
    public Vector4 subtractZ(float z)
    {
        return Vector4.subtract(this, new Vector4(0.0f, 0.0f, z, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the z component.
     * Converts integer arguments to float.
     * @param z The z component we want to subtract from this Vector4.
     * @return Returns a Vector4 with z subtracted from this.z
     */
    @Override
    public Vector4 subtractZ(int z)
    {
        return Vector4.subtract(this, new Vector4(0.0f, 0.0f, (float)z, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the w component.
     * @param w The w component we want to subtract from this Vector4.
     * @return Returns a Vector4 with w subtracted from this.w
     */
    public Vector4 subtractW(float w)
    {
        return Vector4.subtract(this, new Vector4(0.0f, 0.0f, 0.0f, w));
    }
    
    /**
     * Subtracts the value provided from the w component.
     * Converts integer arguments to float.
     * @param w The w component we want to subtract from this Vector4.
     * @return Returns a Vector4 with w subtracted from this.w
     */
    public Vector4 subtractW(int w)
    {
        return Vector4.subtract(this, new Vector4(0.0f, 0.0f, 0.0f, (float)w));
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
