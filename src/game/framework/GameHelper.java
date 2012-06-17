package game.framework;

import java.awt.Cursor;
import java.awt.Graphics2D;
import java.net.URL;
import javax.swing.JFrame;

public class GameHelper
{
    /**
     * Static variable representing the width of the Game screen.
     */
    private static int width = 0;
    
    /**
     * Static variable representing the height of the Game screen.
     */
    private static int height = 0;
    
    /**
     * Static Variable containing the JFrame of the Game.
     */
    private static JFrame window;
    
    /**
     * Uses a hack to return a path to a image file based on the operating system that is being used.
     * @param path Relative path to the file that needs a path.
     * @return Returns a path to the file.
     */
    public static URL osIndependentFilePath(String path)
    {
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
            systemIndependentPath = sTrace[0].getClass().getResource(path);
	}
        finally
        {
            return systemIndependentPath;
        }
    }
    
    /**
     * Stores the Cursor related to the JFrame of the program.
     * @param cursor The JFrames Cursor object.
     */
    public static void setCursor(Cursor cursor)
    {
        // Check to make sure that the window was set
        if(window != null)
            GameHelper.window.setCursor(cursor);
    }
    
    /**
     * Gets the cursor of the current JFrame.
     * @return Returns the Cursor associated with the current Game JFrame.
     */
    public static Cursor getCursor()
    {
        Cursor cursor = Cursor.getDefaultCursor();
        if(window != null)
            cursor = GameHelper.window.getCursor();
        return cursor;
    }
    
    /**
     * Sets the title of the Games JFrame
     * @param title String representing the desired title of the JFrame.
     */
    public static void setTitle(String title)
    {
        if(window != null)
            GameHelper.window.setTitle(title);
    }
    
    /**
     * Gets the title of the JFrame.
     * @return Returns the title of the Game JFrame.
     */
    public static String getTitle()
    {
        String title = "null";
        if(window != null)
            title = GameHelper.window.getTitle();
        return title;
    }
    
    /**
     * Sets the Main JFrame of project. 
     * @param frame The main JFrame 
     */
    protected static void setWindow(JFrame frame)
    {
        GameHelper.window = frame;
    }
    
    /**
     * Stores the width of the Game Window.
     * Only to be used within the framework itself.
     * @param width Width of the Game Window.
     */
    protected static void setScreenWidth(int width)
    {
        GameHelper.width = width;
    }
    
    /**
     * Stores the height of the Game Window.
     * Only to be used within the framework itself.
     * @param width Height of the Game Window.
     */
    protected static void setScreenHeight(int height)
    {
        GameHelper.height = height;
    }
    
    /**
     * Gets the width of the game window in pixels.
     * @return Returns the width of the game window. 
     */
    public static int WIDTH()
    {
        return GameHelper.width;
    }
    
    /**
     * Gets the height of the game window in pixels.
     * @return Returns the height of the game window. 
     */
    public static int HEIGHT()
    {
        return GameHelper.height;
    }
}
