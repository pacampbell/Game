package game.debug;

import game.framework.Game;
import game.framework.GameTime;
import game.framework.Point;
import game.framework.Vector2;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.util.ArrayList;

public class TestFramework extends Game
{
    // Test for mouse
    ArrayList<Point> points = new ArrayList<>();
    
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
        Vector2.unitTest();
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
        //<editor-fold defaultstate="collapsed" desc="System & Menu Keys">
        if(keyboard.keyDownOnce(KeyEvent.VK_ESCAPE))
        {
            Game.exitGame();
        }
        //</editor-fold>
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
        g2d.drawString("Mouse: (" + mouse.getPosition().x + "," + mouse.getPosition().y + ")", 10, 60);
        
        //g2d.fillRect(mouse.getPosition().x, mouse.getPosition().y, 10, 10);   
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
