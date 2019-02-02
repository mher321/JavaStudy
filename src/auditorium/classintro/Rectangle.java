package auditorium.classintro;

public class Rectangle {
    int width;
    int height;

    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    int getPerimeter() {

        return 2 * (this.width + this.height);
    }
}
