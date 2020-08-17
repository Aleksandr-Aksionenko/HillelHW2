public class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(Point point1, Point point2, Point point3) {
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }

    public double lengthAB() {
        return Formulas.formulasLength(getPoint1(), getPoint2());
    }

    public double lengthBC() {
        return Formulas.formulasLength(getPoint2(), getPoint3());
    }

    public double lengthCA() {
        return Formulas.formulasLength(getPoint1(), getPoint3());
    }

    public double perimeter() {
        return (lengthAB() + lengthBC() + lengthCA());
    }

    public double area() {
        return Formulas.formulasTriangleAre(perimeter() / 2, lengthAB(), lengthBC(), lengthCA());
    }

    public boolean isIsoscelesTriangle() {
        return lengthAB() == lengthCA() || lengthBC() == lengthAB() || lengthBC() == lengthCA();
    }

    public boolean isRightTriangle() {
        return lengthAB() == (lengthCA() + lengthBC()) ||
                lengthCA() == (lengthAB() + lengthBC()) ||
                lengthBC() == (lengthAB() + lengthCA());
    }

    public boolean isEquilateralTriangle() {
        return lengthAB() == lengthCA() & lengthBC() == lengthAB() & lengthCA() == lengthBC();
    }

    public boolean isArbitrary() {
        return !isEquilateralTriangle() && !isIsoscelesTriangle() && !isRightTriangle();
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
}





