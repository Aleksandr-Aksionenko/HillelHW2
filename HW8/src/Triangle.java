public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;
    private String type;
    Length length;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }


    public double semiPerimeter() {
        return length.perimeter() / 2;
    }

    public double area() {
        return Formulas.formulasTriangleAre(semiPerimeter(), length.lengthAB(), length.lengthBC(), length.lengthCA());
    }

    public String getTriangleType() {
        return type;
    }

    public Point getPoint1() {
        return point1;
    }

    public Point getPoint2() {
        return point2;
    }

    public Point getPoint3() {
        return point3;
    }

    public void setType(String type) {
        this.type = type;
    }
}





