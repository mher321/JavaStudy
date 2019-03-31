package auditorium.figure;

import java.awt.*;

public class Circle extends Figure {
    public Circle(int x, int y, int width, int height, Color color) {
        super(x, y, width, height, color);
    }

    public Circle(int x, int y, int width, int height) {
        super(x, y, width, height);
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(getColor());

    }

    @Override
    public boolean isBelong(int x, int y) {
        return false;
    }

}
