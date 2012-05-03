package game.debug;

import game.framework.Game;
import game.framework.GameTime;
import game.framework.MathHelper;
import game.framework.Vector2;
import game.input.Keyboard;
import game.input.Mouse;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class TestFramework extends Game
{
    // Test for mouse
    ArrayList<Point> points = new ArrayList<>();
    float ellapsedTime = 0;
    float value = 0;
    final int TOTAL_TIME = 750;
    boolean ready = true;
    Vector2 vector = new Vector2(100);
    
    /**
     * Any objects/variables that need to be Initialized should do so
     * in Initialize().
     */
    @Override
    public void initialize()
    {
        // Initalize stuff in Base
        super.initialize();
        // TODO:
    }

    /**
     * Any Content that needs to be loaded should do so
     * in loadContent().
     */
    @Override
    public void loadContent()
    {
        // All Resources should be placed in the resource folder
        // A "/resource/" is appened to the path.
        // To load an image; Texture2D texture = new Texture2D("path");
        // This file should load on all OS inside the jar :)
        // TODO:
    }

    /**
     * Any Content that needs to be unloaded should do so
     * in unloadContent().
     * Note: I wouldn't worry about this; Its not implemented properly as of now..
     */
    @Override
    public void unloadContent()
    {
        // TODO:
    }

    /**
     * Objects/Variables/Logic/Input that need to be updated should be placed
     * in this method.
     * @param gameTime
     */
    @Override
    public void update(GameTime gameTime)
    {
        // Call base class
        super.update(gameTime);
        // TODO:
        this.fps.update(gameTime);
        
        // Increase the Vectors position
        vector = vector.add(40 * gameTime.getDeltaTimeSeconds(), -40 * gameTime.getDeltaTimeSeconds());
        
        // If it is not ready to move start the lerp
        if(!ready)
        {
            ellapsedTime += gameTime.getDeltaTime();
            value = MathHelper.lerp(200, 0, ellapsedTime/TOTAL_TIME);
            if(ellapsedTime/TOTAL_TIME >= 1)
            {
                ellapsedTime = 0;
                ready = true;
            }
        }
        
        //<editor-fold defaultstate="collapsed" desc="System & Menu Keys">
        if(Keyboard.keyDownOnce(KeyEvent.VK_ESCAPE))
        {
            Game.exitGame();
        }
        if(Keyboard.keyDownOnce(KeyEvent.VK_G) && ready)
        {
            ready = false;
        }
        if(Keyboard.keyDownOnce(KeyEvent.VK_R))
        {
            ready = true;
            ellapsedTime = 0;
            value = 0;
            ready = true;
            // Reset the Vector
            this.vector = Vector2.zero();
        }
        if(Keyboard.keyDownOnce(KeyEvent.VK_UP))
        {
            vector = vector.add(300, -300);
        }
        //</editor-fold>
        // Clamp the Vector
        vector = vector.clamp(new Vector2(-100, -100), new Vector2(300, 300));
    }

    /**
     * This method draws images to the screen buffer
     * @param g2d
     */
    @Override
    public void draw(Graphics2D g2d)
    {
        // Call Base Class to clear Screen
        super.draw(g2d);
        // TODO:
        this.fps.draw(g2d);
        g2d.drawString("Mouse: (" + Mouse.getPosition().x + "," + Mouse.getPosition().y + ")", 10, 60);
        g2d.drawString("Lerp-Value: " + value, 10, 80);
        g2d.drawString("Vector-Clamp: " + vector, 10, 100);
    }
    
    /**
     * Main Entrance into TestFramework
     * @param args 
     */
    public static void main(String[] args)
    {
        TestFramework test = new TestFramework();
        test.setTitle("Java Game Framework - Alpha");
        test.setDimensions(800, 600);
        test.run();
    }
}
