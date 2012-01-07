package game.graphics;

import java.awt.image.BufferedImage;
import java.net.URL;
import javax.imageio.ImageIO;

public class Texture2D
{
    private BufferedImage bufferedImage;
    private final String contentLocation;
    
    public Texture2D(String path)
    {
        this.contentLocation = "/resources/" + path;
        this.loadImage(contentLocation);
    }
    
    public Texture2D(BufferedImage bufferedImage)
    {
        this.bufferedImage = bufferedImage;
        this.contentLocation = null;
    }
    
    private boolean loadImage(String path)
    {
        boolean loaded = false;
        URL systemIndependentPath = getClass().getResource(path);
        try
        {
            this.bufferedImage = ImageIO.read(systemIndependentPath);
            loaded = true;
        }
        catch(Exception ex)
        {
            this.bufferedImage = null;
            System.out.println("Could not load image: " + path);
        }
        return loaded;
    }
    
    public BufferedImage getImage()
    {
        return this.bufferedImage;
    }
}
