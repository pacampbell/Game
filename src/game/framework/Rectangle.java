package game.framework;

/**
 * Rectangle geometric primitive.
 * Has a x-coordinate, y-coordinate, width, and height.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Bottom</li>
 *  <li>Center</li>
 *  <li>Contains</li>
 *  <li>Empty</li>
 *  <li>Equals</li>
 *  <li>Inflate</li>
 *  <li>Intersects</li>
 *  <li>Is Empty</li>
 *  <li>Left</li>
 *  <li>Location</li>
 *  <li>Offset</li>
 *  <li>Right</li>
 *  <li>To String</li>
 *  <li>Top</li>
 *  <li>Unions</li>
 * </ul>
 * @version incomplete
 * @author paul
 */
public class Rectangle
{
    /**
     * Integer representing the x-coordinate of the Rectangle.
     */
    public final int x;
    
    /**
     * Integer representing the y-coordinate of the Rectangle.
     */
    public final int y;
    
    /**
     * Integer representing the width of the Rectangle.
     */
    public final int width;
    
    /**
     * Integer representing the height of the Rectangle.
     */
    public final int height;
    
    //<editor-fold defaultstate="collapsed" desc="Constructor">
    /**
     * Complete Constructor
     * @param x Integer representing the x-coordinate of the Rectangle.
     * @param y Integer representing the y-coordinate of the Rectangle.
     * @param width Integer representing the width of the Rectangle.
     * @param height Integer representing the height of the Rectangle.
     */
    public Rectangle(int x, int y, int width, int height)
    {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
    /**
     * Copy Constructor.
     * Creates a copy of the provided Rectangle.
     * @param rect A Rectangle to be copied.
     */
    public Rectangle(Rectangle rect)
    {
        this(rect.x, rect.y, rect.width, rect.height);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Contains">
    public boolean contains(int x, int y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public boolean contains(Point p)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public boolean contains(Rectangle rect)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Equals">
    public boolean equals(Object obj)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inflate">
    public Rectangle inflate(int xScale, int yScale)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Intersects">
    public static boolean intersects(Rectangle a, Rectangle b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public boolean intersects(Rectangle that)
    {
        return Rectangle.intersects(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Offset">
    public Rectangle offset(int x, int y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Rectangles">
    public int bottom()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Point center()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static Rectangle empty()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public static boolean isEmpty(Rectangle rect)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public boolean isEmpty()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public int left()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Point location()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public int right()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public int top()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String">
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Union">
    public static Rectangle union(Rectangle a, Rectangle b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    public Rectangle union(Rectangle that)
    {
        return Rectangle.union(this, that);
    }
    //</editor-fold>
}
