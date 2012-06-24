package game.input;

public enum MouseKeys 
{
    /**
     * Button_1 represents the left mouse button.
     */
    BUTTON_1(1), 
    
    /**
     * Button_2 represents the middle mouse button.
     */
    BUTTON_2(2), 
    
    /**
     * Button_3 represents the right mouse button.
     */
    BUTTON_3(3);
    
    /**
     * Integer representing the key code of the mouse button.
     */
    public final int KEYCODE;
    
    /**
     * Private Constructor.
     * Creates a MouseKeys enum with the provided key code.
     * @param keycode Integer representing the key code of a mouse button.
     */
    private MouseKeys(int keycode)
    {
        this.KEYCODE = keycode;
    }
}
