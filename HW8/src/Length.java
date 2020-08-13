public class Length {
    Triangle triangle;

    public double lengthAB() {
        return Formulas.formulasLength(triangle.getPoint1(), triangle.getPoint2());
    }

    public double lengthBC() {
        return Formulas.formulasLength(triangle.getPoint2(), triangle.getPoint3());
    }

    public double lengthCA() {
        return Formulas.formulasLength(triangle.getPoint3(), triangle.getPoint1());
    }

    double perimeter() {
        return lengthAB() + lengthBC() + lengthCA();
    }
}
