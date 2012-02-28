package game.framework;

/**
 * Rectangle geometric primitive.
 * Has a x-coordinate, y-coordinate, width, and height.
 * <br />
 * <h1>Not Yet Implemented</h1>
 * <ul>
 *  <li>Bottom</li>
 *  <li>Center</li>
 *  <li>Equals</li>
 *  <li>Inflate</li>
 *  <li>Intersection</li>
 *  <li>Intersects</li>
 *  <li>Is Empty</li>
 *  <li>Left</li>
 *  <li>Location</li>
 *  <li>Offset</li>
 *  <li>Right</li>
 *  <li>To String</li>
 *  <li>Top</li>
 *  <li>Union</li>
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
        
    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Test the equality between this Rectangle and an Object believed to be a Rectangle.
     * @param obj A Object believed to be a Rectangle.
     * @return Returns this == that.
     */
    public boolean equals(Object obj)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inflate">
    /**
     * Pushes the edges of a Rectangle out by the provided values.
     * @param r A Rectangle to inflate.
     * @param xScale Integer representing the horizontal scale.
     * @param yScale Integer representing the vertical scale.
     * @return Returns a new Rectangle scaled by the inputs.
     */
    public static Rectangle inflate(Rectangle r, int xScale, int yScale)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Pushes the edges of this Rectangle out by the provided values.
     * @param xScale Integer representing the horizontal scale.
     * @param yScale Integer representing the vertical scale.
     * @return Returns a new Rectangle scaled by the inputs.
     */
    public Rectangle inflate(int xScale, int yScale)
    {
        return Rectangle.inflate(this, xScale, yScale);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Intersection">
    /**
     * Finds the intersection between two Rectangles.
     * @param a A Rectangle.
     * @param b A Rectangle that may intersect a.
     * @return Returns a new Rectangle representing a intersect b.
     */
    public static Rectangle intersection(Rectangle a, Rectangle b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the intersection between this Rectangle and that Rectangle.
     * @param that A Rectangle that may intersect this.
     * @return Returns a new Rectangle representing this intersect that.
     */
    public Rectangle intersection(Rectangle that)
    {
        return Rectangle.intersection(this, that);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Intersects">
    /**
     * Checks if two Rectangles intersects each other.
     * @param a A Rectangle.
     * @param b A Rectangle that may be intersecting a.
     * @return Returns b intersect a.
     */
    public static boolean intersects(Rectangle a, Rectangle b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Checks if that Rectangle intersects this Rectangle.
     * @param that A rectangle that may be intersecting this Rectangle.
     * @return Returns that intersect this.
     */
    public boolean intersects(Rectangle that)
    {
        return Rectangle.intersects(this, that);
    }
    
    /**
     * Checks if a Point intersects a Rectangle.
     * @param r A Rectangle.
     * @param p A Point that may be intersecting a.
     * @return Returns p intersect a.
     */
    public static boolean intersects(Rectangle r, Point p)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Checks if a point intersects this Rectangle
     * @param p A point that may be intersecting this Rectangle.
     * @return Returns p intersect this.
     */
    public boolean intersects(Point p)
    {
        return Rectangle.intersects(this, p);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Offset">
    /**
     * Changes the position of a Rectangle. 
     * @param r A Rectangle to be moved.
     * @param x Integer representing the x-coordinate of the Rectangle.
     * @param y Integer representing the y-coordinate of the Rectangle.
     * @return Returns a new Rectangle with the desired position.
     */
    public static Rectangle offset(Rectangle r, int x, int y)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Changes the position of this Rectangle.
     * @param x Integer representing the x-coordinate of the Rectangle.
     * @param y Integer representing the y-coordinate of the Rectangle.
     * @return Returns a new Rectangle with the desired position.
     */
    public Rectangle offset(int x, int y)
    {
        return Rectangle.offset(this, x, y);
    }
    
    /**
     * Changes the position of a Rectangle. 
     * @param r A Rectangle to be moved.
     * @param p A Point representing the x-coordinate and y-coordinate of the Rectangle.
     * @return Returns a new Rectangle with the desired position.
     */
    public static Rectangle offset(Rectangle r, Point p)
    {
        return Rectangle.offset(r, p.x, p.y);
    }
    
    /**
     * Changes the position of this Rectangle.
     * @param p A Point representing the x-coordinate and y-coordinate of the Rectangle.
     * @return Returns a new Rectangle with the desired position.
     */
    public Rectangle offset(Point p)
    {
        return Rectangle.offset(this, p.x, p.y);
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Rectangles">
    /**
     * Finds the bottom y-coordinate of a Rectangle.
     * @param r A Rectangle to find the bottom of.
     * @return Returns the y-coordinate of the bottom of a Rectangle.
     */
    public static int bottom(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the bottom y-coordinate of this Rectangle.
     * @return Returns the y-coordinate of the bottom of this Rectangle. 
     */
    public int bottom()
    {
        return Rectangle.bottom(this);
    }
    
    /**
     * Finds the (x,y) position of the center of a Rectangle.
     * @param r A Rectangle to find the center (x,y) of.
     * @return Returns the (x,y) position of the center of a rectangle.
     */
    public static Point center(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the (x,y) position of the center of this Rectangle.
     * @return Returns the (x,y) position of the center of this rectangle. 
     */
    public Point center()
    {
        return Rectangle.center(this);
    }
    
    /**
     * Determines if the Rectangle is empty.
     * Width = 0, Height = 0;
     * @param rect Rectangle object to check.
     * @return Returns if the Rectangle is empty.
     */
    public static boolean isEmpty(Rectangle rect)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Determines if this Rectangle is empty.
     * Width = 0, Height = 0;
     * @return Returns if the rectangle is empty.
     */
    public boolean isEmpty()
    {
        return Rectangle.isEmpty(this);
    }
    
    /**
     * Finds the left side x-coordinate of this Rectangle.
     * @param r A Rectangle to find the left side of.
     * @return Returns the x-coordinate of the left side of a Rectangle.
     */
    public static int left(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the left side x-coordinate of this Rectangle.
     * @return Returns the x-coordinate of the left side of this Rectangle. 
     */
    public int left()
    {
        return Rectangle.left(this);
    }
    
    /**
     * Gets the (x,y) position of the upper left side of a Rectangle.
     * @param r A Rectangle to find the location of.
     * @return Returns the (x,y) location of a Rectangle.
     */
    public static Point location(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Gets the (x,y) position of the upper left side of this Rectangle.
     * @return Returns the (x,y) position of the upper left side of the Rectangle. 
     */
    public Point location()
    {
        return Rectangle.location(this);
    }
    
    /**
     * Finds the x-coordinate of the right side of a Rectangle.
     * @param r A Rectangle to find the right side of.
     * @return Returns the x-coordinate of the right side of this Rectangle.
     */
    public static int right(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the x-coordinate of the right side of this Rectangle.
     * @return Returns the x-coordinate of the right side of this Rectangle. 
     */
    public int right()
    {
        return Rectangle.right(this);
    }
    
    /**
     * Finds the y-coordinate of the top of a Rectangle.
     * @param r A Rectangle to find te top of.
     * @return Returns the y-coordinate of the top of this Rectangle.
     */
    public static int top(Rectangle r)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Finds the y-coordinate of the top of this Rectangle.
     * @return Returns the y-coordinate of the top of this Rectangle. 
     */
    public int top()
    {
        return Rectangle.top(this);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * @return Returns a String representation of a Rectangle. 
     */
    @Override
    public String toString()
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Union">
    /**
     * Creates a new Rectangle that contains the two provided Rectangles.
     * @param a A Rectangle.
     * @param b A Rectangle.
     * @return Returns a union b.
     */
    public static Rectangle union(Rectangle a, Rectangle b)
    {
        throw new UnsupportedOperationException("Not yet implemented.");
    }
    
    /**
     * Creates a new Rectangle that contains this Rectangle and that Rectangle.
     * @param that A Rectangle.
     * @return Returns this union that.
     */
    public Rectangle union(Rectangle that)
    {
        return Rectangle.union(this, that);
    }
    //</editor-fold>
}
