package game.framework;

/**
 * Not finished
 * @author mike
 */

public class Vector4_Old 
{

    private float x;
    private float y;
    private float z;
    private float w;

    public Vector4_Old(float value) {
        this.x = value;
        this.y = value;
        this.z = value;
        this.w = value;
    }

    public Vector4_Old(float x, float y, float z, float w) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.w = w;
    }

    /*
    public Vector4(Vector2 value, float z, float w)
    {
            this.x = value.getX();
            this.y = value.getY();
            this.z = z;
            this.w = w;
    }

    public Vector4(Vector3 value, float w)
    {
            this.x = value.getX();
            this.y = value.getY();
            this.z = value.getZ();
            this.w = w;
    }
     * 
     */
    
    public float getX() 
    {
        return this.x;
    }

    public float getY() 
    {
        return this.y;
    }

    public float getZ() {
        return this.z;
    }

    public float getW() {
        return this.w;
    }

    public void setX(float value) {
        this.x = value;
    }

    public void setY(float value) {
        this.y = value;
    }

    public void setZ(float value) {
        this.z = value;
    }

    public void setW(float value) {
        this.w = value;
    }

    public static Vector4_Old one() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public static Vector4_Old unitW() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public static Vector4_Old unitX() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public static Vector4_Old unitY() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public static Vector4_Old unitZ() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public static Vector4_Old zero() {
        Vector4_Old value = new Vector4_Old((float) 1, (float) 1, (float) 1, (float) 1);
        return value;
    }

    public void add(Vector4_Old that) {
        this.x += that.getX();
        this.y += that.getY();
        this.z += that.getZ();
        this.w += that.getW();
    }

    public Vector4_Old add(Vector4_Old a, Vector4_Old b) {
        float x, y, z, w;
        x = a.getX() + b.getX();
        y = a.getY() + b.getY();
        z = a.getZ() + b.getZ();
        w = a.getW() + b.getW();
        Vector4_Old value = new Vector4_Old(x, y, z, w);
        return value;
    }

    public void subtract(Vector4_Old that) {
        this.x -= that.getX();
        this.y -= that.getY();
        this.z -= that.getZ();
        this.w -= that.getW();
    }

    public Vector4_Old subtract(Vector4_Old a, Vector4_Old b) {
        float x, y, z, w;
        x = a.getX() - b.getX();
        y = a.getY() - b.getY();
        z = a.getZ() - b.getZ();
        w = a.getW() - b.getW();
        Vector4_Old value = new Vector4_Old(x, y, z, w);
        return value;
    }

    public static Vector4_Old clamp(Vector4_Old value, Vector4_Old min, Vector4_Old max){
	if(value.getX() < min.getX()) value.setX(min.getX());
	if(value.getX() > max.getX()) value.setX(max.getX());
	
	if(value.getY() < min.getY()) value.setY(min.getY());
	if(value.getY() > max.getY()) value.setY(max.getY());
	
	if(value.getZ() < min.getZ()) value.setZ(min.getZ());
	if(value.getZ() > max.getZ()) value.setZ(max.getZ());
	
	if(value.getW() < min.getW()) value.setW(min.getW());
	if(value.getW() > max.getW()) value.setW(max.getW());
	
	return value;
    }

    public static float dot(Vector4_Old value1, Vector4_Old value2) {
        return (value1.getX() * value2.getX()) + (value1.getY() * value2.getY()) + (value1.getZ() * value2.getZ()) + (value1.getW() * value2.getW());
    }

    public Boolean equals(Vector4_Old that) 
    {
        return (this.x == that.getX()) && (this.y == that.getY()) && (this.z == that.getZ()) && (this.w == that.getW());
    }

    public static Vector4_Old max(Vector4_Old value1, Vector4_Old value2)
    {
        float x1 = value1.getX();
        float y1 = value1.getY();
        float z1 = value1.getZ();
        float w1 = value1.getW();
    
        float x2 = value2.getX();
        float y2 = value2.getY();
        float z2 = value2.getZ();
        float w2 = value2.getW();
    
        float x,y,z,w;
    
        if(x1 > x2)x = x1;
        else x = x2;
    
        if(y1 > y2)y = y1;
        else y = y2;
    
        if(z1 > z2)z = z1;
        else z = z2;
    
        if(w1 > w2)w = w1;
        else w = w2;
    
        Vector4_Old max = new Vector4_Old(x,y,z,w);
        return max;
    }

    public static Vector4_Old min(Vector4_Old value1, Vector4_Old value2)
    {
        float x1 = value1.getX();
        float y1 = value1.getY();
        float z1 = value1.getZ();
        float w1 = value1.getW();
    
        float x2 = value2.getX();
        float y2 = value2.getY();
        float z2 = value2.getZ();
        float w2 = value2.getW();
    
        float x,y,z,w;
    
        if(x1 < x2)x = x1;
        else x = x2;
    
        if(y1 < y2)y = y1;
        else y = y2;
    
        if(z1 < z2)z = z1;
        else z = z2;
    
        if(w1 < w2)w = w1;
        else w = w2;
    
        Vector4_Old min = new Vector4_Old(x,y,z,w);
        return min;
    }

    public static Vector4_Old multiply(Vector4_Old value, float scalar) 
    {
        float x, y, z, w;
        x = value.getX() * scalar;
        y = value.getY() * scalar;
        z = value.getZ() * scalar;
        w = value.getW() * scalar;
        Vector4_Old scaled = new Vector4_Old(x, y, z, w);
        return scaled;
    }

    public void multiply(Vector4_Old that) 
    {
        this.x *= that.getX();
        this.y *= that.getY();
        this.z *= that.getZ();
        this.w *= that.getW();
    }

    @Override
    public String toString()
    {
        return "(" + x + "," + y + "," + z + "," + w + ")";
    }
}