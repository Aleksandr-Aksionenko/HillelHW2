public class IsoscelesTriangle extends Length implements TriangleType {

    @Override
    public boolean triangleType(Triangle triangle) {
        return lengthAB() == lengthCA() || lengthBC() == lengthAB() || lengthBC() == lengthCA();
    }

}
