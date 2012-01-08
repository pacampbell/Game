package game.framework;

import java.io.Serializable;

/**
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
    public Vector3 addX(int x)
    {
        return Vector3.add(this, new Vector3((float)x, 0.0f, 0.0f));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param y The y component we want to add to this Vector3.
     * @return Returns a Vector3 with y added to this.y
     */
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
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    /**
     * Computes the distance between two Vector3.
     * @param a A Vector3 we want to compute the distance with.
     * @param b A Vector3 we want to compute the distance with.
     * @return Returns the distance between a and b.
     */
    public static float distance(Vector3 a, Vector3 b)
    {
        return Math.abs(Vector3.magnitude(a) - Vector3.magnitude(b));
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
        float distance = Vector3.distance(a, b);
        return distance * distance;
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
        if(Vector3.magnitude(veca) == Vector3.magnitude(vecb))
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
        return (float)Math.sqrt((a.x * a.x) + (a.y * a.y) + (a.z * a.z));
    }
    
    /**
     * Computes the magnitude of this Vector3.
     * @return Returns the magnitude of this Vector3.
     */
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
        return Vector3.magnitude(a) * Vector3.magnitude(a);
    }
    
    /**
     * Computes the magnitude squared of this Vector3
     * @return Returns the magnitude squared this Vector3.
     */
    public float magnitudeSquared()
    {
        return Vector3.magnitudeSquared(this);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max">
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Min">
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public Vector3 multiply(float scalar){return null;}
    public Vector3 multiply(int scalar){return null;}
    
    public static Vector3 multiply(Vector3 a, float scalar){return null;}
    
    public static Vector3 multiply(Vector3 a, int scalar){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
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
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Projection">
    public static Vector3 scalarProjection(Vector3 a, float scalar){return null;}
    public static Vector3 scalarProjection(Vector3 a, int scalar){return null;}
    
    public static Vector3 vectorProjection(Vector3 a, float scalar){return null;}
    public static Vector3 vectorProjection(Vector3 a, int scalar){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Reflection">
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
     * Returns the unit vector for the x-axis.
     * @return Returns a Vector3 with the x component set to 1.0.
     */
    public static Vector3 unitX()
    {
        return new Vector3(1.0f, 0.0f, 0.0f);
    }
    
    /**
     * Returns the unit vector for the y-axis.
     * @return Returns a Vector3 with the y component set to 1.0.
     */
    public static Vector3 unitY()
    {
        return new Vector3(0.0f, 1.0f, 0.0f);
    }

    /**
     * Returns the unit vector for the z-axis.
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
    public Vector3 subtract(Vector3 that){return null;}
    public Vector3 subtract(Vector2 that){return null;}
    
    public static Vector3 subtract(Vector3 a, Vector3 b){return null;}
    
    public static Vector3 subtract(Vector3 a, Vector2 b){return null;}
    
    public static Vector3 subtract(Vector2 a, Vector3 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Test operations">
    /**
     * Test Method; Performs some operations
     * To check results
     */
    public static void performTestVec3()
    {
        Vector2 veca = new Vector2(1.0f);
        Vector3 vecb = new Vector3(2.0f);
        Vector2 vecc = Vector2.add(veca, vecb);
        System.out.println("Result: " + vecc);
        
        /*
        Vector3_Old u = new Vector3_Old(1.0f, 2.0f, 3.0f);

        Vector3_Old v = new Vector3_Old(-2.0f, 1.0f, -3.0f);
        Vector3_Old a;

        Vector3_Old b, c, d, e;

        // Vector Addition
        a = Vector3.add(u, v);

        // Vector Subtraction
        b = Vector3.subtract(u, v);

        // Scalar Multiplication
        c = Vector3.scalarMultiply(u, 10.0f);

        // Magnitude ||u||
        float L = Vector3.magnitude(u);

        // Normalize u
        d = Vector3.normalize(u);

        // Dot product between u * v
        float s = Vector3.dotProduct(u, v);

        // Cross Product u x v
        e = Vector3_Old.crossProduct(u, v);

        // Print Results
        System.out.println("u               " + u.toString());
        System.out.println("v               " + v.toString());
        System.out.println("a = u + v       " + a.toString());
        System.out.println("b = u - v       " + b.toString());
        System.out.println("c = u * 10      " + c.toString());
        System.out.println("d = u / ||u||   " + d.toString());
        System.out.println("e = u x v       " + e.toString());
        System.out.println("L = ||u||       " + L);
        System.out.println("s = u . v       " + s);
         * 
         */
    }
    //</editor-fold>
}
