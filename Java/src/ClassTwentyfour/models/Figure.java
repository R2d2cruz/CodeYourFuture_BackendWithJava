package ClassTwentyfour.models;

public abstract class Figure {
    protected final int id;
    private static int n = 0;
    
    public Figure(){
        id = n++;
    }

    public abstract double area();
    
    public abstract double perimeter();

    public abstract String information();
}
