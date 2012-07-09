package game.framework;

import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.image.VolatileImage;
import java.io.InputStream;

public class FontHelper 
{
    /**
     * Graphics2D context for measuring font.
     */
    private static Graphics2D g;
    
    /**
     * Class to help loading custom fonts.
     * @param path Path to custom font.
     * @param size Size of the font to be loaded.
     * @return Returns a font object containing the custom font.
     */
    public static Font loadFont(String path, float size)
    {
        Font font;
        try(InputStream is = FontHelper.class.getResourceAsStream(path))
        {
            //InputStream ;
            font = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(size);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.err.println(path + " not loaded. Using serif font.");
            font = new Font("serif", Font.PLAIN, 24);
        }
        return font;
    }
    
    /**
     * Initializes and creates the Graphics2D context.
     */
    protected static void initialize()
    {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();
        VolatileImage vi = gc.createCompatibleVolatileImage(1, 1); // 1x1 px Windows fix
        g = vi.createGraphics();
    }
    
    /**
     * Gets the bounds of a String.
     * @param text String to find the bounds of.
     * @param font Font object containing the desired font.
     * @return Returns a Rectangle2D containing the size of the provided String.
     */
    public static Rectangle2D getBounds(String text, Font font)
    {
        return g.getFontMetrics(font).getStringBounds(text, g).getBounds2D();
    }
    
    /**
     * Computes the width in pixels of a String.
     * @param text String to find the width of.
     * @param font Font object containing the desired font.
     * @return Returns the width of the provided String.
     */
    public static int getStringWidth(String text, Font font)
    {
        return (int)g.getFontMetrics(font).getStringBounds(text, g).getBounds2D().getWidth();
    }
    
    /**
     * Computes the height in pixels of a String.
     * @param text String to find the height of.
     * @param font Font object containing the desired font.
     * @return Returns the height of the provided String.
     */
    public static int getStringHeight(String text, Font font)
    {
        return (int)g.getFontMetrics(font).getStringBounds(text, g).getBounds2D().getHeight();
    }
    
    /**
     * Computes the height in pixels of a Font.
     * @param font Font object containing the desired font.
     * @return Returns the general height of the provided Font.
     */
    public static int getStringHeight(Font font)
    {
        return FontHelper.getStringHeight("L", font);
    }
    
    /**
     * Computes the ascent in pixels of a Font.
     * @param font Font object containing the desired font.
     * @return Returns the ascent.
     */
    public static int getAscent(Font font)
    {
        return (int)g.getFontMetrics(font).getAscent();
    }
    
    /**
     * Computes the descent in pixels of a Font.
     * @param font Font object containing the desired font.
     * @return Returns the descent.
     */
    public static int getDescent(Font font)
    {
        return (int)g.getFontMetrics(font).getDescent();
    }
}
