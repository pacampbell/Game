package game.input;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

/**
 * Code originally from gamedev
 * http://www.gamedev.net/page/resources/_/reference/programming/languages/java/java-games-keyboard-and-mouse-r2439
 *
 * @author paul
 */
public class MouseInput implements MouseListener, MouseMotionListener {

    private static final int BUTTON_COUNT = 3;
    // Polled position of the mouse cursor
    private Point mousePos = null;
    // Current position of the mouse cursor
    private Point currentPos = null;
    // Current state of mouse buttons
    private boolean[] state = null;
    // Polled mouse buttons
    private MouseState[] poll = null;

    private enum MouseState 
    {

        RELEASED, // Not down
        PRESSED, // Down, but not the first time
        ONCE      // Down for the first time
    }

    public MouseInput() 
    {
        // Create default mouse positions
        mousePos = new Point(0, 0);
        currentPos = new Point(0, 0);
        // Setup initial button states
        state = new boolean[BUTTON_COUNT];
        poll = new MouseState[BUTTON_COUNT];
        for (int i = 0; i < BUTTON_COUNT; ++i) {
            poll[ i] = MouseState.RELEASED;
        }
    }

    /**
     * Polls the mouse for new buttons that might be pressed this update.
     */
    public void poll() 
    {
        // Save the current location
        mousePos = new Point(currentPos);
        // Check each mouse button
        for (int i = 0; i < BUTTON_COUNT; ++i) {
            // If the button is down for the first
            // time, it is ONCE, otherwise it is
            // PRESSED.  
            if (state[ i]) {
                if (poll[ i] == MouseState.RELEASED) {
                    poll[ i] = MouseState.ONCE;
                } else {
                    poll[ i] = MouseState.PRESSED;
                }
            } else {
                // button is not down
                poll[ i] = MouseState.RELEASED;
            }
        }
    }

    /**
     * @return Returns a Point object containing the x, and y coordinates of the mouse. 
     */
    public Point getPosition() 
    {
        return mousePos;
    }

    /**
     * Checks to see if a button on the mouse is being held.
     * @param button ID for the button to be evaluated.
     * @return Returns if the button is being held.
     */
    public boolean buttonDownOnce(int button) 
    {
        return poll[ button - 1] == MouseState.ONCE;
    }

    /**
     * Checks to see if a button on the mouse is being held.
     * @param key MouseKey object containing the key code of the mouse button that is pressed.
     * @return Returns if the button is being held.
     */
    public boolean buttonDownOnce(MouseKeys key) 
    {
        return buttonDownOnce(key.KEYCODE);
    }

    /**
     * Checks to see if a button on the mouse is pressed.
     * @param button ID for the button to be evaluated.
     * @return Returns if the button is down.
     */
    public boolean buttonDown(int button) 
    {
        return poll[ button - 1] == MouseState.ONCE
                || poll[ button - 1] == MouseState.PRESSED;
    }

    /**
     * Checks to see if a button on the mouse is pressed.
     * @param key MouseKey object containing the key code of the mouse button that is pressed.
     * @return Returns if the button is down. 
     */
    public boolean buttonDown(MouseKeys key) 
    {
        return buttonDown(key.KEYCODE);
    }

    /**
     * Detects if a mouse key was pressed for Swing/AWT components.
     * @param e KeyEvent related to key that was pressed. 
     */
    @Override
    public void mousePressed(MouseEvent e) 
    {
        state[ e.getButton() - 1] = true;
    }

    /**
     * Detects if a mouse key was released for Swing/AWT components.
     * @param e KeyEvent related to key that was released. 
     */
    @Override
    public void mouseReleased(MouseEvent e) 
    {
        state[ e.getButton() - 1] = false;
    }

    /**
     * Detects if the mouse has entered a region for Swing/AWT components.
     * @param e KeyEvent related to the mouse entering a region. 
     */
    @Override
    public void mouseEntered(MouseEvent e) 
    {
        mouseMoved(e);
    }

    /**
     * Detects if the mouse has exited a region for Swing/AWT components.
     * @param e KeyEvent related to the mouse exiting a region. 
     */
    @Override
    public void mouseExited(MouseEvent e) 
    {
        mouseMoved(e);
    }

    /**
     * Detects if the mouse has been dragged for Swing/AWT components.
     * @param e KeyEvent related to the mouse being dragged. 
     */
    @Override
    public void mouseDragged(MouseEvent e)
    {
        mouseMoved(e);
    }

    /**
     * Detects if the mouse has been moved for Swing/AWT components.
     * @param e KeyEvent related to the mouse being moved. 
     */
    @Override
    public void mouseMoved(MouseEvent e) 
    {
        currentPos = e.getPoint();
    }

    /**
     * Void Method; Not Implemented.
     */
    @Override
    public void mouseClicked(MouseEvent e) 
    {
        // NOP
        //throw new UnsupportedOperationException("Not yet implemented.");
    }
}