package game.animation.ease;

/**
 * Collection of different functions that perform sinusoidal motion easing.
 * Equations are adopted from Robert Penner's Sine.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Sinusoidal
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return -change * (float)Math.cos(time / duration * (Math.PI / 2)) + change + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return change * (float)Math.sin(time / duration * (Math.PI/2)) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        return -change / 2 * (float)(Math.cos(Math.PI*time / duration) - 1) + begin;
    }
}
