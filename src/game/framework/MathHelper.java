package game.framework;

public class MathHelper
{
    /**
     * Clamps a float value between a min and a max value. <br />
     * If the value is below min, value is set to min. <br />
     * If the value is above max, value is set to max. <br />
     * If the value is min < value < max then we leave it alone. <br />
     * @param value Value to be clamped.
     * @param min Minimum value the value can be.
     * @param max Maximum value the value can be.
     * @return Returns the clamped value.
     */
    public static float clamp(float value, float min, float max)
    {
        return (value > max) ? max : (value < min) ? min : value;
    }

    /**
     * Clamps a integer value between a min and a max value.<br />
     * If the value is below min, value is set to min. <br />
     * If the value is above max, value is set to max. <br />
     * If the value is min < value < max then we leave it alone.
     * @param value Value to be clamped.
     * @param min Minimum value the value can be.
     * @param max Maximum value the value can be.
     * @return Returns the clamped value.
     */
    public static int clamp(int value, int min, int max)
    {
        return (value > max) ? max : (value < min) ? min : value;
    }
    
    /**
     * Linear interpolation <br />
     * value1 + (value2 - value1) * amount
     * @param start A float value we want to interpolate with.
     * @param end A float value we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Vector2.
     */
    public static float lerp(float start, float end, float amount)
    {
        float v = start + (end - start) * amount; 
        return amount >= 1 ? end : v;
    }
    
    /**
     * Performs a Smooth Step interpolation between two points.
     * @param start A float value.
     * @param end A float value.
     * @param amount A float value between zero and one.
     * @return Returns the interpolation between two values.
     */
    public static float smoothStep(float start, float end, float amount)
    {
        // smoothStep(t) = 3t2 − 2t3
        amount = (amount * amount) * (3 - (2 * amount));
        // (A * v) + (B * (1 - v));
        float v = (start * (1 - amount)) + (end * amount); 
        return amount >= 1 ? end : v;
    }
    
    /**
     * Check to see if a float value is smaller than the min value.
     * If it is below min, value is set to min.
     * @param value Value to check.
     * @param min Minimum value the value can be.
     * @return Returns the evaluated value.
     */
    public static float min(float value, float min)
    {
        return (value < min) ? min : value;
    }
    
    
    /**
     * Check to see if a integer value is smaller than the min value.
     * If it is below min, value is set to min.
     * @param value Value to check.
     * @param min Minimum value the value can be.
     * @return Returns the evaluated value.
     */
    public static int min(int value, int min)
    {
        return (value < min) ? min : value;
    }
    
    
    /**
     * Check to see if a float value is larger than the max value.
     * If it is above max, value is set to max.
     * @param value Value to check.
     * @param max Maximum value the value can be.
     * @return Returns the evaluated value.
     */
    public static float max(float value, float max)
    {
        return (value > max) ? max : value;
    }
    
    /**
     * Check to see if a integer value is larger than the max value.
     * If it is above max, value is set to max.
     * @param value Value to check.
     * @param max Maximum value the value can be.
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
