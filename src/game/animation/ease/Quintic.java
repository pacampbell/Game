package game.animation.ease;

/**
 * Collection of different functions that perform quintic motion easing.
 * Equations are adopted from Robert Penner's Quint.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Quintic
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return change * (time /= duration) * time * time * time * time + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        return change * ((time = time / duration - 1) * time * time * time * time + 1) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if ((time /= duration / 2) < 1)
            return change / 2 * time * time * time * time * time + begin;

        return change / 2 * ((time-=2) * time * time * time * time + 2) + begin;
    }
}
