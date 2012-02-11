package game.input;

import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * Static wrapper class for the MouseInputObject.
 * @author paul
 */
public class Mouse 
{
    private static MouseInput mouse = new MouseInput(); 
    
    /**
     * Polls the mouse for new buttons that might be pressed this update.
     */
    public static void poll()
    {
        mouse.poll();
    }
    
    /**
     * @return Returns a Point object containing the x, and y coordinates of the mouse. 
     */
    public static Point getPosition()
    {
        return mouse.getPosition();
    }
    
    /**
     * Checks to see if a button on the mouse is being held.
     * @param button ID for the button to be evaluated.
     * @return Returns if the button is being held.
     */
    public static boolean buttonDownOnce(int button)
    {
        return mouse.buttonDownOnce(button);
    }
    
    /**
     * Checks to see if a button on the mouse is pressed.
     * @param button ID for the button to be evaluated.
     * @return Returns if the button was pressed.
     */
    public static boolean buttonDown(int button)
    {
        return mouse.buttonDown(button);
    }
    
    public static void mousePressed(MouseEvent e)
    {
        mouse.mousePressed(e);
    }
    
    public static void mouseReleased(MouseEvent e)
    {
        mouse.mouseReleased(e);
    }
    
    public static void mouseEntered(MouseEvent e)
    {
        mouse.mouseEntered(e);
    }
    
    public static void mouseExited(MouseEvent e)
    {
        mouse.mouseExited(e);
    }
    
    public static void mouseDragged(MouseEvent e)
    {
        mouse.mouseDragged(e);
    }
    
    public static void mouseMoved(MouseEvent e)
    {
        mouse.mouseMoved(e);
    }
}
