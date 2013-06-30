package game.animation.ease;

/**
 * Collection of different functions that perform circular motion easing.
 * Equations are adopted from Robert Penner's Circ.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Circular
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return -change * (float)(Math.sqrt(1 - (time /= duration) * time) - 1) + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return change * (float)Math.sqrt(1 - (time = time / duration - 1) * time) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if ((time /= duration / 2) < 1)
            return -change / 2 * (float)(Math.sqrt(1 - time * time) - 1) + begin;
        return change / 2 * (float)(Math.sqrt(1 - (time -= 2) * time) + 1) + begin;
    }
}
