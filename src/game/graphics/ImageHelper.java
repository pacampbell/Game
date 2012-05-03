package game.graphics;

import game.framework.GameHelper;
import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

/**
 * Utility class to assist in loading, and manipulating buffered images.
 * @author paul
 */
public class ImageHelper 
{
    /**
     * Utility to load a BufferedImage.
     * If the utility fails a null BufferedImage is returned.
     * @param path String containing the path to the image.
     * @return Returns a BufferedImage containing the desired image.
     */
    public static BufferedImage load(String path)
    {
        BufferedImage image;
        URL systemIndependentPath = GameHelper.osIndependentFilePath(path);
        try
        {
            // If the URL was unsuccessfully made make a last attempt to create a URL.
            if(systemIndependentPath == null)
                image = ImageIO.read(new URL("file:" + path));
            else
                image = ImageIO.read(systemIndependentPath);
        }
        catch(Exception ex)
        {
            image = null;
            System.out.println("Could not load image: " + path);
        }
        return image;
    }
    
    /**
     * Resizes a BufferedImage.
     * @param tex BufferedImage to be resized.
     * @param width The width of the resized image.
     * @param height The height of the resized image.
     * @return Returns the scaled BufferedImage.
     */
    public static BufferedImage resize(BufferedImage tex, int width, int height)
    {
        int type = tex.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : tex.getType();
        BufferedImage resizedImage = new BufferedImage(width, height, type);
	Graphics2D g = resizedImage.createGraphics();
	g.setComposite(AlphaComposite.Src);
	g.setRenderingHint(RenderingHints.KEY_INTERPOLATION,
	RenderingHints.VALUE_INTERPOLATION_BILINEAR);
	g.setRenderingHint(RenderingHints.KEY_RENDERING,
	RenderingHints.VALUE_RENDER_QUALITY);
	g.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
	RenderingHints.VALUE_ANTIALIAS_ON);
        g.drawImage(tex, 0, 0, width, height, null);
	g.dispose();
        return resizedImage;
    }
}
