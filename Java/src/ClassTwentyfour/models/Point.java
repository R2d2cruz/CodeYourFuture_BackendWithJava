package ClassTwentyfour.models;

public class Point {
    private int x;
    private int y;
    private int id;
    private static int n = 0;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
        id = n++;
    }

    public Point() {
        x = 0;
        y = 0;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getId() {
        return id;
    }

    public static double distancePoints(Point pointA, Point pointB) {
        return Math.sqrt(Math.pow(pointA.getX() - pointB.getX(), 2) + Math.pow(pointA.getY() - pointB.getY(), 2));
    }

    public static Point origin() {
        return new Point();
    }

    public static double slope(Point pointA, Point pointB) {
        return (double) (pointA.getY() - pointB.getY()) / (pointA.getX() - pointB.getX());
    }

    public static boolean areAlign(Point pointA, Point pointB, Point pointC) {
        if (pointA.getX() == pointB.getX()) {
            return pointB.getX() == pointC.getX();
        }
        if (pointC.getX() == pointB.getX() || pointC.getX() == pointA.getX()) {
            return pointB.getX() == pointA.getX();
        }
        return slope(pointA, pointB) == slope(pointB, pointC);
    }

    public double distanceToOrigin() {
        return distancePoints(this, origin());
    }

    public char getdraw() {
        return (char) ('0' + id);
    }

    @Override
    public String toString() {
        return String.format("Punto: %d\tx: %d\ty: %d\tDistancia al origen: %.2f", id, x, y, distanceToOrigin());
    }
}
