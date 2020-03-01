package game.animation.ease;

/**
 * Collection of different functions that perform exponential motion easing.
 * Equations are adopted from Robert Penner's Expo.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Exponential
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return (time == 0) ? begin : change * (float)Math.pow(2, 10 * (time / duration - 1)) + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return (time == duration) ? begin + change : change * (float)(-Math.pow(2, -10 * time / duration) + 1) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if (time == 0)
            return begin;
        if (time == duration)
            return begin + change;
        if ((time /= duration / 2) < 1)
            return change / 2 * (float)Math.pow(2, 10 * (time - 1)) + begin;
        return change / 2 * (float)(-Math.pow(2, -10 * --time) + 2) + begin;
    }
}
