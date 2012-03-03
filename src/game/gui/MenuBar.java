package game.gui;

import game.framework.GameHelper;
import game.framework.GameTime;
import game.framework.Vector2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.font.FontRenderContext;
import java.util.LinkedList;

public class MenuBar extends GuiComponent
{
    private Vector2 position;
    private LinkedList<Menu> menus;
    private final int WIDTH, HEIGHT;
    private Color paneColor, borderColor;
    private Font font;
    // Font Metrics
    private FontRenderContext frc;
    
    public MenuBar(Vector2 position, Font font, Color paneColor, Color borderColor)
    {
        this.position = position;
        this.font = font;
        this.WIDTH = GameHelper.WIDTH();
        this.paneColor = paneColor;
        this.borderColor = borderColor;
        this.menus = new LinkedList<>();
        // Objects for getting font metrics
        this.frc = new FontRenderContext(font.getTransform(), true, true);
        this.HEIGHT = (int)font.getStringBounds("H", frc).getHeight();
    }
   
    public MenuBar(Vector2 position)
    {
        this(position, new Font("Times New Roman", Font.PLAIN, 16), Color.GRAY, Color.BLACK);
    }
    
    public MenuBar()
    {
        this(Vector2.zero(), new Font("Times New Roman", Font.PLAIN, 16), Color.GRAY, Color.BLACK);
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

    @Override
    public void initialize() 
    {
        // Initialize all the Menu items. 
        int xPos = 0;
        for(int i = 0; i < menus.size(); ++i)
        {
            for(int j = 0; j < i; ++j)
                xPos += menus.get(j).getClosedWidth();
            
            menus.get(i).setPosition(new Vector2(xPos, position.y));
            menus.get(i).setClosedDimensions
            (
                (int)font.getStringBounds(menus.get(i).LABEL, frc).getWidth() + 20, // 10px padding on each side
                HEIGHT
            );
            // Set Font and Color
            menus.get(i).setColors(paneColor, borderColor);
            menus.get(i).setFont(font);
            // Reset xPos
            xPos = 0;
        }
        // Initialize Each Menus MenuItems
        for(Menu menu : menus)
            menu.initialize();
    }

    @Override
    public void loadContent() 
    {
        for(Menu menu : menus)
        {
            menu.loadContent();
        }
    }

    @Override
    public void update(GameTime gameTime) 
    {
        for(Menu menu : menus)
        {
            menu.update(gameTime);
        }
    }

    @Override
    public void draw(Graphics2D g2d) 
    {
        // Set the paneColor of the MenuBar
        g2d.setColor(paneColor);
        // Fill The Menu Bar
        g2d.fillRect((int)position.x, (int)position.y, WIDTH, HEIGHT);
        // Set The Color of the Border
        g2d.setColor(borderColor);
        // Draw The Border
        g2d.drawLine((int)position.x, HEIGHT, WIDTH, HEIGHT);
        // Draw The Menu's on this Menu Bar
        for(Menu menu : menus)
        {
            menu.draw(g2d);
        }
    }    
}
