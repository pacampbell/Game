package game.framework;

import java.io.Serializable;

/**
 * Vector2 class representing a vector of <x, y> components.
 * <br />
 * <h1>Missing:</h1>
 * <ul>
 *  <li>CatmullRom</li>
 *  <li>Divide</li>
 *  <li>Hermite</li>
 *  <li>SmoothStep</li>
 *  <li>Transform</li>
 *  <li>TransformNormal</li>
 * </ul>
 * @author paul
 */

public class Vector2 implements Serializable
{
    /**
     * The x component of the Vector2.
     * Also referred to as i component in vectorial notation. 
     */
    public final float x;
    
    /**
     * The y component of the Vector2.
     * Also referred to as j component in vectorial notation.
     */
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
     * Takes a float value and sets it to the x and y component's of the Vector2.
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
    
    /**
     * Copy Constructor
     * copies the contents of of the provided vector and creates a new vector.
     * @param vec A Vector2 to make a copy of.
     */
    public Vector2(Vector2 vec)
    {
        this(vec.x, vec.y);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Add">
    /**
     * Performs Vector2 Addition on two Vector2
     * and returns a new Vector2
     * @param veca Vector2 to be added
     * @param vecb Vector2 to be added
     * @return Returns a new Vector2 with the result of veca + vecb
     */
    public static Vector2 add(Vector2 veca, Vector2 vecb)
    {
        return new Vector2(veca.x + vecb.x, veca.y + vecb.y);
    }
    
    /**
     * Performs Vector2 addition with this Vector2
     * @param that Vector2 to be added to this Vector2
     * @return Returns a new Vector2 with the result of this + that
     */
    public Vector2 add(Vector2 that)
    {
        return Vector2.add(this, that);
    }
    
    /**
     * Performs addition with this Vector2 and the x and y values provided.
     * @param x The x component we want to add to this Vector2.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x and y added to this.y
     */
    public Vector2 add(float x, float y)
    {
        return Vector2.add(this, new Vector2(x, y));
    }
    
    /**
     * Performs addition with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector2.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x and y added to this.y
     */
    public Vector2 add(int x, float y)
    {
        return Vector2.add(this, new Vector2((float)x, y));
    }
    
    /**
     * Performs addition with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector2.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x and y added to this.y
     */
    public Vector2 add(float x, int y)
    {
        return Vector2.add(this, new Vector2(x, (float)y));
    }
    
    /**
     * Performs addition with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to add to this Vector2.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x and y added to this.y
     */
    public Vector2 add(int x, int y)
    {
        return Vector2.add(this, new Vector2((float)x, (float)y));
    }
    
    /**
     * Adds the value provided to the x component.
     * @param x The x component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x
     */
    public Vector2 addX(float x)
    {
        return Vector2.add(this, new Vector2(x, 0.0f));
    }
    
    /**
     * Converts the integer to a float and adds the value provided to the x component.
     * @param x The x component we want to add to this Vector2.
     * @return Returns a Vector2 with x added to this.x
     */
    public Vector2 addX(int x)
    {
        return Vector2.add(this, new Vector2((float)x, 0.0f));
    }
    
    /**
     * Adds the value provided to the y component.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with y added to this.y
     */
    public Vector2 addY(float y)
    {
        return Vector2.add(this, new Vector2(0.0f, y));
    }
    
    /**
     * Converts the integer to a float and adds the value provided to the y component.
     * @param y The y component we want to add to this Vector2.
     * @return Returns a Vector2 with y added to this.y
     */
    public Vector2 addY(int y)
    {
        return Vector2.add(this, new Vector2(0.0f, (float)y));
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
     * @param vec The Vector2 we want to clamp.
     * @param min The minimum value we want the Vector2 to fall on.
     * @param max The maximum value we want the Vector2 to fall on.
     * @return Returns a Vector2 that is between the two Vector2 provided.
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
     * Calculates the distance between two Vector2
     * @param veca A Vector2 we want to find the distance between.
     * @param vecb A Vector2 we want to find the distance between.
     * @return Returns the distance between the two provided Vector2.
     */
    public static float distance(Vector2 veca, Vector2 vecb)
    {
        return Math.abs(magnitude(veca) - magnitude(vecb));
    }
    
    /**
     * Calculates the distance between two Vector2
     * @param that A Vector2 we want to find the distance between.
     * @return Returns the distance between this Vector2 and that Vector2.
     */
    public float distance(Vector2 that)
    {
        return Vector2.distance(this, that);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    /**
     * Calculates the distance between two Vector2 squared.
     * @param veca A Vector2 we want to find the distance squared between.
     * @param vecb A Vector2 we want to find the distance squared between.
     * @return Returns the distance squared between the two provided Vector2.
     */
    public static float distanceSquared(Vector2 veca, Vector2 vecb)
    {
        float distance = Vector2.distance(veca, vecb);
        return distance * distance;
    }
    
    /**
     * Calculates the distance between two Vector2 squared.
     * @param that A Vector2 we want to find the distance squared between.
     * @return Returns the distance squared between this Vector2 and that Vector2.
     */
    public float distanceSquared(Vector2 that)
    {
        return Vector2.distanceSquared(this, that);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    /**
     * Performs the dot product between two Vector2's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param veca A Vector2 that we want to perform the dot product on.
     * @param vecb A Vector2 that we want to perform the dot product on.
     * @return Returns the dot product between the two Vector2 provided.
     */
    public static float dotProduct(Vector2 veca, Vector2 vecb)
    {
        return (veca.x * vecb.x) + (veca.y * vecb.y);
    }
    
    /**
     * Performs the dot product between two Vector2's.
     * Also known as the scalar product.
     * The result of a dot product is a scalar value.
     * @param that A Vector2 that we want to perform the dot product on.
     * @return Returns the dot product between this Vector2 and that Vector2.
     */
    public float dotProduct(Vector2 that)
    {
        return Vector2.dotProduct(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Checks if Vector B is equal with this Vector2.
     * @param object An object that is believed to be a Vector2.
     * @return Returns the result of the comparison between this Vector2 and that Vector2.
     */
    @Override
    public boolean equals(Object object)
    {
        boolean result = false;
        if(object != null && object instanceof Vector2)
        {
            Vector2 that = (Vector2)object;
            result = Vector2.equals(this, that);
        }
        return result;
    }

    /**
     * Checks the equality between two Vector2
     * @param veca A Vector2 that we want to compare.
     * @param vecb A Vector2 that we want to compare.
     * @return Returns the result of the comparison between the two Vector2.
     */
    public static boolean equals(Vector2 veca, Vector2 vecb)
    {
        boolean result = false;
        if(magnitude(veca) == magnitude(vecb))
            result = true;
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
     * Computes the magnitude of a Vector2.
     * Magnitude is also known as the length of the vector.
     * @return Returns the magnitude of the Vector2.
     */
    public static float magnitude(Vector2 vec)
    {
        float xsq = vec.x * vec.x;
        float ysq = vec.y * vec.y;
        return (float)Math.sqrt(xsq + ysq);
    }
    
    /**
     * Computes the magnitude of this Vector2.
     * Magnitude is also known as the length of the vector.
     * @return Returns the magnitude of this Vector2.
     */
    public float magnitude()
    {
        return Vector2.magnitude(this);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Magnitide Squared">
    /**
     * Calculates the magnitude of a Vector2 squared.
     * @return Returns the magnitude of the Vector2 squared.
     */
    public static float magnitudeSquared(Vector2 veca)
    {
        float magnitude = Vector2.magnitude(veca);
        return magnitude * magnitude;
    }
    
    /**
     * Calculates the magnitude of this Vector2 squared.
     * @return Returns the magnitude of this Vector2 squared.
     */
    public float magnitudeSquared()
    {
        return Vector2.magnitudeSquared(this);
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
     * @param veca A Vector2 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector2.
     * @return returns a new Vector2 multiplied by the scalar.
     */
    public static Vector2 multiply(Vector2 veca, float scalar)
    {
        return new Vector2(veca.x * scalar, veca.y * scalar);
    }
    
    /**
     * Converts an integer to float for scalar multiplication of a Vector2.
     * @param veca A Vector2 we want to multiply.
     * @param scalar A scalar value we want to multiply into the Vector2.
     * @return returns a new Vector2 multiplied by the scalar.
     */
    public static Vector2 multiply(Vector2 veca, int scalar)
    {
        return Vector2.multiply(veca, (float)scalar);
    }
    
    /**
     * Multiplies this Vector2 by a scalar.
     * @param scalar A scalar value we want to multiply into the Vector2.
     * @return returns this Vector2 multiplied by the scalar.
     */
    public Vector2 multiply(float scalar)
    {
        return Vector2.multiply(this, scalar);
    }
    
    /**
     * Converts an integer to float then multiplies this Vector2 by a scalar.
     * @param scalar A scalar value we want to multiply into the Vector2.
     * @return returns this Vector2 multiplied by the scalar.
     */
    public Vector2 multiply(int scalar)
    {
        return Vector2.multiply(this, (float)scalar);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    /**
     * Returns a new Vector2 pointing in the opposite direction.
     * @param veca The Vector2 we want to negate.
     * @return Returns A Vector2 that has been negated.
     */
    public static Vector2 negate(Vector2 veca)
    {
        return new Vector2(veca.x * -1, veca.y * -1);
    }
    
    /**
     * Returns this Vector2 pointing in the opposite direction.
     * @return Returns this Vector2 negated.
     */
    public Vector2 negate()
    {
        return Vector2.negate(this);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Normalize">
    /**
     * Normalizes a Vector2; Also know as the unit vector.
     * @param vec A Vector2 we want to normalize.
     * @return Returns a new Vector2 that is normalized.
     */
    public static Vector2 normalize(Vector2 vec)
    {
        float magnitude = magnitude(vec);
        return new Vector2(vec.x / magnitude, vec.y / magnitude);
    }
    
    /**
     * Normalizes this Vector2
     * @return Returns this Vector2 that has been normalized.
     */
    public Vector2 normalize()
    {
        return Vector2.normalize(this);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Projection">
    /**
     * Calculates the scalar projection of b onto a.
     * @param a A Vector2 we want to project onto.
     * @param b A Vector2 we want project.
     * @return Returns the scalar projection of b onto a.
     */
    public static float scalarProjection(Vector2 a, Vector2 b)
    {
        return Vector2.dotProduct(a, b) / Vector2.magnitude(a);
    }
    
    /**
     * Calculates the scalar projection of that onto this.
     * @param that A vector2 we want to project.
     * @return Returns the scalar projection of that onto this.
     */ 
    public float scalarProjection(Vector2 that)
    {
        return Vector2.scalarProjection(this, that);
    }
    
    /**
     * Calculates the vector projection of b onto a.
     * @param a A Vector2 we want to project onto.
     * @param b A Vector2 we want project.
     * @return Returns the vector projection of b onto a.
     */
    public static Vector2 vectorProjection(Vector2 a, Vector2 b)
    {
        float scalar = Vector2.scalarProjection(a, b);
        Vector2 normal = Vector2.normalize(a);
        return Vector2.multiply(normal, scalar);
    }
    
    /**
     * Calculates the vector projection of that onto this.
     * @param that A Vector2 we want project.
     * @return Returns the vector projection of that onto this.
     */
    public Vector2 vectorProjection(Vector2 that)
    {
        return Vector2.vectorProjection(this, that);
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
     * Returns a special type of vector; The one vector <1,1>
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
     * The Zero vector, also known as the null vector <0,0>
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
     * @param veca A Vector2 to be subtracted.
     * @param vecb A Vector2 to be subtracted.
     * @return Returns a new Vector2 that is the difference between the two provided Vector2's
     */
    public static Vector2 subtract(Vector2 veca, Vector2 vecb)
    {
        return new Vector2(veca.x - vecb.x, veca.y - vecb.y);
    }
    
    /**
     * Subtracts a Vector2 from this
     * @param that A Vector2 to be subtracted.
     * @return Returns a new Vector2 that is the difference between this Vector2 and that Vector2.
     */
    public Vector2 subtract(Vector2 that)
    {
        return Vector2.subtract(this, that);
    }
    
    /**
     * Performs subtraction with this Vector2 and the x and y values provided.
     * @param x The x component we want to subtract from this Vector2.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x and y subtracted from this.y
     */
    public Vector2 subtract(float x, float y)
    {
        return Vector2.subtract(this, new Vector2(x, y));
    }
    
    /**
     * Performs subtraction with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector2.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x and y subtracted from this.y
     */
    public Vector2 subtract(int x, float y)
    {
        return Vector2.subtract(this, new Vector2((float)x, y));
    }
    
    /**
     * Performs subtraction with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector2.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x and y subtracted from this.y
     */
    public Vector2 subtract(float x, int y)
    {
        return Vector2.subtract(this, new Vector2(x, (float)y));
    }
    
    /**
     * Performs subtraction with this Vector2 and the x and y values provided.
     * Converts integer arguments to float.
     * @param x The x component we want to subtract from this Vector2.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x and y subtracted from this.y
     */
    public Vector2 subtract(int x, int y)
    {
        return Vector2.subtract(this, new Vector2((float)x, (float)y));
    }
    
    /**
     * Subtracts the value provided from the x component.
     * @param x The x component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x
     */
    public Vector2 subtractX(float x)
    {
        return Vector2.subtract(this, new Vector2(x, 0.0f));
    }
    
    /**
     * Converts the integer to a float and subtracts the value provided from the x component.
     * @param x The x component we want to subtract from this Vector2.
     * @return Returns a Vector2 with x subtracted from this.x
     */
    public Vector2 subtractX(int x)
    {
        return Vector2.subtract(this, new Vector2((float)x, 0.0f));
    }
    
    /**
     * Subtracts the value provided from the y component.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with y subtracted from this.y
     */
    public Vector2 subtractY(float y)
    {
        return Vector2.subtract(this, new Vector2(0.0f, y));
    }
    
    /**
     * Converts the integer to a float and subtracts the value provided to the y component.
     * @param y The y component we want to subtract from this Vector2.
     * @return Returns a Vector2 with y subtracted from this.y
     */
    public Vector2 subtractY(int y)
    {
        return Vector2.subtract(this, new Vector2(0.0f, (float)y));
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Converts the Vector2 to a string.
     * @return Returns a string representing the Vector2.
     */
    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
    //</editor-fold>
}