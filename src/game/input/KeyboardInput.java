package game.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Code originally from Gamedev
 * http://www.gamedev.net/page/resources/_/reference/programming/languages/java/java-games-keyboard-and-mouse-r2439
 * @author paul
 */

public class KeyboardInput implements KeyListener
{
    private static final int KEY_COUNT = 256;

    private enum KeyState
    {
        RELEASED, // Not down
        PRESSED,  // Down, but not the first time
        ONCE      // Down for the first time
    }

    // Current state of the keyboard
    private boolean[] currentKeys = null;

    // Polled keyboard state
    private KeyState[] keys = null;

    public KeyboardInput()
    {
        currentKeys = new boolean[ KEY_COUNT ];
        keys = new KeyState[ KEY_COUNT ];
        for(int i = 0; i < KEY_COUNT; ++i)
        {
            keys[i] = KeyState.RELEASED;
        }
    }

    /**
     * Polls the keyboard for new keys that might be pressed this update.
     */
    public synchronized void poll()
    {
        for(int i = 0; i < KEY_COUNT; ++i)
        {
            // Set the key state
            if(currentKeys[i])
            {
                // If the key is down now, but was not
                // down last frame, set it to ONCE,
                // otherwise, set it to PRESSED
                if(keys[i] == KeyState.RELEASED)
                    keys[i] = KeyState.ONCE;
                else
                    keys[i] = KeyState.PRESSED;
            }
            else
            {
                keys[i] = KeyState.RELEASED;
            }
        }
    }

    /**
     * Checks to see if a key is being held down.
     * @param keyCode ID for the key to be evaluated.
     * @return Returns if the key is being held.
     */
    public boolean keyDown(int keyCode)
    {
        return keys[keyCode] == KeyState.ONCE ||
               keys[keyCode] == KeyState.PRESSED;
    }

    /**
     * Checks to see if a key was pressed.
     * @param keyCode ID for the key to be evaluated.
     * @return Return is the key was pressed. 
     */
    public boolean keyDownOnce(int keyCode)
    {
        return keys[keyCode] == KeyState.ONCE;
    }

    /**
     * Detects if a key was pressed for Swing/AWT components.
     * @param e KeyEvent related to key that was pressed. 
     */
    public synchronized void keyPressed(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(keyCode >= 0 && keyCode < KEY_COUNT)
        {
            currentKeys[keyCode] = true;
        }
    }

    /**
     * Detects if a key was released for Swing/AWT components.
     * @param e KeyEvent related to key that was released.
     */
    public synchronized void keyReleased(KeyEvent e)
    {
        int keyCode = e.getKeyCode();
        if(keyCode >= 0 && keyCode < KEY_COUNT)
        {
            currentKeys[keyCode] = false;
        }
    }

    /**
     * Void method. Not Implemented.
     */
    public void keyTyped(KeyEvent e)
    {
        // NOP
        //throw new UnsupportedOperationException("Not yet implemented.");
    }
}
