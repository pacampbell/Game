package game.animation.ease;

/**
 * Collection of different functions that perform quadratic motion easing.
 * Equations are adopted from Robert Penner's Quad.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Quadratic
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return change * (time /= duration) * time + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return -change * (time /= duration) * (time - 2) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if((time /= duration) / 2 < 1)
            return change / 2 * time * time + begin;

        return -change / 2 * ((--time) * (time - 2) - 1) + begin;
    }
}
