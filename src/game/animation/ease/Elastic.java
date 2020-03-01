package game.animation.ease;

/**
 * Collection of different functions that perform elastic motion easing.
 * Equations are adopted from Robert Penner's Elastic.as file provided at
 * http://www.robertpenner.com/easing/.
 * @author paul
 */
public class Elastic
{
    // TODO: Amplitude and period are supposed to be optional; Add Overload for default values
    public static float easeIn(float time, int begin, int change, float duration,
            Float amplitude, Float period)
    {
        float s;
        if (time == 0)
            return begin;
        if ((time /= duration) == 1)
            return begin + change;
        if (period == null)
            period = duration * 0.3f;
        if (amplitude == null || amplitude < Math.abs(change))
        {
            amplitude = (float)change;
            s = period / 4;
        }
        else
            s = period / (float)(2*Math.PI) * (float)Math.asin (change / amplitude);

        return -(amplitude * (float)Math.pow(2, 10 * (time -= 1)) * (float)Math.sin((time * duration - s) * (float)(2 * Math.PI) / period)) + begin;
    }

    public static float easeOut(float time, int begin, int change, float duration,
            Float amplitude, Float period)
    {
        float s;
        if (time == 0)
            return begin;
        if ((time /= duration) == 1)
            return begin + change;
        if (period == null)
            period = duration * 0.3f;
        if (amplitude == null || amplitude < Math.abs(change))
        {
            amplitude = (float)change;
            s = period / 4;
        }
        else
            s = period / (float)(2 * Math.PI) * (float)Math.asin(change / amplitude);

        return (amplitude * (float)Math.pow(2,-10 * time) * (float)Math.sin((time * duration - s) * (2 * Math.PI) / period) + change + begin);
    }

    public static float easeInOut(float time, int begin, int change, float duration,
            Float amplitude, Float period)
    {
        float s;
        if (time == 0)
            return begin;
        if ((time /= duration / 2) == 2)
            return begin + change;
        if (period == null)
            period = duration * (float)(.3 * 1.5);
        if (amplitude == null || amplitude < Math.abs(change))
        {
            amplitude = (float)change;
            s = period / 4;
        }
        else
            s = period / (float)(2 * Math.PI) * (float)Math.asin(change / amplitude);
        if (time < 1)
            return -.5f * (amplitude * (float)Math.pow(2,10 * (time -= 1)) * (float)Math.sin((time * duration - s) * (2 * (float)Math.PI) / period)) + begin;

        return amplitude * (float)Math.pow(2,-10 * (time -= 1)) * (float)Math.sin((time * duration  - s) * (2 * Math.PI) / period) * 0.5f + change + begin;
    }
}
