package game.framework;

public class Rectangle
{
    public int width;
    public int height;
    public int x;
    public int y;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    // Complete Constructor
    public Rectangle(int x, int y, int width, int height)
    {
        this.width = width;
        this.height = height;
        this.x = x;
        this.y = y;
    }

    // Empty Constructor
    public Rectangle()
    {
        this(0, 0, 0, 0);
    }

    public Rectangle(int width, int height)
    {
        this(0, 0, width, height);
    }
    //</editor-fold>

    //<editor-fold defaultstate="collapsed" desc="Getters for sides of Rectangle">
    // Returns the y-coordinate of the top of the rectangle.
    public int top()
    {
        return y;
    }

    // Returns the y-coordinate of the bottom of the rectangle.
    public int bottom()
    {
       return y + height;
    }

    // Returns the x-coordinate of the left side of the rectangle.
    public int left()
    {
        return x;
    }

    // Returns the x-coordinate of the right side of the rectangle.
    public int right()
    {
        return x + width;
    }
    //</editor-fold>

    // Returns the center of the rectangle
    public Point center()
    {
        int centerX = width / 2;
        int centerY = height / 2;
        return new Point(centerX + x, centerY + y);
    }

    // Sets all fields of the Rectangle to zero
    public static Rectangle empty()
    {
        return new Rectangle();
    }

    // Checks to see if te rectangle is empty
    public boolean isEmpty()
    {
        boolean result = false;
        if(x == 0 && y == 0 && width == 0 && height == 0)
            result = true;
        return result;
    }

    // Sets the upper left corner (x,y) location of the rectangle
    public void setLocation(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Returns the upper left corner (x,y) location of the rectangle
    public Point getLocation()
    {
        return new Point(x, y);
    }

    // Checks to see if another rectangle intersects this rectangle
    public boolean intersects(Rectangle rectb)
    {
        return  !(
                this.left()  > rectb.right()  ||
                rectb.left() > this.right()   ||
                this.top()   > rectb.bottom() ||
                rectb.top()  > this.bottom()
                );
    }

    @Override
    public String toString()
    {
        return "Width: " + width + "\nHeight: " + height + "\nX: " + x + "\nY: " + y;
    }
}
