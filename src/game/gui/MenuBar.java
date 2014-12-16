package game.gui;

import game.framework.GameHelper;
import game.framework.GameTime;
import game.framework.Rectangle;
import game.framework.Vector2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.util.LinkedList;

public class MenuBar implements GuiComponent
{
    private Anchor anchor;
    private Rectangle bounds;
    private LinkedList<Menu> menus;
    private Color paneColor, borderColor;
    private Font font;
    // Font Metrics
    private FontRenderContext frc;
    
    /**
     * Complete Constructor.
     * Creates a MenuBar with the desired properties. 
     * @param anchor Anchor enumeration defining where the MenuBar is located.
     * @param font Font used within the MenuBar.
     * @param paneColor Color of the MenuBar.
     * @param borderColor Color of the border of the MenuBar.
     */
    public MenuBar(Anchor anchor, Font font, Color paneColor, Color borderColor)
    {
        // Set properties
        this.anchor = anchor;
        this.font = font;
        this.paneColor = paneColor;
        this.borderColor = borderColor;
        // Objects for getting font metrics
        this.frc = new FontRenderContext(font.getTransform(), true, true);
        // Determine bounds based on the anchor
        int height = (int)font.getStringBounds("H", frc).getHeight();
        Vector2 position = determineAnchor(anchor, height);
        this.bounds = new Rectangle
        (
                (int)position.x, 
                (int)position.y, 
                GameHelper.WIDTH(), 
                height
        ); 
        // Create list to hold Menus
        this.menus = new LinkedList<>();
    }
   
    /**
     * Creates a MenuBar with the default properties anchored at a desired location.
     * Defaults:
     *   font: Times New Roman, Font.PLAIN, 16
     *  color: Color.BLACK
     * @param anchor Anchor enumeration defining where the MenuBar is located.
     */
    public MenuBar(Anchor anchor)
    {
        this(anchor, new Font("Times New Roman", Font.PLAIN, 16), Color.GRAY, Color.BLACK);
    }
    
    /**
     * Default Constructor.
     * Creates a MenuBar with the default properties anchored at the top.
     * Defaults:
     *  Anchor: Anchor.TOP
     *    font: Times New Roman, Font.PLAIN, 16
     *   color: Color.BLACK
     */
    public MenuBar()
    {
        this(Anchor.TOP, new Font("Times New Roman", Font.PLAIN, 16), Color.GRAY, Color.BLACK);
    }
    
    /**
     * Adds a Menu to the MenuBar.
     * @param menu A Menu to be added to the MenuBar.
     */
    public void add(Menu menu)
    {
        // Add the new menu
        this.menus.add(menu);
    }

    /**
     * Initialized all Menus in the MenuBar.
     */
    @Override
    public void initialize() 
    {
        // Initialize all the Menu items. 
        int xPos = 0;
        for(int i = 0; i < menus.size(); ++i)
        {
            menus.get(i).setProperties
            (
                anchor, 
                xPos, 
                bounds.y, 
                // 10px padding on each side = "+ 20"
                // TODO: Fix + 20 Magic Number
                (int)font.getStringBounds(menus.get(i).LABEL, frc).getWidth() + 20, 
                bounds.height
            );
            // Set Font and Color
            menus.get(i).setColors(paneColor, borderColor);
            menus.get(i).setFont(font);
            // update the xPos offset
            xPos += menus.get(i).getClosedWidth();
        }
        // Initialize Each Menus MenuItems
        for(Menu menu : menus)
            menu.initialize();
    }

    /**
     * Loads any content for MenuBar, and MenuBar menu content.
     */
    @Override
    public void loadContent() 
    {
        for(Menu menu : menus)
            menu.loadContent();
    }

    /**
     * Updates the MenuBar and MenBar menus.
     * @param gameTime GameTime object containing the timing of the current session.
     */
    @Override
    public void update(GameTime gameTime) 
    {
        for(Menu menu : menus)
            menu.update(gameTime);
    }

    /**
     * Draws The MenuBar component.
     * @param g2d Graphics2D object containing the drawable surface of the window.
     */
    @Override
    public void draw(Graphics2D g2d) 
    {
        // Set the paneColor of the MenuBar
        g2d.setColor(paneColor);
        // Fill The Menu Bar
        g2d.fillRect(bounds.x, bounds.y, bounds.width, bounds.height);
        // Set The Color of the Border
        g2d.setColor(borderColor);
        // Draw The Border
        switch(anchor)
        {
            case BOTTOM:
                g2d.drawLine(bounds.x, bounds.y, bounds.width, bounds.y);
                break;
            case TOP:
            default:
                g2d.drawLine(bounds.x, bounds.height, bounds.width, bounds.height);
                break;
        }
        // Draw The Menu's on this Menu Bar
        for(Menu menu : menus)
            menu.draw(g2d);
    }
    
    /**
     * Determines where the MenuBar should be positioned based on the provided anchor.
     * @param anchor Anchor enumeration defining where the MenuBar is located.
     * @param height Integer representing the height of the MenuBar.
     * @return Returns a Vector2 containing the (x,y) coordinates of the upper-left side of the MenuBar.
     */
    private Vector2 determineAnchor(Anchor anchor, int height)
    {
        Vector2 pos;
        switch(anchor)
        {
            case BOTTOM:
                pos = new Vector2(0, GameHelper.HEIGHT() - height);
                break;
            default:
                System.out.println("Anchor: " + anchor + " is not supported.");
                System.out.println("Defaulting to Anchor.TOP");
            case TOP:
                pos = Vector2.zero();
                break;
        }
        return pos;
    }
}
