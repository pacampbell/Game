package game.debug;

import game.framework.Vector2;
import java.awt.Color;
import java.awt.Graphics2D;
import java.util.ArrayList;

public class Debug
{
    private static ArrayList<String> list = new ArrayList<>();
    private static Vector2 cursorPosition = new Vector2();

    public static void print(Graphics2D g2d)
    {
        g2d.setColor(Color.GREEN);
        // Printout all the items in the list
        for(String item : list)
        {
            g2d.drawString(item, cursorPosition.x, cursorPosition.y);
            cursorPosition = new Vector2(cursorPosition.x, cursorPosition.y + 20);
        }
        list.clear();
    }

    //<editor-fold defaultstate="collapsed" desc="Add">
    public static void add(String item)
    {
        list.add(item);
    }

    public static void add(int item)
    {
        list.add(Integer.toString(item));
    }

    public static void add(long item)
    {
        list.add(Long.toString(item));
    }

    public static void add(float item)
    {
        list.add(Float.toString(item));
    }

    public static void add(double item)
    {
        list.add(Double.toString(item));
    }
    //</editor-fold>

    public static void setCursorPosition(int x, int y)
    {
        cursorPosition = new Vector2(x, y);
    }
}
