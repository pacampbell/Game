package game.framework;

import java.io.Serializable;

/**
 * @author paul
 */
public class Vector3 extends Vector2 implements Serializable
{
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
    public Vector3 add(Vector3 that){return null;}
    public Vector3 add(Vector2 that){return null;}
    
    public static Vector3 add(Vector3 a, Vector3 b){return null;}
    
    public static Vector3 add(Vector3 a, Vector2 b){return null;}
    
    public static Vector3 add(Vector2 a, Vector3 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Cross Product">
    public Vector3 crossProduct(Vector3 that){return null;}
    public Vector3 crossProduct(Vector2 that){return null;}
    
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
     * Performs the cross product between two Vector2.
     * @param u Vector3
     * @param v Vector2
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector3 u, Vector2 v)
    {
        return Vector3.crossProduct(u, new Vector3(v));
    }
    
    /**
     * Performs the cross product between two Vector2.
     * @param u Vector2
     * @param v Vector3
     * @return Returns the result of the cross product as a Vector3.
     */
    public static Vector3 crossProduct(Vector2 u, Vector3 v)
    {
        return Vector3.crossProduct(new Vector3(u), v);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    public static Vector3 distance(Vector3 a, Vector3 b)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    public static Vector3 distanceSquared(Vector3 a, Vector3 b)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public Vector3 subtract(Vector3 that){return null;}
    public Vector3 subtract(Vector2 that){return null;}
    
    public static Vector3 subtract(Vector3 a, Vector3 b){return null;}
    
    public static Vector3 subtract(Vector3 a, Vector2 b){return null;}
    
    public static Vector3 subtract(Vector2 a, Vector3 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    public static Vector3 magnitude(Vector3 a, Vector3 b)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    public static Vector3 magnitudeSquared(Vector3 a, Vector3 b)
    {
        return null;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public Vector3 multiply(float scalar){return null;}
    public Vector3 multiply(int scalar){return null;}
    
    public static Vector3 multiply(Vector3 a, float scalar){return null;}
    
    public static Vector3 multiply(Vector3 a, int scalar){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Projection">
    public static Vector3 project(Vector3 a, Vector3 b){return null;}
    //</editor-fold>
    
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
}
