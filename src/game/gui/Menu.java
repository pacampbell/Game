package game.gui;

import game.framework.GameTime;
import game.framework.Rectangle;
import game.framework.Vector2;
import game.input.Mouse;
import game.input.MouseKeys;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.util.LinkedList;

public class Menu extends GuiComponent 
{
    // Values that need to be set by parent
    private Vector2 position;
    private Font font;
    private int closedWidth, closedHeight;
    private Color paneColor, borderColor, fontColor;
    private Rectangle closedBoundingBox, openBoundingBox;
    // Class Properties
    public final String LABEL;
    private MenuState menuState;
    private LinkedList<MenuItem> items;
    
    public Menu(String LABEL, Color fontColor)
    {
        this.LABEL = LABEL;
        this.fontColor = fontColor;
        this.menuState = MenuState.CLOSED;
        this.items = new LinkedList<>();
    }
    
    public Menu(String label)
    {
        this(label, Color.WHITE);
    }
    
    /**
     * Adds a menu item to be displayed when the menu is activated.
     * @param menuItem A MenuItem to be added to this Menu.
     */
    public void add(MenuItem menuItem)
    {
        items.add(menuItem);
    }
    
    /**
     * Sets The Color and Border Color of the menu.
     * This is set by the parent object MenuBar.
     * @param paneColor Color of the Menu pane.
     * @param borderColor Color of the Border surrounding the menu pane.
     */
    protected void setColors(Color paneColor, Color borderColor)
    {
        this.paneColor = paneColor;
        this.borderColor = borderColor;
    }
    
    /**
     * Sets the height of the Menu when it is closed. 
     * This is set by the parent object MenuBar.
     * @param closedWidth Width of the closed Menu.
     * @param closedHeight Height of the closed Menu.
     */
    protected void setClosedDimensions(int closedWidth, int closedHeight)
    {
        this.closedWidth = closedWidth;
        this.closedHeight = closedHeight;
        this.closedBoundingBox = new Rectangle((int)position.x, (int)position.y, closedWidth, closedHeight);
    }
    
    /**
     * Sets the font of the Menu.
     * @param font Font to be used for Menu Fonts
     */
    protected void setFont(Font font)
    {
        this.font = font;
    }
    
    /**
     * Sets the position of the Menu
     * @param position Position of the Menu.
     */
    protected void setPosition(Vector2 position)
    {
        this.position = position;
    }
    
    /**
     * @return Returns the width of the Menu when it is closed. 
     */
    public int getClosedWidth()
    {
        return closedWidth;
    }

    @Override
    public void initialize() 
    {
        int yOffset;
        for(int i = 0; i < items.size(); ++i)
        {
            // TODO: need to fix 200 width constant
            yOffset = (i + 1) * closedHeight;
            this.openBoundingBox = new Rectangle((int)position.x, (int)position.y + closedHeight, 200, yOffset);
            items.get(i).setPosition(position.addY(yOffset));
            items.get(i).setDimensions(200, closedHeight);
            items.get(i).setFont(font);
            items.get(i).setFontColor(fontColor);
            items.get(i).initialize();
        }
    }

    @Override
    public void loadContent(){}

    @Override
    public void update(GameTime gameTime) 
    {   
        if(items.size() != 0)
        {
            // Determine the User clicked on the menu.
            if(closedBoundingBox.intersects(Mouse.getPosition()) && Mouse.buttonDownOnce(MouseKeys.BUTTON_1))
                menuState = MenuState.OPEN;
            if(menuState == MenuState.OPEN && !closedBoundingBox.intersects(Mouse.getPosition()) && !openBoundingBox.intersects(Mouse.getPosition()))
                menuState = MenuState.CLOSED;      
        }

        switch(menuState)
        {
            case OPEN:
                for(MenuItem item : items)
                    item.update(gameTime);
                break;
        }
    }

    @Override
    public void draw(Graphics2D g2d) 
    {
        g2d.setFont(font);
        g2d.setColor(fontColor);
        g2d.drawString(LABEL, position.x + 10, 15);
        // If the menu is open draw that piece as well
        if(items.size() > 0 && menuState == MenuState.OPEN)
        {
            g2d.setColor(paneColor);
            g2d.fillRect(openBoundingBox.x, openBoundingBox.y, openBoundingBox.width, openBoundingBox.height);
            for(MenuItem item : items)
                item.draw(g2d);
            g2d.setColor(borderColor);
            g2d.drawRect(openBoundingBox.x, openBoundingBox.y, openBoundingBox.width, openBoundingBox.height);
        }
    }
}
