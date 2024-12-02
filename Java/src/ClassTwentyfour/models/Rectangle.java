package ClassTwentyfour.models;

public class Rectangle extends Figure{
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(double side) {
        width = side;
        height = side;
    }

    public Rectangle() {
        width = 0;
        height = 0;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double area(){
        return width * height;
    }

    @Override
    public double perimeter(){
        return 2 * (width + height);
    }

    @Override
    public String toString(){
        return String.format("id: %d\tRectangulo", id);
    }

    @Override
    public String information(){
        return String.format("Rectangulo:\nid: %d\tAncho: %.2f\tAlto: %.2f\tArea: %.2f\tPerimetro: %.2f", id, width, height, area(), perimeter());
    }
}
