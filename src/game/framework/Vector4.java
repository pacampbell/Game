package game.framework;

/**
 * Vector4 class representing a vector of <x, y, z, w> components.
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
    public static Vector4 add(Vector4 a, Vector4 b){return null;}
    public static Vector4 add(Vector4 a, Vector3 b){return null;}
    public static Vector4 add(Vector4 a, Vector2 b){return null;}
    public Vector4 add(Vector4 that){return null;}
    @Override
    public Vector4 add(Vector3 that){return null;}
    @Override
    public Vector4 add(Vector2 that){return null;}
    public Vector4 add(float x, float y, float z, float w){return null;}
    public Vector4 add(int x, int y, int z, int w){return null;}
    public Vector4 add(Vector3 vec, float w){return null;}
    public Vector4 add(Vector2 vec, float z, float w){return null;}
    
    @Override
    public Vector4 addX(float x){return null;}
    @Override
    public Vector4 addX(int x){return null;}
    @Override
    public Vector4 addY(float y){return null;}
    @Override
    public Vector4 addY(int y){return null;}
    @Override
    public Vector4 addZ(float z){return null;}
    @Override
    public Vector4 addZ(int z){return null;}
    public Vector4 addW(float w){return null;}
    public Vector4 addW(int w){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Barycentric">
    public static Vector4 barycentric(){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="CatmullRom">
    public static Vector4 catmullRom(){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Clamp">
    public static Vector4 clamp(Vector4 value, Vector4 min, Vector4 max){return null;}
    public Vector4 clamp(Vector4 min, Vector4 max){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance">
    public static Vector4 distance(Vector4 a, Vector4 b){return null;}
    public Vector4 distance(Vector4 that){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Distance Squared">
    public static Vector4 distanceSquared(Vector4 a, Vector4 b){return null;}
    public Vector4 distanceSquared(Vector4 that){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Divide">
    public static Vector4 divide(Vector4 a, float scalar){return null;}
    public static Vector4 divide(Vector4 a, int scalar){return null;}
    @Override
    public Vector4 divide(float scalar){return null;}
    @Override
    public Vector4 divide(int scalar){return null;}
    public static Vector4 divide(Vector4 a, Vector4 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Dot Product">
    public static float dotProduct(Vector4 a, Vector4 b){return -1;}
    public static float dotProduct(Vector4 a, Vector3 b){return -1;}
    public static float dotProduct(Vector4 a, Vector2 b){return -1;}
    public float dotProduct(Vector4 that){return -1;}
    @Override
    public float dotProduct(Vector3 that){return -1;}
    @Override
    public float dotProduct(Vector2 that){return -1;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    @Override
    public boolean equals(Object object){return false;}
    public static boolean equals(Vector4 a, Vector4 b){return false;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Hermite">
    public static Vector4 hermite(){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude">
    public static float magnitude(Vector4 a){return -1;}
    @Override
    public float magnitude(){return -1;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Magnitude Squared">
    public static float magnitudeSquared(Vector4 a){return -1;}
    @Override
    public float magnitudeSquared(){return -1;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Linear Interpolation">
    public static Vector4 lerp(Vector4 a, Vector4 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Max and Min">
    public static Vector4 max(Vector4 a, Vector4 b){return null;}
    
    public static Vector4 min(Vector4 a, Vector4 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Multiply">
    public static Vector4 multiply(Vector4 a, float scalar){return null;}
    public static Vector4 multiply(Vector4 a, int scalar){return null;}
    @Override
    public Vector4 multiply(float scalar){return null;}
    @Override
    public Vector4 multiply(int scalar){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Negate">
    public static Vector4 negate(Vector4 a){return null;}
    @Override
    public Vector4 negate(){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Normalize">
    public static Vector4 normalize(Vector4 a){return null;}
    @Override
    public Vector4 normalize(){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Smooth Step">
    public static Vector4 smoothStep(Vector4 a, Vector4 b){return null;}
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Vectors">
    public static Vector4 one()
    {
        return new Vector4(1.0f);
    }
    
    public static Vector4 unitX()
    {
        return new Vector4(1.0f, 0.0f, 0.0f, 0.0f);
    }
    
    public static Vector4 unitY()
    {
        return new Vector4(0.0f, 1.0f, 0.0f, 0.0f);
    }
    
    public static Vector4 unitZ()
    {
        return new Vector4(0.0f, 0.0f, 1.0f, 0.0f);
    }
    
    public static Vector4 unitW()
    {
        return new Vector4(0.0f, 0.0f, 0.0f, 1.0f);
    }
    
    public static Vector4 zero()
    {
        return new Vector4(0.0f);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Subtract">
    public static Vector4 subtract(Vector4 a, Vector4 b){return null;}
    public static Vector4 subtract(Vector4 a, Vector3 b){return null;}
    public static Vector4 subtract(Vector3 a, Vector4 b){return null;}
    public static Vector4 subtract(Vector4 a, Vector2 b){return null;}
    public static Vector4 subtract(Vector2 a, Vector4 b){return null;}
    public Vector4 subtract(Vector4 that){return null;}
    @Override
    public Vector4 subtract(Vector3 that){return null;}
    @Override
    public Vector4 subtract(Vector2 that){return null;}
    public Vector4 subtract(float x, float y, float z, float w){return null;}
    public Vector4 subtract(int x, int y, int z, int w){return null;}
    public Vector4 subtract(Vector3 vec, float w){return null;}
    public Vector4 subtract(Vector2 vec, float z, float w){return null;}
    
    @Override
    public Vector4 subtractX(float x){return null;}
    @Override
    public Vector4 subtractX(int x){return null;}
    @Override
    public Vector4 subtractY(float y){return null;}
    @Override
    public Vector4 subtractY(int y){return null;}
    @Override
    public Vector4 subtractZ(float z){return null;}
    @Override
    public Vector4 subtractZ(int z){return null;}
    public Vector4 subtractW(float w){return null;}
    public Vector4 subtractW(int w){return null;}
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
    public static Vector4 transform(Vector4 a, Vector4 b){return null;}
    //</editor-fold>
}
