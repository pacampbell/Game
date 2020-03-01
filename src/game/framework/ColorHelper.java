package game.framework;

import java.awt.*;

/**
 * Helper class for dealing with Java Color objects.
 * @author paul
 */
public class ColorHelper
{
    /**
     * Completely transparent color with the r,g,b,a values (0,0,0,0).
     */
    public static final Color transparent = new Color(0, 0, 0, 0);

    /**
     * Linear interpolation <br />
     * value1 + (value2 - value1) * amount
     * @param start A Color we want to interpolate with.
     * @param end A Color we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the linear interpolation between two Colors.
     */
    public static Color lerp(Color start, Color end, float amount)
    {
        Color color = null;
        if(amount >= 1)
            color = end;
        else
        {
            int r = (int)MathHelper.lerp((float)start.getRed(), (float)end.getRed(), amount);
            int g = (int)MathHelper.lerp((float)start.getGreen(), (float)end.getGreen(), amount);
            int b = (int)MathHelper.lerp((float)start.getBlue(), (float)end.getBlue(), amount);
            int a = (int)MathHelper.lerp((float)start.getAlpha(), (float)end.getAlpha(), amount);
            color = new Color(r, g, b, a);
        }
        return color;
    }

    /**
     * Performs a Smooth Step interpolation between two colors.
     * @param start A Color we want to interpolate with.
     * @param end A Color we want to interpolate with.
     * @param amount A value between 0 and 1 indicating the weight of value2.
     * @return Returns the smoothstep between two Colors.
     */
    public static Color smoothStep(Color start, Color end, float amount)
    {
        Color color = null;
        if(amount >= 1)
            color = end;
        else
        {
            int r = (int)MathHelper.smoothStep((float)start.getRed(), (float)end.getRed(), amount);
            int g = (int)MathHelper.smoothStep((float)start.getGreen(), (float)end.getGreen(), amount);
            int b = (int)MathHelper.smoothStep((float)start.getBlue(), (float)end.getBlue(), amount);
            int a = (int)MathHelper.smoothStep((float)start.getAlpha(), (float)end.getAlpha(), amount);
            color = new Color(r, g, b, a);
        }
        return color;
    }

    /**
     * Generates a random color that is opaque.
     * @return Returns a randomly generated color.
     */
    public static Color randomColor()
    {
        return new Color
        (
            MathHelper.random(255),
            MathHelper.random(255),
            MathHelper.random(255)
        );
    }

    /**
     * Creates a transparent color with the r, g, b values set to the provided
     * color values.
     * @param color Color to set to transparent.
     * @return Returns a Color with the same r,g,b that was provided with the
     * alpha value set to 0.
     */
    public static Color createTransparentColor(Color color)
    {
        return new Color
        (
            color.getRed(),
            color.getGreen(),
            color.getBlue(),
            0
        );
    }
}
