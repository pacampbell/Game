package game.animation.ease;

/**
 * Collection of different functions that perform linear motion easing.
 * Equations are adopted from Robert Penner's Linear.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Linear
{
    public static float easeNone(float time, int begin, int change, float duration)
    {
        return change * time / duration + begin;
    }

    public static float easeIn(float time, int begin, int change, float duration)
    {
        return change * time / duration + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return change * time / duration + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        return change * time / duration + begin;
    }
}
