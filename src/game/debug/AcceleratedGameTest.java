package game.debug;

import game.framework.Vector2;
import java.awt.*;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import java.util.Random;
import javax.swing.JFrame;

/*
 * This is an example of a simple windowed render loop
 */
public class AcceleratedGameTest 
{

    public static void main(String[] args) 
    {   
        Vector2 vec1 = new Vector2(1, 1);
        Vector2 vec2 = new Vector2(5, 1);
        Vector2 vec3 = new Vector2(3, 5);
        float b2 = 0.4f;
        float b3 = 0.6f;
        Vector2 bary = Vector2.barycentric(vec1, vec2, vec3, b2, b3);
        System.out.println(bary);
        
        
        
        // Create game window...
        JFrame app = new JFrame("Accelerated Test");
        app.setIgnoreRepaint( true );
        app.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

        // Create canvas for painting...
        Canvas canvas = new Canvas();
        canvas.setIgnoreRepaint(true);
        canvas.setSize(640, 480);

        // Add canvas to game window...
        app.add(canvas);
        app.pack();
        app.setVisible(true);

        // Create BackBuffer...
        canvas.createBufferStrategy(2);
        BufferStrategy buffer = canvas.getBufferStrategy();

        // Get graphics configuration...
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        GraphicsDevice gd = ge.getDefaultScreenDevice();
        GraphicsConfiguration gc = gd.getDefaultConfiguration();

        // Create off-screen drawing surface
        BufferedImage bi = gc.createCompatibleImage(640, 480);

        // Objects needed for rendering...
        Graphics graphics = null;
        Graphics2D g2d = null;
        Color background = Color.BLACK;
        Random rand = new Random();

        // Variables for counting frames per seconds
        int fps = 0;
        int frames = 0;
        long totalTime = 0;
        long curTime = System.currentTimeMillis();
        long lastTime = curTime;
                
        while(true) 
        {
            try 
            {
                // count Frames per second...
                lastTime = curTime;
                curTime = System.currentTimeMillis();
                totalTime += curTime - lastTime;
                if(totalTime > 1000) 
                {
                    totalTime -= 1000;
                    fps = frames;
                    frames = 0;
                } 
                ++frames;

            // clear back buffer...
            g2d = bi.createGraphics();
            g2d.setColor( background );
            g2d.fillRect( 0, 0, 639, 479 );
                                
            // draw some rectangles...
            for(int i = 0; i < 20; ++i) 
            {
                int r = rand.nextInt(256);
                int g = rand.nextInt(256);
                int b = rand.nextInt(256);
                g2d.setColor( new Color(r,g,b) );
                int x = rand.nextInt( 640/2 );
                int y = rand.nextInt( 480/2 );
                int w = rand.nextInt( 640/2 );
                int h = rand.nextInt( 480/2 );
                g2d.fillRect( x, y, w, h );
            }
                                
            // display frames per second...
            g2d.setFont( new Font( "Courier New", Font.PLAIN, 12 ) );
            g2d.setColor( Color.GREEN );
            g2d.drawString( String.format( "FPS: %s", fps ), 20, 20 );
                                
            // Blit image and flip...
            graphics = buffer.getDrawGraphics();
            graphics.drawImage(bi, 0, 0, null);
            if(!buffer.contentsLost())
              buffer.show();
                                
            // Let the OS have a little time...
            Thread.yield();
          } 
          finally 
          {
            // release resources
            if( graphics != null ) 
                graphics.dispose();
            if( g2d != null ) 
                g2d.dispose();
            }
        }
    }
}