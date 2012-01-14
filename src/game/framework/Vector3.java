package game.framework;

import java.io.Serializable;

/**
 * Vector3 class representing a vector of <x, y, z> components.
 * <br />
 * <h1>Missing:</h1>
 * <ul>
 *  <li>Barycentric</li>
 *  <li>CatmullRom</li>
 *  <li>Hermite</li>
 *  <li>SmoothStep</li>
 *  <li>Transform</li>
 *  <li>TransformNormal</li>
 * </ul>
 * @author paul
 */

public class Vector3 extends Vector2 implements Serializable
{
    /**
     * The z component of the Vector3.
     * Also referred to as k component in vectorial notation. 
     */
    public final float z;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * Sets x, y, and z components of Vector3
     * @param x x component of Vector3
     * @param y y component of Vector3
     * @param z z component of Vector3
     */
    public Vector3(float x, float y, float z)
    {
        super(x, y);
        this.z = z;
    }
    
    /**
     * Converts integer arguments to float.
     * Sets x, y, and z components of Vector3
     * @param x x component of Vector3
     * @param y y component of Vector3
     * @param z z component of Vector3
     */
    public Vector3(int x, int y, int z)
    {
        this((float)x, (float)y, (float)z);
    }
    
    /**
     * Sets x, y, and z components of Vector3 to value.
     * @param value Float value used to set all components to.
     */
    public Vector3(float value)
    {
        this(value, value, value);
    }
    
    /**
     * Converts integer arguments to float. 
     * Sets x, y, and z components of Vector3 to value.
     * @param value Integer value used to set all components to.
     */
    public Vector3(int value)
    {
       this((float)value, (float)value, (float)value); 
    }
    
    /**
     * Empty Constructor
     * sets all components of Vector3 to zero.
     */
    public Vector3()
    {
        this(0.0f, 0.0f, 0.0f);
    }
    
    /**
     * Takes a Vector2 and converts it into a Vector3.
     * @param vec2 Vector2 to be change to a Vector3.
     */
    public Vector3(Vector2 vec2)
    {
        this(vec2.x, vec2.y, 0.0f);
    }
    
    /**
     * Takes a Vector2 and float and converts it into a Vector3.
     * @param vec2 Vector2 to be change to a Vector3.
     * @param z z coordinate for Vector3
     */
    public Vector3(Vector2 vec2, float z)
    {
        this(vec2.x, vec2.y, z);
    }
    
