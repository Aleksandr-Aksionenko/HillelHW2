public class Length {
    public double lengthAB() {
        return Formulas.formulasLength(getPoint1(), getPoint2());
    }

    public double lengthBC() {
        return Formulas.formulasLength(getPoint2(), getPoint3());
    }

    public double lengthCA() {
        return Formulas.formulasLength(getPoint3(), getPoint1());
    }

    double perimeter() {
        return lengthAB() + lengthBC() + lengthCA();
    }
}
