class EquilateralTriangle extends Length  implements TriangleType  {

    @Override
    public boolean triangleType(Triangle triangle) {
        return  lengthAB() ==  lengthCA() &  lengthBC() == lengthAB() &  lengthCA() == lengthBC();
    }

}
