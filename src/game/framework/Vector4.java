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
     * Also referred to as k component in vectorial notation. 
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
            
}
