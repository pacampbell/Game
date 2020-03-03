package game.graphics;

import game.framework.GameHelper;

import javax.imageio.ImageIO;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.net.URL;

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
        AffineTransform transform = AffineTransform.getScaleInstance((double) tex.getWidth() / width, (double) tex.getHeight() / height);
        AffineTransformOp transformOp = new AffineTransformOp(transform, AffineTransformOp.TYPE_BILINEAR);
        BufferedImage dst = new BufferedImage(width, height, tex.getType() == 0 ? BufferedImage.TYPE_INT_ARGB : tex.getType());

        return transformOp.filter(tex, dst);
    }
}
