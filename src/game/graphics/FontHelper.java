package game.graphics;

import java.awt.Font;
import java.io.InputStream;

public class FontHelper 
{
    /**
     * Class to help loading custom fonts.
     * @param path Path to custom font.
     * @param size Size of the font to be loaded.
     * @return Returns a font object containing the custom font.
     */
    public static Font loadFont(String path, float size)
    {
        Font font = null;
        String fName = "/resources/" + path;
        try
        {
            InputStream is = FontHelper.class.getResourceAsStream(fName);
            font = Font.createFont(Font.TRUETYPE_FONT, is).deriveFont(size);
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
            System.err.println(fName + " not loaded. Using serif font.");
            font = new Font("serif", Font.PLAIN, 24);
        }
        return font;
    }
}
