class RightTriangle extends Length implements TriangleType {
    @Override
    public boolean triangleType(Triangle triangle) {
        return lengthAB() == (lengthCA() + lengthBC()) ||
                lengthCA() == (lengthAB() + lengthBC()) ||
                lengthBC() == (lengthAB() + lengthCA());
    }
}
