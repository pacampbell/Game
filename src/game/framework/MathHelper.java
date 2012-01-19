package game.framework;

public class MathHelper
{
    /**
     * Clamps a float value between a min and a max value.
     * If the value is below min, value is set to min.
     * If the value is above max, value is set to max.
     * If the value is min < value < max then we leave it alone.
     * @param value
     * @param min
     * @param max
     * @return Returns the clampped value.
     */
    public static float clamp(float value, float min, float max)
    {
        float retVal = value;
        if(value < min)
            retVal = min;
        if(value > max)
            retVal = max;
        return retVal;
    }

    /**
     * Clamps a integer value between a min and a max value.
     * If the value is below min, value is set to min.
     * If the value is above max, value is set to max.
     * If the value is min < value < max then we leave it alone.
     * @param value
     * @param min
     * @param max
     * @return Returns the clamped value.
     */
    public static int clamp(int value, int min, int max)
    {
        int retVal = value;
        if(value < min)
            retVal = min;
        if(value > max)
            retVal = max;
        return retVal;
    }
    
    /**
     * Linear interpolation
     * value1 + (value2 - value1) * amount
     * @param value1 A float value we want to interpolate with.
     * @param value2 A float value we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector2.
     */
    public static float lerp(float value1, float value2, float amount)
    {
        return value1 + (value2 - value1) * amount;
    }
    
    /**
     * Performs a Smooth Step interpolation between two points.
     * @param a A float value.
     * @param b A float value.
     * @param amount A float value between zero and one.
     * @return Returns the interpolation between two values.
     */
    public static float smoothStep(float a, float b, float amount)
    {
        // smoothStep(t) = 3t2 − 2t3
        amount = (amount * amount) * (3 - (2 * amount));
        // (A * v) + (B * (1 - v));
        return (a * (1 - amount)) + (b * amount);
    }
    
    /**
     * Check to see if a float value is smaller than the min value.
     * If it is below min, value is set to min.
     * @param value
     * @param min
     * @return Returns the evaluated value.
     */
    public static float min(float value, float min)
    {
        return (value < min) ? min : value;
    }
    
    
    /**
     * Check to see if a integer value is smaller than the min value.
     * If it is below min, value is set to min.
     * @param value
     * @param min
     * @return Returns the evaluated value.
     */
    public static int min(int value, int min)
    {
        return (value < min) ? min : value;
    }
    
    
    /**
     * Check to see if a float value is larger than the max value.
     * If it is above max, value is set to max.
     * @param value
     * @param max
     * @return Returns the evaluated value.
     */
    public static float max(float value, float max)
    {
        return (value > max) ? max : value;
    }
    
    /**
     * Check to see if a integer value is larger than the max value.
     * If it is above max, value is set to max.
     * @param value
     * @param max
     * @return Returns the evaluated value.
     */
    public static int max(int value, int max)
    {
        return (value > max) ? max : value;
    }
    /**
     * Do the dot product of two arrays
     * @param a the first array
     * @param b the second array
     * @return the value of the dot product
     */
    public static int dotProduct(int[] a, int[] b){
        int answer = 0;
        
        if(a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                answer += (a[i] * b[i]);
            }            
        }else throw new IllegalArgumentException("can't use dotProduct with different sized vectors."
                + "The two lengths were " + a.length + " and " + b.length);
        return answer;
    }
    
    /**
     * Do the dot product of two arrays
     * @param a the first array
     * @param b the second array
     * @return the value of the dot product
     */
    public static float dotProduct(float[] a, float[] b){
        float answer = 0;
        
        if(a.length == b.length){
            for (int i = 0; i < a.length; i++) {
                answer += (a[i] * b[i]);
            }            
        }else throw new IllegalArgumentException("can't use dotProduct with different sized vectors."
                + "The two lengths were " + a.length + " and " + b.length);
        return answer;
    }
}
