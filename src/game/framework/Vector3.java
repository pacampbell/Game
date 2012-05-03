package game.framework;

import java.io.Serializable;

/**
 * Vector3 class representing a vector of <x, y, z> components.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Transform</li>
 * </ul>
 * @version incomplete
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
    
    //<editor-fold defaultstate="collapsed" desc="Barycentric">
    /**
     * The Vector3 Barycentric method takes three vectors specifying the Cartesian coordinates of the triangle 
     * vertices, V1, V2, and V3), and two areal coordinates b2 and b3 of some point P (b2 is the amount1 argument 
     * and b3 is the amount2 argument). The b2 coordinate relates to vertex V2, and the b3coordinate relates to V3.
     * @param v1 A Vector3 representing a vertex of a triangle.
     * @param v2 A Vector3 representing a vertex of a triangle.
     * @param v3 A Vector3 representing a vertex of a triangle.
     * @param b2 Areal coordinate.
     * @param b3 Areal coordinate.
     * @return Returns a Vector3 containing the 3D Cartesian coordinates of the specified point.
     */
    public static Vector3 barycentric(Vector3 v1, Vector3 v2, Vector3 v3, float b2, float b3)
    {
        float b1 = 1 - b2 - b3;
        float px = (b1 * v1.x) + (b2 * v2.x) + (b3 * v3.x);
        float py = (b1 * v1.y) + (b2 * v2.y) + (b3 * v3.y);
        float pz = (b1 * v1.z) + (b2 * v2.z) + (b3 * v3.z);
        return new Vector3(px, py, pz);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CatmulRom">
    /**
     * Definition found @ http://paulbourke.net/miscellaneous/interpolation/ & http://forums.indiegamer.com/showthread.php?4905-Teach-me-splines-for&p=66079#post66079
     * @param p0 The first position in the interpolation.
     * @param p1 The second position in the interpolation.
     * @param p2 The third position in the interpolation.
     * @param p3 The fourth position in the interpolation.
     * @param t A float value between zero and one.
     * @return Returns a Vector3 that is the result of the Catmull-Rom interpolation.
     */
    public static Vector3 catmullRom(Vector3 p0, Vector3 p1, Vector3 p2, Vector3 p3, float t)
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
        
        return new Vector3(outX, outY, outZ);
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
        return new Vector3
        (
            MathHelper.clamp(value.x, min.x, max.x), 
            MathHelper.clamp(value.y, min.y, max.y),
            MathHelper.clamp(value.z, min.z, max.z)
        );
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
     * Performs scalar division between this Vector3 and a scalar. 
     * Converts integer arguments to float.
     * @param scalar A scalar we want to divide the Vector3 by.
     * @return Returns a new Vector3 divide by the scalar.
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
    
    //<editor-fold defaultstate="collapsed" desc="Hermite">
    /**
     * Definition found @ http://cubic.org/docs/hermite.htm
     * Performs a Hermite spline interpolation.
     * @param p1 Start-point of the curve.
     * @param t1 Tangent(direction and speed) to how the curves leaves the start-point.
     * @param p2 End-point of the curve.
     * @param t2 Tangent (direction and speed) to how the curve meets the endpoint.
     * @param amount Weight factor.
     * @return Returns a Vector3 containing the result of the Hermite spline interpolation.
     */
    public static Vector3 hermite(Vector3 p1, Vector3 t1, Vector3 p2, Vector3 t2, float amount)
    {
        float h1, h2, h3, h4, amount2, amount3, outX, outY, outZ;
        
        amount2 = amount * amount; // amount^2
        amount3 = amount2 * amount; // amount^3
        h1 = (2 * amount3) - (3 * amount2) + 1; // weight for p1
        h2 = (-2 * amount3) + (3 * amount2); // weight for p2
        h3 = amount3 - (2 * amount2) + amount; // weight for t1
        h4 = (amount3 - amount2); // weight for t2
        outX = (h1 * p1.x) + (h2 * p2.x) + (h3 * t1.x) + (h4 * t2.x);
        outY = (h1 * p1.y) + (h2 * p2.y) + (h3 * t1.y) + (h4 * t2.y);
        outZ = (h1 * p1.z) + (h2 * p2.z) + (h3 * t1.z) + (h4 * t2.z);
        return new Vector3(outX, outY, outZ);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value1 A Vector3 we want to interpolate with.
     * @param value2 A Vector3 we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector3.
     */
    public static Vector3 lerp(Vector3 value1, Vector3 value2, float amount)
    {
        return new Vector3
        (
            MathHelper.lerp(value1.x, value2.x, amount),
            MathHelper.lerp(value1.y, value2.y, amount),
            MathHelper.lerp(value1.z, value2.z, amount)
        );
    }
    
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value2 A Vector3 we want to interpolate with this Vector3.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector3.
     */
    public Vector3 lerp(Vector3 that, float amount)
    {
        return Vector3.lerp(this, that, amount);
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
        float magnitude = vec.magnitude();
        return new Vector3(vec.x / magnitude, vec.y / magnitude, vec.z / magnitude);
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
    
    //<editor-fold defaultstate="collapsed" desc="Random Vector3">
    /**
     * Generates a Vector3 with random values for components from [-10000,10000].
     * @return Returns a new Vector3 with its x, y, and z components set randomly.
     */
    public static Vector3 random()
    {
        return new Vector3(Vector2.random(), MathHelper.random(-10000, 10000));
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
    
    //<editor-fold defaultstate="collapsed" desc="Smooth Step">
    /**
     * Performs a Smooth Step interpolation between two points.
     * Traditional: smoothstep(t) = 3t2 − 2t3
     * Ken Perlin: smootherstep(t) = 6t5 − 15t4 + 10t3 
     * @param a A Vector3 containing the starting point.
     * @param b A Vector3 containing the ending point.
     * @param amount A float value between zero and one.
     * @return Returns the interpolation between two values.
     */
    public static Vector3 smoothStep(Vector3 a, Vector3 b, float amount)
    {
        return new Vector3
        (
            MathHelper.smoothStep(a.x, b.x, amount),
            MathHelper.smoothStep(a.y, b.y, amount),
            MathHelper.smoothStep(a.z, b.z, amount)
        );
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
     * Converts this Vector3 to string. <x,y,z>
     * @return Returns a string representing the Vector3.
     */
    @Override
    public String toString()
    {
        return "<" + this.x + "," + this.y + "," + this.z + ">";
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Transform">
    public static Vector3 transform()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
}
