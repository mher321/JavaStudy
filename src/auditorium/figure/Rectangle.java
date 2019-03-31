package auditorium.figure;

import java.awt.*;

public class Rectangle extends Figure {


    public Rectangle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public Rectangle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());
        g.fillRect(getX(), getY(), getWidth(), getHeight());
    }

    @Override
    public boolean isBelong(int x, int y) {
        return x >= getX() && x <= getX() + getWidth() && y >= getY() && y <= getY() + getHeight();
    }
}
