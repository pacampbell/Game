package game.animation.ease;

/**
 * Collection of different functions that perform back motion easing.
 * Equations are adopted from Robert Penner's Back.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Back
{
    public static float easeIn(float time, int begin, int change, float duration, Float overshoot)
    {
        if (overshoot == null)
            overshoot = 1.70158f;
        return change * (time /= duration) * time * ((overshoot + 1) * time - overshoot) + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration, Float overshoot)
    {
        if (overshoot == null)
            overshoot = 1.70158f;
        return change * ((time = time / duration - 1) * time * ((overshoot + 1) * time + overshoot) + 1) + begin;
    }

    public static float easeInOut(float time, int begin, int change, float duration, Float overshoot)
    {
        if (overshoot == null)
            overshoot = 1.70158f;
        if ((time /= duration  / 2) < 1)
            return change / 2 * (time * time *(((overshoot *= (1.525f)) + 1) * time - overshoot)) + begin;
        return change / 2 * ((time -= 2) * time * (((overshoot *= (1.525f)) + 1) * time + overshoot) + 2) + begin;
    }
}
