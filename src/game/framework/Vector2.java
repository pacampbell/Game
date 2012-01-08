package game.framework;

import java.io.Serializable;

/**
 * There is not a very well defined cross product for 2d vectors
 * So we will not implement one..
 *
 * Need to implement Transform functions
 * Transforms one or more Vector2's by a Matrix or Quaternion.
 * Need to implement Transform Normal
 *  Transforms a vector normal or array of vector normals by a matrix.
 * 
 * Also Missing:
 *  CatmullRom
 *  Divide; This normally is not defined for vectors but is in some frameworks component wise.
 *  Hermite
 *  SmoothStep
 * @author paul
 */

public class Vector2 implements Serializable
{
    public final float x;
    public final float y;
    
    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * @param x x component of the Vector2
     * @param y y component of the Vector2
     */
    public Vector2(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
    
    /**
     * Takes integer input and converts them into floats
     * @param x x component of the Vector2
     * @param y y component of the Vector2
     */
    public Vector2(int x, int y)
    {
        this((float)x, (float)y);
    }

    /**
     * Takes a float value and sets it to the x and y
     * component's of the vector.
     * @param value for x and y components of the Vector2
     */
    public Vector2(float value)
    {
        this(value, value);
    }
    
    /**
     * Takes a integer value and casts it to a float value. 
     * The float value is then set to the x and y
     * component's of the vector.
     * @param value for x and y components of the Vector2
     */
    public Vector2(int value)
    {
        this(value, value);
    }

    /**
     * Empty Constructor
     * Sets both x and y components to zero.
     * This is also known as the zero vector or null vector.
     */
    public Vector2()
    {
        this(0.0f, 0.0f);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs Vector2 Addition on two Vector2
     * and returns a new Vector2
     * @param veca Vector2 to be added
     * @param vecb Vector2 to be added
     * @return Vector2 returns a new Vector2 with the result of veca + vecb
     */
    public static Vector2 add(Vector2 veca, Vector2 vecb)
    {
        return new Vector2(veca.x + vecb.x, veca.y + vecb.y);
    }
    
    /**
     * Performs Vector2 addition with this Vector2
     * @param that Vector2 to be added to this Vector2
     */
    public Vector2 add(Vector2 that)
    {
        return new Vector2(this.x + that.x, this.y + that.y);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Barycentric">
    /**
     * The Vector2 Barycentric method takes three vectors specifying the Cartesian coordinates of the triangle vertices, V1, V2, and V3), and 
     * two areal coordinates b2 and b3 of some point P (b2 is the amount1 argument, and b3 is the amount2 argument). The b2 coordinate relates 
     * to vertex V2, and the b3coordinate relates to V3. Barycentric then calculates the Cartesian coordinate of P as follows:
       Px = ( (1 - b2 - b3) * V1x ) + (b2 * V2x) + (b3 * V3x);
       Py = ( (1 - b2 - b3) * V1y ) + (b2 * V2y) + (b3 * V3y);
     * Thus, to calculate the 2D Cartesian coordinates of P, you would pass the coordinates of the triangle vertices to Barycentric together with the appropriate 
     * normalized barycentric coordinates of P.
     * If ( (amount1 <= 0) and (amount2 >= 0) and (1 − amount1 − amount2 >= 0) ), then the point is inside the triangle defined by value1, value2, and value3.
     * If ( (amount1 == 0) and (amount2 >= 0) and (1 − amount1 − amount2 >= 0) ), then the point is on the line defined by value1 and value3.
     * If ( (amount1 >= 0) and (amount2 == 0) and (1 − amount1 − amount2 >= 0) ), then the point is on the line defined by value1 and value2.
     * If ( (amount1 >= 0) and (amount2 >= 0) and (1 − amount1 − amount2 == 0) ), then the point is on the line defined by value2 and value3.
     * @param value1
     * @param value2
     * @param value3
     * @param amount2
     * @param amount3
     * @return 
     */
    public static Vector2 barycentric(Vector2 value1, Vector2 value2, Vector2 value3, float amount2, float amount3)
    {
        float amount1 = 1 - amount2 - amount3;
        float px = (amount1 * value1.x) + (amount2 * value2.x) + (amount3 * value3.x);
        float py = (amount1 * value1.y) + (amount2 * value2.y) + (amount3 * value3.y);
        return new Vector2(px, py);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    /**
     * Clamps a Vector2 between a min Vector2 and a max Vector2
     * and returns the modified Vector2
     * @return Vector2
     */
    public static Vector2 clamp(Vector2 vec, Vector2 min, Vector2 max)
    {
        float newX = vec.x;
        float newY = vec.y;
        
        // Clamp min and max x values
        if(vec.x < min.x)
        {
            newX = min.x;
        }
        else if(vec.x > max.x)
        {
            newX = max.x;
        }

        // Clamp min and max y values
        if(vec.y < min.y)
        {
            newY = min.y;
        }
        else if(vec.y > max.y)
        {
            newY = max.y;
        }

        // Return the Clamped Vector
        return vec = new Vector2(newX, newY);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Distance">
    /**
     * Finds the distance between two Vector2
     * @param veca
     * @param vecb
     * @return float
     */
    public static float distance(Vector2 veca, Vector2 vecb)
    {
        return Math.abs(magnitude(veca) - magnitude(vecb));
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    /**
     * Calculates the distance squared between two vectors
     * @param veca
     * @param vecb
     * @return float
     */
    public static float distanceSquared(Vector2 veca, Vector2 vecb)
    {
        float distance = distance(veca, vecb);
        return distance * distance;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    /**
     * Performs the dot product between 2 Vector2's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param vecb
     * @return float 
     */
    public static float dotProduct(Vector2 veca, Vector2 vecb)
    {
        return (veca.x * vecb.x) + (veca.y * vecb.y);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Checks if Vector B is equal with this Vector2.
     * @param object
     * @return Returns the result of the comparison.
     */
    @Override
    public boolean equals(Object object)
    {
        boolean result = false;
        if(object != null && object instanceof Vector2)
        {
            Vector2 that = (Vector2)object;
            if(magnitude(this) == magnitude(that))
            {
                result = true;
            }
        }
        return result;
    }

    /**
     * Checks the equality between two Vector2
     * @param veca
     * @param vecb
     * @return result
     */
    public static boolean equals(Vector2 veca, Vector2 vecb)
    {
        boolean result = false;
        if(magnitude(veca) == magnitude(vecb))
        {
            result = true;
        }
        return result;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Hash Code">
    /**
     * @return Returns a hash code for the object
     */
    @Override
    public int hashCode() 
    {
        int hash = 3;
        hash = 61 * hash + Float.floatToIntBits(this.x);
        hash = 61 * hash + Float.floatToIntBits(this.y);
        return hash;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value1
     * @param value2
     * @return 
     */
    public static Vector2 lerp(Vector2 value1, Vector2 value2, float amount)
    {
        float lerpX = value1.x + (value2.x - value1.x) * amount;
        float lerpY = value1.y + (value2.y - value1.y) * amount;
        return new Vector2(lerpX, lerpY);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    /**
     * Returns the magnitude of this Vector2.
     * Magnitude is also known as the length of the vector.
     * @return float magnitude
     */
    public float magnitude()
    {
        float xsq = this.x * this.x;
        float ysq = this.y * this.y;
        return (float)Math.sqrt(xsq + ysq);
    }

    /**
     * Computes the magnitude of a Vector2.
     * Magnitude is also known as the length of the vector.
     * @return float magnitude
     */
    public static float magnitude(Vector2 vec)
    {
        float xsq = vec.x * vec.x;
        float ysq = vec.y * vec.y;
        return (float)Math.sqrt(xsq + ysq);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Magnitide Squared">
    /**
     * Calculates the magnitude of this Vector2 squared.
     * Magnitude is also known as the length of the vector.
     * @return float magnitudeSquared
     */
    public float magnitudeSquared()
    {
        float magnitude = magnitude();
        return magnitude * magnitude;
    }

    /**
     * Calculates the magnitude of a Vector2 squared.
     * Magnitude is also known as the length of the vector.
     * @return float magnitudeSquared
     */
    public static float magnitudeSquared(Vector2 veca)
    {
        float magnitude = magnitude(veca);
        return magnitude * magnitude;
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Max & Min">
    /**
     * Returns a Vector2 that contains the highest value
     * from each matching pair of components.
     * @param veca
     * @param vecb
     * @return Vector2
     */
    public static Vector2 max(Vector2 veca, Vector2 vecb)
    {
        float cx = (veca.x > vecb.x) ? veca.x : vecb.x;
        float cy = (veca.y > vecb.y) ? veca.y : vecb.y;
        return new Vector2(cx, cy);
    }

    /**
     * Returns a Vector2 that contains the lowest value from
     * each matching pair of components.
     * @param veca
     * @param vecb
     * @return Vector2
     */
    public static Vector2 min(Vector2 veca, Vector2 vecb)
    {
        float cx = (veca.x < vecb.x) ? veca.x : vecb.x;
        float cy = (veca.y < vecb.y) ? veca.y : vecb.y;
        return new Vector2(cx, cy);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Multiply">
    /**
     * Multiplies a Vector2 by a scalar
     * and returns a new Vector2.
     * @param veca
     * @param scalar
     * @return returns a new Vector2
     */
    public static Vector2 multiply(Vector2 veca, float scalar)
    {
        return new Vector2(veca.x * scalar, veca.y * scalar);
    }

    /**
     * Converts an integer to float for scalar multiplication
     * of a Vector2.
     * @param veca
     * @param scalar
     */
    public static Vector2 multiply(Vector2 veca, int scalar)
    {
        return multiply(veca, (float)scalar);
    }
    
    /**
     * Multiplies this Vector2 by a float scalar
     * @param scalar 
     */
    public Vector2 multiply(float scalar)
    {
        return new Vector2(this.x * scalar, this.y * scalar);
    }
    
    /**
     * Converts an integer scalar to a float value and then
     * multiplies this Vector2 by a float scalar
     * @param scalar 
     */
    public Vector2 multiply(int scalar)
    {
        return multiply((float)scalar);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * Returns a new Vector2 pointing in the opposite direction.
     * @param veca
     * @return Vector2
     */
    public static Vector2 negate(Vector2 veca)
    {
        return new Vector2(veca.x * -1, veca.y * -1);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Normalize">
    /**
     * Normalizes this Vector2
     */
    public Vector2 normalize()
    {
        float magnitude = magnitude();
        return new Vector2(this.x / magnitude, this.y / magnitude);
    }

    /**
     * Normalizes a  input Vector2 and
     * @return a new Vector2 that is normalized.
     */
    public static Vector2 normalize(Vector2 vec)
    {
        float magnitude = magnitude(vec);
        return new Vector2(vec.x / magnitude, vec.y / magnitude);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Reflect">
    /**
     * r = 2 * (I.N) * N - I
     * I is the incident vector
     * N is the normal
     * @param incident
     * @param normal
     * @return returns a reflect vector of type Vector2
     */
    public static Vector2 reflect(Vector2 incident, Vector2 normal)
    {
        float dotResult = dotProduct(incident, normal);
        float dot2 =  dotResult * 2;
        Vector2 normDot2 = multiply(normal, dot2);
        return subtract(normDot2, incident);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Vectors">
    /**
     * Returns a special type of vector
     * The one vector
     * (1,1)
     * @return returns the special one vector.
     */
    public static Vector2 one()
    {
        return new Vector2(1.0f, 1.0f);
    }
    
    /**
     * Returns the unit vector for the x-axis.
     * @return Vector2
     */
    public static Vector2 unitX()
    {
        return new Vector2(1.0f, 0.0f);
    }

    /**
     * Returns the unit vector for the y-axis.
     * @return Vector2
     */
    public static Vector2 unitY()
    {
        return new Vector2(0.0f, 1.0f);
    }

    /**
     * Returns a special type of Vector
     * The Zero vector also known as the null vector
     * (0,0)
     * @return Vector2
     */
    public static Vector2 zero()
    {
        return new Vector2(0.0f, 0.0f);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Subtraction">
    /**
     * Performs Vector2 Subtraction on two Vector2
     * and returns a new Vector2
     * @param veca
     * @param vecb
     * @return Returns a new Vector2 that is the difference between the two provided Vector2's
     */
    public static Vector2 subtract(Vector2 veca, Vector2 vecb)
    {
        return new Vector2(veca.x - vecb.x, veca.y - vecb.y);
    }
    
    /**
     * Subtracts a Vector2 from this
     * @param that Vector2 to be subtracted from this
     */
    public Vector2 subtract(Vector2 that)
    {
        return new Vector2(this.x - that.x, this.y - that.y);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Returns a string value to represent the Vector2
     * @return String
     */
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
    //</editor-fold>
}
