package game.animation.ease;

/**
 * Collection of different functions that perform bounce motion easing.
 * Equations are adopted from Robert Penner's Bounce.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Bounce
{
    public static float easeIn(float time, int begin, int change, float duration)
    {
        return change - Bounce.easeOut (duration - time, 0, change, duration) + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration)
    {
        if ((time /= duration) < (1/2.75))
        {
            return change * (7.5625f * time * time) + begin;
        }
        else if (time < (2/2.75))
        {
            return change * (7.5625f * (time -= (1.5/2.75)) * time + 0.75f) + begin;
        }
        else if (time < (2.5/2.75))
        {
            return change * (7.5625f * (time -= (2.25/2.75)) * time + 0.9375f) + begin;
        }
        else
        {
            return change * (7.5625f * (time -= (2.625/2.75)) * time + 0.984375f) + begin;
        }
    }

    public static float easeInOut(float time, int begin, int change, float duration)
    {
        if (time < duration / 2)
            return Bounce.easeIn (time * 2, 0, change, duration) * 0.5f + begin;
        else
            return Bounce.easeOut (time * 2 - duration, 0, change, duration) * 0.5f + change * 0.5f + begin;
    }
}
