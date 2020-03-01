package game.animation.ease;

/**
 * Collection of different functions that perform quartic motion easing.
 * Equations are adopted from Robert Penner's Quart.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Quartic
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return change * (time /= duration) * time * time * time + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return -change * ((time = time / duration - 1) * time * time * time - 1) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if((time /= duration / 2) < 1)
            return change / 2 * time * time * time * time + begin;

        return -change / 2 * ((time -= 2) * time * time * time - 2) + begin;
    }
}
