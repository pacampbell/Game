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
    
    /**
     * Complete Constructor
     * Sets x, y, z, and w components of Vector4
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
}
