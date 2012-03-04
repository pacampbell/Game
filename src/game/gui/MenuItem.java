package game.gui;

import game.framework.GameTime;
import game.framework.Rectangle;
import game.input.Mouse;
import game.input.MouseKeys;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public abstract class MenuItem extends GuiComponent 
{
    private final String LABEL;
    // Properties to be set by parent items
    private Anchor anchor;
    private Font font;
    private Color fontColor;
    private Rectangle bounds;
        
    /**
     * Complete Constructor
     * @param LABEL Text label that is displayed in the Menu.
     */
    public MenuItem(String LABEL)
    {
        this.LABEL = LABEL;
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
            fontColor = Color.YELLOW;
            if(Mouse.buttonDownOnce(MouseKeys.BUTTON_1))
                action();
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
     * Method to to be invoked by actions on the menu.
     */
    protected abstract void action();
}
