package game.debug;

import game.framework.GameTime;
import game.framework.Vector2;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;

public class PerformanceTiming 
{
    private int frameCount;
    private float fps;
    private float mspf;
    private float t_base;
    private Color textColor;
    private Vector2 position;
    private Font font;
    
    /**
     * Default Constructor
     * Sets default values to all variables
     */
    public PerformanceTiming()
    {
        this.frameCount = 0;
        this.fps = 0;
        this.mspf = 0;
        this.t_base = 0;
        this.textColor = Color.WHITE;
        this.position = new Vector2(10, 20);
        this.font = new Font(Font.SERIF, Font.PLAIN, 14);
    }

    /**
     * Updates the timing statistics
     * @param gameTime 
     */
    public void update(GameTime gameTime)
    {
        // Increment the frame count
        ++frameCount;

        if(gameTime.getGameTime() - t_base >= 1.0f)
        {
            fps = (float)frameCount; // FPS = frameCount / 1
            mspf = 1000.0f / fps;
            frameCount = 0;
            t_base += 1000.0f;
        }
    }

    /**
     * Draws the timing statistics
     * @param g2d 
     */
    public void draw(Graphics2D g2d)
    {
        g2d.setFont(font);
        // Sets the Color to draw
        g2d.setColor(textColor);
        // Draw the statistics on the screen
        g2d.drawString("FPS: " + fps, (int)position.x, (int)position.y);
        g2d.drawString("MSPF: " + mspf, (int)position.x, (int)position.y + 20);
    }

    /**
     * Sets the color of the text for the screen
     * @param color 
     */
    public void setTextColor(Color color)
    {
        this.textColor = color;
    }
    
    /**
     * Sets the position of this PerformanceTiming object.
     * @param position Vector2 containing the position of this PerformanceTiming object.
     */
    public void setPosition(Vector2 position)
    {
        this.position = position;
    }
    
    /**
     * Sets the position of this PerformanceTiming object.
     * @param x Float containing the desired x-coordinate of this PerformanceTiming object. 
     * @param y Float containing the desired y-coordinate of this PerformanceTiming object.
     */
    public void setPosition(float x, float y)
    {
        this.setPosition(new Vector2(x, y));
    }
}
