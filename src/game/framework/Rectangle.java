package game.framework;

import java.awt.Point;
import java.io.Serializable;

/**
 * Rectangle geometric primitive.
 * Has a x-coordinate, y-coordinate, width, and height.
 * @version 0.1
 * @author adam
 */
public class Rectangle implements Serializable
{
    //<editor-fold defaultstate="collapsed" desc="Properties">
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
    //</editor-fold>
    
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
    @Override
    public boolean equals(Object obj) 
    {
        boolean result = false;	
        if(obj != null)
        {
            // If they have the same address they must be the same object.
            if(obj == this)
                result = true;
            // Determine if the Object is a rectangle.
            else if(obj instanceof Rectangle) 
            {	
                // If it is, cast it to a new Rectangle and compare it with the given Rectangle.
                Rectangle rectangle = (Rectangle)obj;
                if((this.width == rectangle.width) && (this.height == rectangle.height)) 
                { 
                    result = true;
                }
            }
        }
        return result;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Inflate">
    /**
     * Pushes the edges of a Rectangle out by the provided values starting from the center.
     * @param r A Rectangle to inflate.
     * @param xScale Integer representing the horizontal scale.
     * @param yScale Integer representing the vertical scale.
     * @return Returns a new Rectangle inflated by the inputs.
     */
    public static Rectangle inflate(Rectangle r, int xScale, int yScale) {
		int newWidth, newHeight, newX, newY;
                
		// Determine the widths of the new Rectangle to return.
		newWidth = r.width + xScale;
		newHeight = r.height + yScale;
                
                // Determine the new position (central anchor point inflation)
                newX = r.x - xScale/2;
                newY = r.y - yScale/2;
		
		// Create a new Rectangle with the original x and y positions, and the
		// new width and height values.
		Rectangle rect = new Rectangle (newX, newY, newWidth, newHeight);

		return rect;
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
        int x=0, y=0, xWidth=0, yHeight=0;
		
        // Determine if b's x value is between a's left and right boundaries.
        // If it is, set the x value of the new Rectangle to b's x value
        // and set the width to (smaller right value - x value);
        if(a.left() <= b.left() && b.left() <= a.right()){		
            x = b.left();
            xWidth = (a.right() < b.right()) ? (a.right() - x) : (b.right() - x); 			
        }

        // Determine if a's x value is between b's left and right boundaries.
        // If it is, set the x value of the new Rectangle to a's x value
        // and set the width to (smaller right value - x value)
        else if(b.left() <= a.left() && a.left() <= b.right()){
            x = a.left();
            xWidth = (a.right() < b.right()) ? (a.right() - x) : (b.right() - x); 			
        } 

        // Determine if b's y value is between a's top and bottom boundaries.
        // If it is, set the y value of the new Rectangle to b's y value
        // and set the height to (smaller bottom value - y value)
        if(a.top() <= b.top() && b.top() <= a.bottom()){			
            y = b.top();
            yHeight = (a.bottom() < b.bottom()) ? (a.bottom() - y) : (b.bottom() - y); 			
        }

        // Determine if a's y value is between b's top and bottom boundaries.
        // If it is, set the y value of the new Rectangle to a's y value
        // and set the height to (smaller bottom value - y value)
        else if(b.top() <= a.top() && a.top() <= b.bottom()){			
            y = a.top();
            yHeight = (b.bottom() < a.bottom()) ? (b.bottom() - y) : (a.bottom() - y); 			
        }

        // Create a new Rectangle with the values found and return it.
        return new Rectangle(x, y, xWidth, yHeight);
    }
    
    /**
     * Finds the intersection between this Rectangle and that Rectangle.
     * @param that A Rectangle that may intersect this.
     * @return Returns a new Rectangle representing this intersect that.
     */
    public Rectangle intersection(Rectangle that) {
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
        boolean result = true;
        Rectangle test = intersection(a, b);	
        if(test.width == 0 || test.height == 0) result = false;
            return result;
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
     * Checks if the point represented by (px,py) intersects the provided Rectangle.
     * @param r A Rectangle.
     * @param px The x-coordinate of a point that may be intersecting the Rectangle.
     * @param py The y-coordinate of a point that may be intersecting the Rectangle.
     * @return Returns (px,py) intersect r.
     */
    public static boolean intersects(Rectangle r, int px, int py)
    {
        boolean result = false;
        // Determine if the Point p falls within the boundaries of Rectangle r.
        if(r.left() <= px && px <= r.right())
            if(r.top() <= py && py <= r.bottom())
                result = true;
        return result;
    }
    
    /**
     * Checks if the point represented by (px,py) intersects this Rectangle.
     * @param px The x-coordinate of a point that may be intersecting the Rectangle.
     * @param py The y-coordinate of a point that may be intersecting the Rectangle.
     * @return Returns (px,py) intersect this. 
     */
    public boolean intersects(int px, int py)
    {
        return Rectangle.intersects(this, px, py);
    }
    
    /**
     * Checks if a Point intersects a Rectangle.
     * @param r A Rectangle.
     * @param p A Point that may be intersecting a.
     * @return Returns p intersect r.
     */
    public static boolean intersects(Rectangle r, Point p)
    {
        return Rectangle.intersects(r, p.x, p.y);
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
        // Create a new Rectangle with identical dimensions but moved to given offset.
        return new Rectangle(x, y, r.width, r.height);
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
        // Calculate bottom of rectangle as y + height
        return (r.y + r.height);
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
        // Calculate center of rectangle and return as a Point.
        return new Point((r.x + r.width/2), (r.y + r.height/2));
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
        boolean result = false;
        if(rect.width == 0 || rect.height == 0) result = true;
        return result;
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
        return r.x;
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
        // Return a point representing top left corner of the Rectangle.
        return new Point(r.left(), r.top());
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
        // Calculate right boundary of rectangle as (x + width)
        return r.x + r.width;
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
        // Calculate top boundary of rectangle as y
        return r.y;
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
        // Creates a String representation of the values of the rectangle
        String result = String.format("X-Pos: %d, Y-Pos: %d, Width: %d, Height: %d", this.x, this.y, this.width, this.height);
        return result;
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
        int x = 0, y = 0, width = 0, height = 0;
		
        // Determine which boundary gives more area for the new rectangle
        // and set that as the new value.

        x = (a.left() < b.left()) ? a.x : b.x;
        y = (a.bottom() < b.bottom()) ? a.y : b.y;
        width = (a.right() < b.right()) ? a.right() : b.right();
        height = (a.top() < b.top()) ? b.top() : a.top();

        // Create a new Rectangle with the given values and return it.	
        return new Rectangle(x, y, (width - x), (height - y));
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
