package game.framework;

import java.io.Serializable;

/**
 * @author paul
 */
public class Vector3 extends Vector2 implements Serializable
{
    public final float z;
    
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
    
    
    /**
     * Test Method, Performs some operations
     * To check results
     */
    public static void performTestVec3()
    {
        /*
        Vector3_Old u = new Vector3_Old(1.0f, 2.0f, 3.0f);

        Vector3_Old v = new Vector3_Old(-2.0f, 1.0f, -3.0f);
        Vector3_Old a;

        Vector3_Old b, c, d, e;

        // Vector Addition
        a = Vector3_Old.add(u, v);

        // Vector Subtraction
        b = Vector3_Old.subtract(u, v);

        // Scalar Multiplication
        c = Vector3_Old.scalarMultiply(u, 10.0f);

        // Magnitude ||u||
        float L = Vector3_Old.magnitude(u);

        // Normalize u
        d = Vector3_Old.normalize(u);

        // Dot product between u * v
        float s = Vector3_Old.dotProduct(u, v);

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
