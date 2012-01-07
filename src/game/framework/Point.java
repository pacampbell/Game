package game.framework;

public class Point
{
    public int x;
    public int y;

    //<editor-fold defaultstate="collapsed" desc="Constructors">
    // Complete Constructor
    public Point(int x, int y)
    {
        this.x = x;
        this.y = y;
    }

    // Empty COnstructor
    public Point()
    {
        this(0, 0);
    }
    //</editor-fold>

    public static Point zero()
    {
        return new Point();
    }

    @Override
    public String toString()
    {
        return "(" + x + "," + y + ")";
    }
}
