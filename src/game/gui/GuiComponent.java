package game.gui;

import game.framework.GameTime;

import java.awt.*;

public interface GuiComponent
{
    public abstract void initialize();
    public abstract void loadContent();
    public abstract void update(GameTime gameTime);
    public abstract void draw(Graphics2D g2d);
}
