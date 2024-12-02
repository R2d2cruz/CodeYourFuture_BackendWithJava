package ClassTwentythree;

public class Rectangle {
    private final int width;
    private final int height;
    private final int id;

    private static int countRectangle = 0;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
        id = countRectangle++;
    }

    public int getId() {
        return id;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public static int getCountRectangle() {
        return countRectangle;
    }

    public int area() {
        return width * height;
    }

    public int perimeter(){
        return 2 * (width + height);
    }

    public void printArea(){
        System.out.println("Area: " + area());
    }

    public void printPerimeter(){
        System.out.println("Perimetro: " + perimeter());
    }
    
    public void printMySelf(){
        System.out.printf("Rectangulo\tid: %d\tAlto: %d\tAncho: %d\n", id, height, width);
    }

    public void draw(){
        if (width == 1 || height == 1) {
            if (width != 1) {
                System.out.println("\u2550".repeat(width));
            } else if (height != 1) {
                System.out.print("\u2551\n".repeat(height));
            } else {
                System.out.println("\u25A1");
            } 
        } else {
            int auxWidht = width - 2;
            int auxhegith = height - 2;
            System.out.println("\u2554" + "\u2550".repeat(auxWidht) + "\u2557");
            for (int i = 0; i < auxhegith; i++) {
                System.out.println("\u2551" + " ".repeat(auxWidht) + "\u2551");
            }
            System.out.println("\u255A" + "\u2550".repeat(auxWidht) + "\u255D");
        }
    }
}
