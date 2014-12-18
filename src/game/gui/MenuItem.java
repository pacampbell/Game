package game.gui;

import game.framework.GameTime;
import game.framework.Rectangle;
import game.input.Mouse;
import game.input.MouseKeys;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class MenuItem implements GuiComponent 
{
    private final String LABEL;
    // Properties to be set by parent items
    private Anchor anchor;
    private Rectangle bounds;
    protected Font font;
    protected Color fontColor, hoverColor;
        
    /**
     * Complete Constructor
     * @param LABEL String containing the desired label for the MenuItem.
     * @param hoverColor Text color when the mouse is over this MenuItem.
     */
    public MenuItem(String label, Color hoverColor)
    {
        this.LABEL = label;
        this.hoverColor = hoverColor;
    }
    
    /**
     * Creates a MenuItem with the desired label.
     * Defaults hoverColor to yellow.
     * @param label String containing the desired label for the MenuItem.
     */
    public MenuItem(String label)
    {
        this(label, Color.YELLOW);
    }
    
    /**
     * Sets properties from parent class.
     * @param anchor Enumeration defining where the Parent MenuBar is anchored.
     * @param x Integer representing the x-coordinate of this MenuItem.
     * @param y Integer representing the y-coordinate of this MenuItem.
     * @param width Integer representing the width of this MenuItem.
     * @param height Integer representing the height of this MenuItem.
     */
    protected void setProperties(Anchor anchor, int x, int y, int width, int height)
    {
        this.anchor = anchor;
        this.bounds = new Rectangle(x, y, width, height);
    }
    
    /**
     * Sets the font color of this MenuItem.
     * @param fontColor Desired Color of the font.
     */
    protected void setFontColor(Color fontColor)
    {
        this.fontColor = fontColor;
    }
    
    /**
     * Sets the font of this MenuItem.
     * @param font Desired font to draw the label with.
     */
    protected void setFont(Font font)
    {
        this.font = font;
    }

    /**
     * Initializes this MenuItem.
     */
    @Override
    public void initialize(){}

    /**
     * Loads Content Needed for this MenuItem.
     */
    @Override
    public void loadContent(){}

    /**
     * Updates this MenuItem.
     * @param gameTime GameTime object containing the current time in game.
     */
    @Override
    public void update(GameTime gameTime) 
    {
        if(bounds.intersects(Mouse.getPosition()))
        {
            fontColor = hoverColor;
            // If the mouse is hovering over the item perform a action.
            onHover();
            // If the mouse is clicking the item perform a action.
            if(Mouse.buttonDownOnce(MouseKeys.BUTTON_1))
                onClick();
        }    
        else
            fontColor = Color.WHITE;
    }

    /**
     * Draws this MenuItem.
     * @param g2d Graphics2D object to draw this MenuItem
     */
    @Override
    public void draw(Graphics2D g2d) 
    {
        g2d.setFont(font);
        g2d.setColor(fontColor);
        g2d.drawString(LABEL, bounds.x + 5, bounds.y + 15);
    }
    
    /**
     * Method to to be invoked when a MenuItem is clicked.
     */
    protected void onClick(){};
    
    /**
     * Method to be invoked when a MenuItem is being hovered over.
     */
    protected void onHover(){};
}
