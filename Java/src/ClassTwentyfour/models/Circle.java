package ClassTwentyfour.models;

public class Circle extends Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(){
        radius = 0;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    @Override
    public double area(){
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double perimeter(){
        return 2 * Math.PI * radius;
    }

    @Override
    public String toString(){
        return String.format("id: %d\tCirculo", id);
    }

    @Override
    public String information(){
        return String.format("Circulo:\nid: %d\tRadio: %.2f\tArea: %.2f\tPerimetro: %.2f", id, radius, area(), perimeter());
    }
}
