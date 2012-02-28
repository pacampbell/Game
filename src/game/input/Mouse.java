package game.input;

import java.awt.Point;
import java.awt.event.MouseEvent;

/**
 * Static wrapper class for the MouseInputObject.
 * @author paul
 */
public final class Mouse 
{
    /**
     * MouseInput object to be used for this static instance of the mouse.
     */
    public static MouseInput mouse = new MouseInput(); 
    
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
     * Checks to see if a button on the mouse is being held.
     * @param key MouseKey object containing the key code of the mouse button that is pressed.
     * @return Returns if the button is being held.
     */
    public static boolean buttonDownOnce(MouseKeys key)
    {
        return Mouse.buttonDownOnce(key.KEYCODE);
    }
    
    /**
     * Checks to see if a button on the mouse is pressed.
     * @param button ID for the button to be evaluated.
     * @return Returns if the button is down.
     */
    public static boolean buttonDown(int button)
    {
        return mouse.buttonDown(button);
    }
    
    /**
     * Checks to see if a button on the mouse is pressed.
     * @param key MouseKey object containing the key code of the mouse button that is pressed.
     * @return Returns if the button is down. 
     */
    public static boolean buttonDown(MouseKeys key)
    {
        return Mouse.buttonDown(key.KEYCODE);
    }
    
    /**
     * Detects if a mouse key was pressed for Swing/AWT components.
     * @param e KeyEvent related to key that was pressed. 
     */
    public static void mousePressed(MouseEvent e)
    {
        mouse.mousePressed(e);
    }
    
    /**
     * Detects if a mouse key was released for Swing/AWT components.
     * @param e KeyEvent related to key that was released. 
     */
    public static void mouseReleased(MouseEvent e)
    {
        mouse.mouseReleased(e);
    }
    
    /**
     * Detects if the mouse has entered a region for Swing/AWT components.
     * @param e KeyEvent related to the mouse entering a region. 
     */
    public static void mouseEntered(MouseEvent e)
    {
        mouse.mouseEntered(e);
    }
    
    /**
     * Detects if the mouse has exited a region for Swing/AWT components.
     * @param e KeyEvent related to the mouse exiting a region. 
     */
    public static void mouseExited(MouseEvent e)
    {
        mouse.mouseExited(e);
    }
    
    /**
     * Detects if the mouse has been dragged for Swing/AWT components.
     * @param e KeyEvent related to the mouse being dragged. 
     */
    public static void mouseDragged(MouseEvent e)
    {
        mouse.mouseDragged(e);
    }
    
    /**
     * Detects if the mouse has been moved for Swing/AWT components.
     * @param e KeyEvent related to the mouse being moved. 
     */
    public static void mouseMoved(MouseEvent e)
    {
        mouse.mouseMoved(e);
    }
}
