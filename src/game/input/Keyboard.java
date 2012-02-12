package game.input;

import java.awt.event.KeyEvent;

/**
 * Static wrapper class for the KeyboardInput object.
 * @author paul
 */
public class Keyboard 
{
    /**
     * Static instance of the keyboard to be used.
     */
    public static KeyboardInput keyboard = new KeyboardInput();
    
    /**
     * Polls the keyboard for new keys that might be pressed this update.
     */
    public void poll()
    {
        keyboard.poll();
    }
    
    /**
     * Checks to see if a key is being held down.
     * @param keyCode ID for the key to be evaluated.
     * @return Returns if the key is being held.
     */
    public static boolean keyDown(int keyCode)
    {
        return keyboard.keyDown(keyCode);
    }
    
    /**
     * Checks to see if a key was pressed.
     * @param keyCode ID for the key to be evaluated.
     * @return Return is the key was pressed. 
     */
    public static boolean keyDownOnce(int keyCode)
    {
        return keyboard.keyDownOnce(keyCode);
    }
    
    public static void keyPressed(KeyEvent e)
    {
        keyboard.keyPressed(e);
    }
    
    public static void keyReleased(KeyEvent e)
    {
        keyboard.keyReleased(e);
    }
}
