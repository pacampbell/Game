package game.framework;

public class Point
{
    /**
     * Integer representing the x-coordinate of a Point.
     */
    public final int x;
    
    /**
     * Integer representing the y-coordinate of a Point.
     */
    public final int y;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    /**
     * Complete Constructor
     * @param x Integer representing the x coordinate.
     * @param y Integer representing the y coordinate.
     */
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    /**
     * Empty Constructor
     * Creates a point object with the default values (0,0).
     */
    public Point()
    {
        this(0, 0);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Equals">
    /**
     * Tests the equality between two point objects
     * @param obj An object that is believed to be a point.
     * @return Returns this == that 
     */
    @Override
    public boolean equals(Object obj)
    {
        boolean equal = false;
        if(obj instanceof Point)
        {
            Point that = (Point)obj;
            equal = (this.x == that.x) && (this.y == that.y);
        }
        return equal;
    }
    //</editor-fold>
    
    //<editor-fold defaultstate="collapsed" desc="Special Points">
    /**
     * @return Returns a new point object with the values (0,0) 
     */
    public static Point zero()
    {
        return new Point(0,0);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="To String">
    /**
     * Creates a String representation of this point. (x,y)
     */
    @Override
    public String toString()
    {
        return "(" + this.x + "," + this.y + ")";
    }
    //</editor-fold>
}