    /**
     * Copy Constructor
     * Make a copy of the Vector3 provided.
     * @param vec3 Vector3 to be copied.
     */
    public Vector3(Vector3 vec3)
    {
        this(vec3.x, vec3.y, vec3.z);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs Vector3 Addition on two Vector3
     * @param a Vector3 to be added
     * @param b Vector3 to be added
     * @return Returns a new Vector3 with the result of a + b
     */
    public static Vector3 add(Vector3 a, Vector3 b)
    {
        return new Vector3(a.x + b.x, a.y + b.y, a.z + b.z);
    }
    
    /**
     * Performs Vector3 Addition between a Vector3 and a Vector2
     * @param a Vector3 to be added
     * @param b Vector2 to be added
     * @return Returns a new Vector3 with the result of a + b
     */
    public static Vector3 add(Vector3 a, Vector2 b)
    {
        return Vector3.add(a, new Vector3(b));
    }
    
    /**
     * Performs addition with this Vector3 
     * @param that Vector3 to be added
     * @return Returns a new Vector3 with the result of this + that
     */
    public Vector3 add(Vector3 that)
    {
        return Vector3.add(this, that);
    }
    
    /**
     * Performs addition with this Vector3 
     * @param that Vector2 to be added
     * @return Returns a new Vector3 with the result of this + that
     */
    @Override
    public Vector3 add(Vector2 that)
    {
        return Vector3.add(this, new Vector3(that));
    }
    
    /**
     * Performs addition with this Vector3 and the x, y, and z values provided.
     * @param x The x component we want to add to this Vector3.
     * @param y The y component we want to add to this Vector3.
     * @param z The z component we want to add to this Vector3.
     * @return Returns a Vector3 with x added to this.x, y added to this.y, and z added to this.z
     */
    public Vector3 add(float x, float y, float z)
    {
        return Vector3.add(this, new Vector3(x, y, z));
    }
    
    /**
     * Performs addition with this Vector3 and the x, y, and z values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector3.
     * @param y The y component we want to add to this Vector3.
     * @param z The z component we want to add to this Vector3.
     * @return Returns a Vector3 with x added to this.x, y added to this.y, and z added to this.z
     */
    public Vector3 add(int x, int y, int z)
    {
        return Vector3.add(this, new Vector3(x, y, z));
    }
    
    /**
     * Performs addition with this Vector3 and the x, y, and z values provided.
     * Converts integer arguments to float.
     * @param vec A Vector2 we want to add to this Vector3.
     * @param z The z component we want to add to this Vector3.
     * @return Returns a Vector3 with x added to this.x, y added to this.y, and z added to this.z
     */
    public Vector3 add(Vector2 vec, float z)
    {
        return Vector3.add(this, new Vector3(vec, z));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param x The x component we want to add to this Vector3.
     * @return Returns a Vector3 with x added to this.x
     */
    @Override
    public Vector3 addX(float x)
    {
        return Vector3.add(this, new Vector3(x, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector3.
     * @return Returns a Vector3 with x added to this.x
     */
    @Override
    public Vector3 addX(int x)
    {
        return Vector3.add(this, new Vector3((float)x, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param y The y component we want to add to this Vector3.
     * @return Returns a Vector3 with y added to this.y
     */
    @Override
    public Vector3 addY(float y)
    {
        return Vector3.add(this, new Vector3(0.0f, y, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * Converts integer arguments to float.
     * @param y The y component we want to add to this Vector3.
     * @return Returns a Vector3 with y added to this.y
     */
    @Override
    public Vector3 addY(int y)
    {
        return Vector3.add(this, new Vector3(0.0f, (float)y, 0.0f));
    }
    
    /**
     * Adds the value provided to the z component.
     * @param z The z component we want to add to this Vector3.
     * @return Returns a Vector3 with z added to this.z
     */
    public Vector3 addZ(float z)
    {
        return Vector3.add(this, new Vector3(0.0f, 0.0f, z));
    }
    
    /**
     * Adds the value provided to the z component.
     * Converts integer arguments to float.
     * @param z The z component we want to add to this Vector3.
     * @return Returns a Vector3 with z added to this.z
     */
    public Vector3 addZ(int z)
    {
        return Vector3.add(this, new Vector3(0.0f, 0.0f, (float)z));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    /**
     * Clamps a Vector3 between a min Vector3 and a max Vector3
     * @param value The Vector3 we want to clamp.
     * @param min A Vector3 containing the minimum values.
     * @param max A Vector3 containing the maximum values.
     * @return Returns a Vector3 clamped between min and max.
     */
    public static Vector3 clamp(Vector3 value, Vector3 min, Vector3 max)
    {
        float newX = value.x;
        float newY = value.y;
        float newZ = value.z;
        // Clamp the x value between the min and max.
        if(value.x < min.x)
            newX = min.x;
        else if(value.x > max.x)
            newX = max.x;
        // Clamp the y value between the min and max.
        if(value.y < min.y)
            newY = min.y;
        else if(value.y > max.y)
            newY = max.y;
        // Clamp the z value between the min and max.
        if(value.z < min.z)
            newZ = min.z;
        else if(value.z > max.z)
            newZ = max.z;
        // Return the clamped Vector3
        return new Vector3(newX, newY, newZ);
    }
    
    /**
     * Clamps this Vector3 between a min Vector3 and a max Vector3
     * @param min A Vector3 containing the minimum values.
     * @param max A Vector3 containing the maximum values.
     * @return Returns a Vector3 clamped between min and max.
     */
    public Vector3 clamp(Vector3 min, Vector3 max)
    {
        return Vector3.clamp(this, min, max);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Cross Product">
    /**
     * Performs the cross product between two Vector3
     * You have u = {ux, uy, uz}
     * You have v = {vx, vy, vz}
     * Then uxv = (uyvz - uzvy, uzvx - uxvz, uxvy - uyvx)
     * @param u Vector3 
     * @param v Vector3
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector3 u, Vector3 v)
    {
        float newX = (u.y * v.z) - (u.z * v.y);
        float newY = (u.z * v.x) - (u.x * v.z);
        float newZ = (u.x * v.y) - (u.y * v.x);
        return new Vector3(newX, newY, newZ);
    }
    
    /**
     * Performs the cross product between a Vector3 and a Vector2.
     * @param u Vector3
     * @param v Vector2
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector3 u, Vector2 v)
    {
        return Vector3.crossProduct(u, new Vector3(v));
    }
    
    /**
     * Performs the cross product between a Vector2 and a Vector3.
     * @param u Vector2
     * @param v Vector3
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector2 u, Vector3 v)
    {
        return Vector3.crossProduct(new Vector3(u), v);
    }
    
    /**
     * Performs the cross product between two Vector2.
     * @param u Vector2
     * @param v Vector2
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector2 u, Vector2 v)
    {
        return Vector3.crossProduct(new Vector3(u), new Vector3(v));
    }
    
    /**
     * Performs the cross product with this Vector3
     * @param that Vector3
     * @return Returns this cross that
     */
    public Vector3 crossProduct(Vector3 that)
    {
        return Vector3.crossProduct(this, that);
    }
    
    /**
     * Performs the cross product with this Vector3
     * @param that Vector2
     * @return Returns this cross that
     */
    public Vector3 crossProduct(Vector2 that)
    {
        return Vector3.crossProduct(this, new Vector3(that));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Direction Cosine">
    /**
     * Computes the angle between the Vector3 and the x-axis 
     * @param vec Vector3 we want to find the angle with respect to the x-axis.
     * @return Returns the angle between the Vector3 and the x-axis in radians.
     */
    public static float directionAlpha(Vector3 vec)
    {
        return (float)Math.acos(vec.x / Vector3.magnitude(vec));
    }
    
    /**
     * Computes the angle between this Vector3 and the x-axis 
     * @return Returns the angle between this Vector3 and the x-axis in radians.
     */
    @Override
    public float directionAlpha()
    {
        return Vector3.directionAlpha(this);
    }
    
    /**
     * Computes the angle between the Vector3 and the y-axis 
     * @param vec Vector3 we want to find the angle with respect to the y-axis.
     * @return Returns the angle between the Vector3 and the y-axis in radians.
     */
    public static float directionBeta(Vector3 vec)
    {
        return (float)Math.acos(vec.y / Vector3.magnitude(vec));
    }
    
    /**
     * Computes the angle between this Vector3 and the y-axis 
     * @return Returns the angle between this Vector3 and the y-axis in radians.
     */
    @Override
    public float directionBeta()
    {
        return Vector3.directionBeta(this);
    }
    
    /**
     * Computes the angle between the Vector3 and the z-axis 
     * @param vec Vector3 we want to find the angle with respect to the z-axis.
     * @return Returns the angle between the Vector3 and the z-axis in radians.
     */
    public static float directionGamma(Vector3 vec)
    {
        return (float)Math.acos(vec.z / Vector3.magnitude(vec));
    }
    
    /**
     * Computes the angle between this Vector3 and the z-axis 
     * @return Returns the angle between this Vector3 and the z-axis in radians.
     */
    public float directionGamma()
    {
        return Vector3.directionGamma(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    /**
     * Computes the distance between two Vector3.
     * @param a A Vector3 we want to compute the distance with.
     * @param b A Vector3 we want to compute the distance with.
     * @return Returns the distance between a and b.
     */
    public static float distance(Vector3 a, Vector3 b)
    {
        return Vector3.subtract(a, b).magnitude();
    }
    
    /**
     * Computes the distance between this and that.
     * @param that A Vector3 we want to compute the distance with this.
     * @return Returns the distance between this and that.
     */
    public float distance(Vector3 that)
    {
        return Vector3.distance(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    /**
     * Computes the distance between two Vector3 squared.
     * @param a A Vector3 we want to compute the distance squared with.
     * @param b A Vector3 we want to compute the distance squared with.
     * @return Returns the distance between a and b squared.
     */
    public static float distanceSquared(Vector3 a, Vector3 b)
    {
        return Vector3.subtract(a, b).magnitudeSquared();
    }
    
    /**
     * Computes the distance between this and that squared.
     * @param that A Vector3 we want to compute the distance squared with this.
     * @return Returns the distance between this and that squared.
     */
    public float distanceSquared(Vector3 that)
    {
        return Vector3.distanceSquared(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Division">
    /**
     * Performs scalar division between a Vector3 and a scalar. 
     * @param vec A Vector3 we want to divide.
     * @param scalar A scalar we want to divide the Vector3 by.
     * @return Returns a new Vector3 divide by the scalar.
     */
    public static Vector3 divide(Vector3 vec, float scalar)
    {
        return new Vector3(vec.x / scalar, vec.y / scalar, vec.z / scalar);
    }
    
    /**
     * Performs scalar division between a Vector3 and a scalar. 
     * Converts integer arguments to float.
     * @param vec A Vector3 we want to divide.
     * @param scalar A scalar we want to divide the Vector3 by.
     * @return Returns a new Vector3 divide by the scalar.
     */
    public static Vector3 divide(Vector3 vec, int scalar)
    {
        return Vector3.divide(vec, scalar);
    }
    
    /**
     * Performs scalar division between this Vector3 and a scalar. 
     * @param scalar A scalar we want to divide the Vector3 by.
     * @return Returns a new Vector3 divide by the scalar.
     */
    @Override
    public Vector3 divide(float scalar)
    {
        return Vector3.divide(this, scalar);
    }
    
    /**
     * Performs scalar division between this Vector2 and a scalar. 
     * Converts integer arguments to float.
     * @param scalar A scalar we want to divide the Vector2 by.
     * @return Returns a new Vector2 divide by the scalar.
     */
    @Override
    public Vector3 divide(int scalar)
    {
        return Vector3.divide(this, (float)scalar);
    }
    
    /**
     * Performs scalar division component wise between two Vector3's
     * @param a A Vector3 we want to divide.
     * @param b A Vector3 we want to divide by.
     * @return Returns a new Vector3 divided component wise by another Vector3.
     */
    public static Vector3 divide(Vector3 a, Vector3 b)
    {
        return new Vector3(a.x / b.x, a.y / b.y, a.z / b.z);
    }
    
    /**
     * Performs scalar division component wise between this Vector3 and that Vector3
     * @param that A Vector3 we want to divide by.
     * @return Returns a new Vector3 divided component wise by another Vector3.
     */
    public Vector3 divide(Vector3 that)
    {
        return Vector3.divide(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot product">
    /**
     * Performs the dot product between two Vector3's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector3 that we want to perform the dot product on.
     * @param vecb A Vector3 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector3 a, Vector3 b)
    {
        return (a.x + b.x) + (a.y + b.y) + (a.z + b.z);
    }
    
    /**
     * Performs the dot product between a Vector3 and a Vector2.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector3 that we want to perform the dot product on.
     * @param vecb A Vector2 that we want to perform the dot product on.
     * @return Returns a dot b.
     */
    public static float dotProduct(Vector3 a, Vector2 b)
    {
        return Vector3.dotProduct(a, new Vector3(b));
    }
    
    /**
     * Performs the dot product between this Vector3 and that Vector3.
     * @param that A Vector3 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    public float dotProduct(Vector3 that)
    {
        return Vector3.dotProduct(this, that);
    }
    
    /**
     * Performs the dot product between this Vector3 and that Vector2.
     * @param that A Vector2 we want to perform the dot product on.
     * @return Returns the dot product of this dot that.
     */
    @Override
    public float dotProduct(Vector2 that)
    {
        return Vector3.dotProduct(this, new Vector3(that));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Checks if Vector B is equal with this Vector3.
     * @param object An object that is believed to be a Vector3.
     * @return Returns the result of the comparison between this Vector3 and that Vector3.
     */
    @Override
    public boolean equals(Object object)
    {
        boolean result = false;
        if(object != null && object instanceof Vector3)
        {
            Vector2 that = (Vector3)object;
            result = Vector3.equals(this, that);
        }
        return result;
    }
    
    /**
     * Checks the equality between two Vector3
     * @param veca A Vector3 that we want to compare.
     * @param vecb A Vector3 that we want to compare.
     * @return Returns the result of the comparison between the two Vector3.
     */
    public static boolean equals(Vector3 veca, Vector3 vecb)
    {
        boolean result = false;
        if(veca.x == vecb.x && veca.y == vecb.y && veca.z == vecb.z)
            result = true;
        return result;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    /**
     * Computes the magnitude of a Vector3.
     * @param a A Vector3 to find the magnitude of.
     * @return Returns the magnitude of the Vector3 provided.
     */
    public static float magnitude(Vector3 a)
    {
        return (float)Math.sqrt(a.magnitudeSquared());
    }
    
    /**
     * Computes the magnitude of this Vector3.
     * @return Returns the magnitude of this Vector3.
     */
    @Override
    public float magnitude()
    {
        return Vector3.magnitude(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    /**
     * Computes the magnitude squared of a Vector3
     * @param a A Vector3 to find the magnitude squared of.
     * @return Returns the magnitude squared of the Vector3 provided.
     */
    public static float magnitudeSquared(Vector3 a)
    {
        return (a.x * a.x) + (a.y * a.y) + (a.z * a.z);
    }
    
    /**
     * Computes the magnitude squared of this Vector3
     * @return Returns the magnitude squared this Vector3.
     */
    @Override
    public float magnitudeSquared()
    {
        return Vector3.magnitudeSquared(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max & Min">
    /**
     * @param veca A Vector3 we want to find a max value from.
     * @param vecb A Vector3 we want to find a max value from.
     * @return Returns a Vector3 containing the max value from each components.
     */
    public static Vector3 max(Vector3 a, Vector3 b)
    {
        float mx = (a.x > b.x) ? a.x : b.x;
        float my = (a.y > b.y) ? a.y : b.y;
        float mz = (a.z > b.z) ? a.z : b.z;
        return new Vector3(mx, my, mz);
    }
    
    /**
     * @param veca A Vector3 we want to find a min value from.
     * @param vecb A Vector3 we want to find a min value from.
     * @return Returns a Vector3 containing the min value from each components.
     */
    public static Vector3 min(Vector3 a, Vector3 b)
    {
        float mx = (a.x < b.x) ? a.x : b.x;
        float my = (a.y < b.y) ? a.y : b.y;
        float mz = (a.z < b.z) ? a.z : b.z;
        return new Vector3(mx, my, mz);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Multiplies a Vector3 by a scalar
     * @param veca A Vector3 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector3.
     * @return Returns a new Vector3 multiplied by the scalar.
     */
    public static Vector3 multiply(Vector3 a, float scalar)
    {
        return new Vector3(a.x * scalar, a.y * scalar, a.z * scalar);
    }
    
    /**
     * Multiplies a Vector3 by a scalar
     * Converts integer values to float.
     * @param veca A Vector3 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector3.
     * @return Returns a new Vector3 multiplied by the scalar.
     */
    public static Vector3 multiply(Vector3 a, int scalar)
    {
        return Vector3.multiply(a, (float)scalar);
    }
    
    /**
     * Multiplies this Vector3 by a scalar
     * @param scalar A scalar value we want to multiply into this Vector3.
     * @return Returns this Vector3 multiplied by the scalar
     */
    @Override
    public Vector3 multiply(float scalar)
    {
        return Vector3.multiply(this, scalar);
    }
    
    /**
     * Multiplies this Vector3 by a scalar
     * Converts integer values to float.
     * @param scalar A scalar value we want to multiply into this Vector3.
     * @return Returns this Vector3 multiplied by the scalar
     */
    @Override
    public Vector3 multiply(int scalar)
    {
        return Vector3.multiply(this, (float)scalar);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * @param a The Vector3 we want to negate.
     * @return Returns A Vector3 that has been negated.
     */
    public static Vector3 negate(Vector3 a)
    {
        return new Vector3(a.x * -1.0f, a.y * -1.0f, a.z * -1.0f);
    }
    
    /**
     * @return Returns this Vector3 that has been negated.
     */
    @Override
    public Vector3 negate()
    {
        return Vector3.negate(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    /**
     * Normalizes a input Vector3
     * @param vec Vector3 that we want to normalize.
     * @return Vector3 that is normalized.
     */
    public static Vector3 normalize(Vector3 vec)
    {
        float magnitude = magnitude(vec);
        float normx = vec.x / magnitude;
        float normy = vec.y / magnitude;
        float normz = vec.z / magnitude;
        return new Vector3(normx, normy, normz);
    }
    
    /**
     * Normalizes this Vector3
     * @return Returns this Vector3 normalized.
     */
    @Override
    public Vector3 normalize()
    {
        return Vector3.normalize(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Projection">
    /**
     * Calculates the scalar projection of b onto a.
     * @param a A Vector3 we want to project onto.
     * @param b A Vector3 we want project.
     * @return Returns the scalar projection of b onto a.
     */
    public static float scalarProjection(Vector3 a, Vector3 b)
    {
        return Vector3.dotProduct(a, b) / Vector3.magnitude(a);
    }
    
    /**
     * Calculates the scalar projection of that onto this.
     * @param that A Vector3 we want to project.
     * @return Returns the scalar projection of that onto this.
     */ 
    public float scalarProjection(Vector3 that)
    {
        return Vector3.scalarProjection(this, that);
    }
    
    /**
     * Calculates the vector projection of b onto a.
     * @param a A Vector3 we want to project onto.
     * @param b A Vector3 we want project.
     * @return Returns the vector projection of b onto a.
     */
    public static Vector3 vectorProjection(Vector3 a, Vector3 b)
    {
        float scalar = Vector3.scalarProjection(a, b);
        Vector3 normal = Vector3.normalize(a);
        return Vector3.multiply(normal, scalar);
    }
    
    /**
     * Calculates the vector projection of that onto this.
     * @param that A Vector3 we want project.
     * @return Returns the vector projection of that onto this.
     */
    public Vector3 vectorProjection(Vector3 that)
    {
        return Vector3.vectorProjection(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reflection">
    /**
     * r = i - (2 * n * dot(i, n))
     * @param incident Incident vector
     * @param normal Surface normal vector
     * @return Returns the reflected vector.
     */
    public static Vector3 reflect(Vector3 incident, Vector3 normal)
    {
        return incident.subtract(Vector3.multiply(normal, 2.0f).multiply(Vector3.dotProduct(incident, normal)));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Vectors">
    /**
     * Special type of Vector3; The One vector, <1.0, 1.0 ,1.0>
     * @return Returns a Vector3 with all components set to 1.0.
     */
    public static Vector3 one()
    {
        return new Vector3(1.0f);
    }
    
    /**
     * Returns the unit vector for the x-axis. <1.0, 0.0, 0.0>
     * @return Returns a Vector3 with the x component set to 1.0.
     */
    public static Vector3 unitX()
    {
        return new Vector3(1.0f, 0.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the y-axis. <0.0, 1.0, 0.0>
     * @return Returns a Vector3 with the y component set to 1.0.
     */
    public static Vector3 unitY()
    {
        return new Vector3(0.0f, 1.0f, 0.0f);
    }

    /**
     * Returns the unit vector for the z-axis. <0.0, 0.0, 1.0>
     * @return Returns a Vector3 with the z component set to 1.0.
     */
    public static Vector3 unitZ()
    {
        return new Vector3(0.0f, 0.0f, 1.0f);
    }

    /**
     * Special type of Vector3; Zero vector also known as the null vector, <0.0, 0.0, 0.0>
     * @return Returns a Vector3 with all components set to 0.0.
     */
    public static Vector3 zero()
    {
        return new Vector3(0.0f);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    /**
     * Performs Vector3 Subtraction on two Vector3
     * @param veca A Vector3 to be subtracted.
     * @param vecb A Vector3 to be subtracted.
     * @return Returns a new Vector3 that is the difference between the two provided Vector3.
     */
    public static Vector3 subtract(Vector3 a, Vector3 b)
    {
        return new Vector3(a.x - b.x, a.y - b.y, a.z - b.z);
    }
    
    /**
     * Performs Vector3 Subtraction on a Vector3 and a Vector2
     * @param veca A Vector3 to be subtracted.
     * @param vecb A Vector2 to be subtracted.
     * @return Returns a new Vector3 that is the difference between the Vector3 and the Vector2.
     */
    public static Vector3 subtract(Vector3 a, Vector2 b)
    {
        return Vector3.subtract(a, new Vector3(b));
    }
    
    /**
     * Performs Vector3 Subtraction on a Vector2 and a Vector3
     * @param veca A Vector2 to be subtracted.
     * @param vecb A Vector3 to be subtracted.
     * @return Returns a new Vector3 that is the difference between the Vector2 and the Vector3.
     */
    public static Vector3 subtract(Vector2 a, Vector3 b)
    {
        return Vector3.subtract(new Vector3(a), b);
    }
    
    /**
     * Subtracts a Vector3 from this
     * @param that A Vector3 to be subtracted.
     * @return Returns a new Vector3 that is the difference between this Vector3 and that Vector3.
     */
    public Vector3 subtract(Vector3 that)
    {
        return Vector3.subtract(this, that);
    }
    
    /**
     * Subtracts a Vector2 from this
     * @param that A Vector2 to be subtracted.
     * @return Returns a new Vector3 that is the difference between this Vector3 and that Vector2.
     */
    @Override
    public Vector3 subtract(Vector2 that)
    {
        return Vector3.subtract(this, new Vector3(that));
    }
    
    /**
     * Creates a new Vector3 from a Vector2 and a z value and subtracts it from this.
     * @param a A Vector2 that we want to subtract.
     * @param z A z value we want to append to the vector2.
     * @return Returns a new Vector3 that is the difference between this Vector3 and that Vector2 and a z value.
     */
    public Vector3 subtract(Vector2 a, float z)
    {
        return Vector3.subtract(this, new Vector3(a, z));
    }
    
    /**
     * Performs subtraction with this Vector3 and the x, y, and z values provided.
     * @param x The x component we want to subtract from this Vector3.
     * @param y The y component we want to subtract from this Vector3.
     * @param z The z component we want to subtract from this Vector3.
     * @return Returns a Vector3 with x subtracted from this.x, y subtracted from this.y, and z subtracted from this.z
     */
    public Vector3 subtract(float x, float y, float z)
    {
        return Vector3.subtract(this, new Vector3(x, y, z));
    }
    
    /**
     * Performs subtraction with this Vector3 and the x, y, and z values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector3.
     * @param y The y component we want to subtract from this Vector3.
     * @param z The z component we want to subtract from this Vector3.
     * @return Returns a Vector3 with x subtracted from this.x, y subtracted from this.y, and z subtracted from this.z
     */
    public Vector3 subtract(int x, int y, int z)
    {
        return Vector3.subtract(this, new Vector3(x, y, z));
    }
    
    /**
     * Subtracts the value provided from the x component.
     * @param x The x component we want to subtract from this Vector3.
     * @return Returns a Vector3 with x subtracted from this.x
     */
    @Override
    public Vector3 subtractX(float x)
    {
        return Vector3.subtract(this, new Vector3(x, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the x component.
     * @param x The x component we want to subtract from this Vector3.
     * @return Returns a Vector3 with x subtracted from this.x
     */
    @Override
    public Vector3 subtractX(int x)
    {
        return Vector3.subtract(this, new Vector3(x, 0.0f, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the y component.
     * @param y The y component we want to subtract from this Vector3.
     * @return Returns a Vector3 with y subtracted from this.y
     */
    @Override
    public Vector3 subtractY(float y)
    {
        return Vector3.subtract(this, new Vector3(0.0f, y, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the y component.
     * @param y The y component we want to subtract from this Vector3.
     * @return Returns a Vector3 with y subtracted from this.y
     */
    @Override
    public Vector3 subtractY(int y)
    {
        return Vector3.subtract(this, new Vector3(0.0f, y, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the z component.
     * @param z The z component we want to subtract from this Vector3.
     * @return Returns a Vector3 with z subtracted from this.z
     */
    public Vector3 subtractZ(float z)
    {
        return Vector3.subtract(this, new Vector3(0.0f, 0.0f, z));
    }
    
    /**
     * Subtracts the value provided from the z component.
     * @param z The z component we want to subtract from this Vector3.
     * @return Returns a Vector3 with z subtracted from this.z
     */
    public Vector3 subtractZ(int z)
    {
        return Vector3.subtract(this, new Vector3(0.0f, 0.0f, z));
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Converts the Vector3 to a string. <x,y,z>
     * @return Returns a string representing the Vector3.
     */
    @Override
    public String toString()
    {
        return "<" + this.x + "," + this.y + "," + this.z + ">";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Unit Test">
    /**
     * Test Method; Performs some operations
     * To check results
     */
    public static void unitTest()
    {
        Vector3 a = new Vector3(1, 2, 0);
        Vector3 b = new Vector3(3, 4, 0);
        
        Vector3 c, d, e, f, g, h, i, j, k, l, m, n, o, p, q;
        float s1, s2, s3, s4, s5;
        
        // Add the two vectors together
        c = Vector3.add(a, b);
        // Subtract the two vectors from each other
        d = Vector3.subtract(b, c);
        // multiply two vectors
        e = Vector3.multiply(d, -1);
        // dot product
        s1 = Vector3.dotProduct(a, b);
        // Distance
        s2 = Vector3.distance(a, b);
        // Distance squared
        s3 = Vector3.distanceSquared(a, b);
        // Magnitude
        s4 = Vector3.magnitude(e);
        // Magnitude squared
        s5 = Vector3.magnitudeSquared(e);
        // Normalize/Unit Vector
        f = Vector3.normalize(e);
        // Equality Test
        g = new Vector3(-1, -1, 0);
        h = new Vector3(1, 1, 0);
        boolean equals1 = Vector3.equals(g, h);
        boolean equals2 = Vector3.equals(g, g);
        // Min and Max Test
        i = new Vector3(100, -100, 0);
        j = new Vector3(-100, 100, 0);
        k = Vector3.max(i, j);
        l = Vector3.min(i, j);
        // Reflect
        m = Vector3.reflect(a, b);
        // Barycentric
        //n = Vector3.barycentric(a, b, c, 3, 4);
        // Scalar Division (Should = Infinity)
        o = a.divide(0.0f);
        p = Vector3.divide(a, 5.0f);
        q = Vector3.divide(a, b);
        
        System.out.println("a + b = " + c);
        System.out.println("b - c = " + d);
        System.out.println("-1 * d = " + e);
        System.out.println("a dot b = " + s1);
        System.out.println("Distance between a and b: " + s2);
        System.out.println("Distance squared between a and b: " + s3);
        System.out.println("Magnitude of e = " + s4);
        System.out.println("Magnitude squared of e = " + s5);
        System.out.println("Unit Vector of e: " + f);
        System.out.println("is g == h? " + equals1);
        System.out.println("is g == g? " + equals2);
        System.out.println("Max of i & j is " + k);
        System.out.println("Min of i & j is " + l);
        System.out.println("Reflection of a and b: " + m);
        //System.out.println("Barycentric a, b, c, 3, 4: " + n);
        System.out.println("a / 0 = " + o);
        System.out.println("a / 5.0f = " + p);
        System.out.println("a / b = " + q);
    }
    //</editor-fold>
}
