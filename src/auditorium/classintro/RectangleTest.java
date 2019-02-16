package auditorium.classintro;

public class RectangleTest {

    public static void main(String[] args) {
        int width1 = 2;
        int width2 = 2;
        int height1 = 2;
        int height2 = 2;


        int s1 = width1 * height1;
        int s2 = width2 * height2;

        int p1 = getPerimeter(width1, height1);
        int p2 = getPerimeter(width2, height2);

        Rectangle rect1 = new Rectangle(4, 5);
        int perimeter = rect1.getPerimeter();

        Rectangle rect2 = new Rectangle(6, 4);
        int perimeter2 = rect2.getPerimeter();
        System.out.println();



    }

    static int getPerimeter(int width, int height) {

        return 2 * (width + height);
    }
}
