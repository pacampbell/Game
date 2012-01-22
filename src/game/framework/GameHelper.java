package game.framework;

import java.net.URL;

public class GameHelper
{
    private static int width = 0;
    private static int height = 0;
    
    /**
     * Uses a hack to return a path to a image file based on the operating system that is being used.
     * @param path Relative path to the file that needs a path.
     * @return Returns a path to the file.
     */
    public static URL osIndependentFilePath(String path)
    {

        String fullPath = "/resources/" + path;
        URL systemIndependentPath = null;

        // Ghetto Solution to a cross compatible file path loader
        try
        {
            throw new Exception();
	}
	catch(Exception e)
        {
            StackTraceElement[] sTrace = e.getStackTrace();
            // sTrace[0] will be always there
            systemIndependentPath = sTrace[0].getClass().getResource(fullPath);
	}
        finally
        {
            return systemIndependentPath;
        }
    }
    
    /**
     * Stores the width of the Game Window.
     * only to be used within the framework itself.
     * @param width Width of the Game Window.
     */
    protected static void setScreenWidth(int width)
    {
        GameHelper.width = width;
    }
    
    /**
     * Stores the height of the Game Window.
     * only to be used within the framework itself.
     * @param width Height of the Game Window.
     */
    protected static void setScreenHeight(int height)
    {
        GameHelper.height = height;
    }
    
    /**
     * @return Returns the width of the game window. 
     */
    public static int WIDTH()
    {
        return GameHelper.width;
    }
    
    /**
     * @return Returns the height of the game window. 
     */
    public static int HEIGHT()
    {
        return GameHelper.height;
    }
}
