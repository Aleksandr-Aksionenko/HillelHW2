public class Processor {

    public void setTriangleTypes(Triangle[] triangles) {

        TriangleType equilateralTriangleTypeProcessor = new EquilateralTriangle();
        TriangleType isoscelesTriangleTypeProcessor = new IsoscelesTriangle();
        TriangleType rectangularTriangleTypeProcessor = new RightTriangle();

        for (Triangle triangle : triangles) {
            if (equilateralTriangleTypeProcessor.triangleType(triangle)) {
                triangle.setType("Equilateral");
            } else if (isoscelesTriangleTypeProcessor.triangleType(triangle)) {
                triangle.setType("Isosceles");
            } else if (rectangularTriangleTypeProcessor.triangleType(triangle)) {
                triangle.setType("Right");
            }
        }
    }

    public Triangle countMinTriangle(Triangle[] triangles) {
        Triangle maxTriangle = countMaxTriangle(triangles);
        double minSquare = maxTriangle.area();
        double minPerimeter = maxTriangle.semiPerimeter();
        Triangle result = null;

        for (Triangle triangle : triangles) {
            if (triangle.area() <= minSquare && triangle.semiPerimeter() <= minPerimeter) {
                minSquare = triangle.area();
                minPerimeter = triangle.semiPerimeter();
                result = triangle;
            }
        }
        return result;
    }

    public Triangle countMaxTriangle(Triangle[] triangles) {
        double maxSquare = 0;
        double maxPerimeter = 0;
        Triangle result = null;
        for (Triangle triangle : triangles) {
            if (triangle.area() >= maxSquare && triangle.semiPerimeter() >= maxPerimeter) {
                maxSquare = triangle.area();
                maxPerimeter = triangle.semiPerimeter();
                result = triangle;
            }
        }
        return result;
    }
}

