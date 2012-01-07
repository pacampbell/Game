package game.framework;
/**
 * Need to implement Transform functions
 *  Transforms one or more Vector3s by a Matrix or Quaternion.
 * Need to implement Transform Normal
 *  Transforms a vector normal or array of vector normals by a matrix.
 *
 * Also Missing:
 *  Barycentric
 *  CatmullRom
 *  Divide; This normally is not defined for vectors but is in some frameworks component wise. (idk why)
 *  Hermite
 *  Lerp
 *  SmoothStep
 * @author paul
 */

public class Vector3
{
    private float x;
    private float y;
    private float z;

    // Complete Constructor
    public Vector3(float x, float y, float z)
    {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    // Sets all components of the vector to the value
    public Vector3(float value)
    {
        this.x = value;
        this.y = value;
        this.z = value;
    }

    // Sets the Vector3 to the values in the Vector2
    // and a 3rd point z
    public Vector3(Vector2 vec2, float z)
    {
        this.x = vec2.x;
        this.y = vec2.y;
        this.z = z;
    }

    // Empty Constructor
    // Sets x, y. and z to zero
    public Vector3()
    {
        this(0.0f, 0.0f, 0.0f);
    }

    /**
     * Performs Vector3 Addition on two Vector3
     * and returns a new Vector3
     * @param veca
     * @param vecb
     * @return Vector3
     */
    public static Vector3 add(Vector3 veca, Vector3 vecb)
    {
        float vecCx = veca.x + vecb.x;
        float vecCy = veca.y + vecb.y;
        float vecCz = veca.z + vecb.z;
        return new Vector3(vecCx, vecCy, vecCz);
    }

    /**
     * Clamps a Vector3 between a min Vector3 and a max Vector3
     * and returns the modified Vector2
     * @return Vector2
     */
    public static Vector3 clamp(Vector3 vec, Vector3 min, Vector3 max)
    {
        // Clamp min and max x values
        if(vec.x < min.x)
        {
            vec.x = min.x;
        }
        else if(vec.x > max.x)
        {
            vec.x = max.x;
        }

        // Clamp min and max y values
        if(vec.y < min.y)
        {
            vec.y = min.y;
        }
        else if(vec.x > max.x)
        {
            vec.y = max.y;
        }

        // Clamp min and max z values
        if(vec.z < min.z)
        {
            vec.z = min.z;
        }
        else if(vec.z > max.z)
        {
            vec.z = max.z;
        }

        // Return the Clamped Vector
        return vec;
    }

    /**
     * Performs the cross product between 2 Vector3
     * You have u = {ux, uy, uz}
     * You have v = {vx, vy, vz}
     * Then uxv = (uyvz - uzvy, uzvx - uxvz, uxvy - uyvx)
     * @param veca
     * @param veb
     * @return
     */
    public static Vector3 crossProduct(Vector3 u, Vector3 v)
    {
        float newX = (u.y * v.z) - (u.z * v.y);
        float newY = (u.z * v.x) - (u.x * v.z);
        float newZ = (u.x * v.y) - (u.y * v.x);
        return new Vector3(newX, newY, newZ);
    }

    /**
     * Finds the distance between two Vector3
     * @param veca
     * @param vecb
     * @return float
     */
    public static float distance(Vector3 veca, Vector3 vecb)
    {
        float magA = magnitude(veca);
        float magB = magnitude(vecb);
        return Math.abs(magA - magB);
    }

    /**
     * Calculates the distance squared betwen two Vector3
     * @param veca
     * @param vecb
     * @return float
     */
    public static float distanceSquared(Vector3 veca, Vector3 vecb)
    {
        float magA = magnitude(veca);
        float magB = magnitude(vecb);
        float distance = magA - magB;
        return distance * distance;
    }

    /**
     * Performs the dot product between 3 Vector3's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param vecb
     * @return float
     */
    public static float dotProduct(Vector3 veca, Vector3 vecb)
    {
        return (veca.x * vecb.x) + (veca.y * vecb.y) + (veca.z * vecb.z);
    }

    /**
     * Checks if Vector B is equal with this Vector3.
     * @param vecb
     * @return result
     */
    public boolean equals(Vector3 vecb)
    {
        boolean result = false;
        float magA = magnitude();
        float magB = magnitude(vecb);
        if(magA == magB)
        {
            result = true;
        }
        return result;
    }

    /**
     * Checks the equality between two Vector3
     * @param veca
     * @param vecb
     * @return result
     */
    public static boolean equals(Vector3 veca, Vector3 vecb)
    {
        boolean result = false;
        float magA = magnitude(veca);
        float magB = magnitude(vecb);
        if(magA == magB)
        {
            result = true;
        }
        return result;
    }

    /**
     * Returns the magnitude of this Vector3.
     * Magnitude is also known as the length of the vector.
     * @return float magnitude
     */
    public float magnitude()
    {
        float xsq = (float)Math.pow(this.x, 2);
        float ysq = (float)Math.pow(this.y, 2);
        float zsq = (float)Math.pow(this.z, 2);
        return (float)Math.sqrt(xsq + ysq + zsq);
    }

    /**
     * Computes the magitude of a Vector3.
     * Magnitude is also known as the length of the vector.
     * @return float magnitude
     */
    public static float magnitude(Vector3 vec)
    {
        float xsq = (float)Math.pow(vec.x, 2);
        float ysq = (float)Math.pow(vec.y, 2);
        float zsq = (float)Math.pow(vec.z, 2);
        return (float)Math.sqrt(xsq + ysq + zsq);
    }

    /**
     * Calculates the magnitude of this Vector3 squared.
     * Magnitude is also known as the length of the vector.
     * @return float magnitudeSquared
     */
    public float magnitudeSquared()
    {
        float magnitude = magnitude();
        return magnitude * magnitude;
    }

    /**
     * Calculates the magnitude of a Vector3 squared.
     * Magnitude is also known as the length of the vector.
     * @return float magnitudeSquared
     */
    public static float magnitudeSquared(Vector3 veca)
    {
        float magnitude = magnitude(veca);
        return magnitude * magnitude;
    }

    /**
     * Returns a Vector3 that contains the highest value
     * from each matching pair of components.
     * @param veca
     * @param vecb
     * @return Vector3
     */
    public static Vector3 max(Vector3 veca, Vector3 vecb)
    {
        float cx; // VectorC x value
        float cy; // VectorC y value
        float cz; // VectorC z value

        // Compare X values
        if(veca.x > vecb.x)
            cx = veca.x;
        else
            cx = vecb.x;

        // Compare y values
        if(veca.y > vecb.y)
            cy = veca.y;
        else
            cy = vecb.y;

        // Compare z values
        if(veca.z > vecb.z)
            cz = veca.z;
        else
            cz = vecb.z;

        return new Vector3(cx, cy, cz);
    }

    /**
     * Returns a Vector3 that contains the lowest value from
     * each matching pair of components.
     * @param veca
     * @param vecb
     * @return Vector3
     */
    public static Vector3 min(Vector3 veca, Vector3 vecb)
    {
        float cx; // VectorC x value
        float cy; // VectorC y value
        float cz; // VectorC z value

        // Compare X values
        if(veca.x < vecb.x)
            cx = veca.x;
        else
            cx = vecb.x;

        // Compare y values
        if(veca.y < vecb.y)
            cy = veca.y;
        else
            cy = vecb.y;

        // Compare z values
        if(veca.z < vecb.z)
            cz = veca.z;
        else
            cz = vecb.z;

        return new Vector3(cx, cy, cz);
    }

    /**
     * Returns a new Vector3 pointing in the opposite direction.
     * @param veca
     * @return Vector3
     */
    public static Vector3 negate(Vector3 veca)
    {
        return new Vector3(veca.x * -1, veca.y * -1, veca.z * -1);
    }

    /**
     * Normalizes this Vector3
     */
    public void normalize()
    {
        float magnitude = magnitude();
        this.x = x / magnitude;
        this.y = y / magnitude;
        this.z = z/ magnitude;
    }

    /**
     * Normalizes a  input Vector3 and
     * returns a new Vector3 that is normalized
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
     * Returns a spcial type of Vector
     * The one vector
     * (1,1,1)
     * @return
     */
    public static Vector3 one()
    {
        return new Vector3(1.0f, 1.0f, 1.0f);
    }

    /**
     * r = 2 * (I.N) * N - I
     * I is the incident vector
     * N is the normal
     * dot() is the dot product
     * @param incident
     * @param normal
     * @return Vector2
     */
    public static Vector3 reflect(Vector3 incident, Vector3 normal)
    {
        float dotResult = dotProduct(incident, normal);
        float dot2 =  dotResult * 2;
        Vector3 normDot2 = scalarMultiply(normal, dot2);
        return subtract(normDot2, incident);
    }

    /**
     * Multiplys a Vector3 by a scalar
     * and returns a new Vector3.
     * @param veca
     * @param scalar
     * @return Vector3
     */
    public static Vector3 scalarMultiply(Vector3 veca, float scalar)
    {
        float vecCx = veca.x * scalar;
        float vecCy = veca.y * scalar;
        float vecCz = veca.z * scalar;
        return new Vector3(vecCx, vecCy, vecCz);
    }

    /**
     * Converts an int to float for scalar multiplication
     * of a Vector3.
     * @param veca
     * @param scalar
     */
    public static Vector3 scalarMultiply(Vector3 veca, int scalar)
    {
        return scalarMultiply(veca, (float)scalar);
    }

    /**
     * Performs Vector3 Subtraction on two Vector3
     * and returns a new Vector3
     * @param veca
     * @param vecb
     * @return
     */
    public static Vector3 subtract(Vector3 veca, Vector3 vecb)
    {
        float vecCx = veca.x - vecb.x;
        float vecCy = veca.y - vecb.y;
        float vecCz = veca.z - vecb.z;
        return new Vector3(vecCx, vecCy, vecCz);
    }

    /**
     * Returns a string value to represent the Vector3
     * @return String
     */
    @Override
    public String toString()
    {
        return "(" + x + "," + y + "," + z + ")";
    }

    /**
     * Returns the unit vector for the x-axis.
     * @return Vector3
     */
    public static Vector3 unitX()
    {
        return new Vector3(1.0f, 0.0f, 0.0f);
    }

    /**
     * Returns the unit vector for the y-axis.
     * @return Vector3
     */
    public static Vector3 unitY()
    {
        return new Vector3(0.0f, 1.0f, 0.0f);
    }

    /**
     * Returns the unit vector for the z-axis.
     * @return Vector3
     */
    public static Vector3 unitZ()
    {
        return new Vector3(0.0f, 0.0f, 1.0f);
    }

    /**
     * Returns a special type of Vector
     * The Zero vector also known as the null vector
     * (0,0,0)
     * @return Vector3
     */
    public static Vector3 zero()
    {
        return new Vector3();
    }

    /**
     * Test Method, Performs some operations
     * To check results
     */
    public static void performTestVec3()
    {
        Vector3 u = new Vector3(1.0f, 2.0f, 3.0f);

        Vector3 v = new Vector3(-2.0f, 1.0f, -3.0f);

        Vector3 a, b, c, d, e;

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
        e = Vector3.crossProduct(u, v);

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
    }

    //<editor-fold defaultstate="collapsed" desc="Getter/Setter">

    /**
     * Returns the x value of the Vector3
     * @return x
     */
    public float x()
    {
        return this.x;
    }

    /**
     * Returns the y value of the Vector3
     * @return y
     */
    public float y()
    {
        return this.y;
    }

    /**
     * Returns the z value of the Vector3
     * @return z
     */
    public float z()
    {
        return this.z;
    }

    /**
     * Sets the x value of the Vector3
     * @param x
     */
    public void setX(float x)
    {
        this.x = x;
    }

    /**
     * Sets the y value of the Vector3
     * @param y
     */
    public void setY(float y)
    {
        this.y = y;
    }

    /**
     * Sets the z value of the Vector3
     * @param z
     */
    public void setZ(float z)
    {
        this.z = z;
    }

    //</editor-fold>
}
