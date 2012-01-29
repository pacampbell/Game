package game.graphics;

import java.awt.Font;
import java.io.InputStream;

public class FontHelper 
{
    /**
     * Class to help loading custom fonts.
     * @param path Path to custom font.
     * @return Returns a font object containing the custom font.
     */
    public static Font loadFont(String path)
    {
        Font font = null;
        String fName = "/resources/" + path;
        try
        {
            InputStream is = FontHelper.class.getResourceAsStream(fName);
            font = Font.createFont(Font.TRUETYPE_FONT, is);
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
