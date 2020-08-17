package processor;
import triangle.*;
public class Processor {
    private Triangle[] triangles;

    public Processor(Triangle[] triangles) {
        this.triangles = triangles;
    }

    public int countEquilateral() {
        return sortTriangles(new TriangleCheck() {
            @Override
            public boolean check(Triangle triangle) {
                return triangle.isEquilateralTriangle();
            }
        });
    }

    public int countIsoscelesTriangle() {
        return sortTriangles(new TriangleCheck() {
            @Override
            public boolean check(Triangle triangle) {
                return triangle.isIsoscelesTriangle();
            }
        });
    }

    public int countRightTriangle() {
        return sortTriangles(new TriangleCheck() {
            @Override
            public boolean check(Triangle triangle) {
                return triangle.isRightTriangle();
            }
        });
    }

    public int countArbitrary() {
        return sortTriangles(new TriangleCheck() {
            @Override
            public boolean check(Triangle triangle) {
                return triangle.isArbitrary();
            }
        });
    }

    public Triangle findBiggestIsoscelesByArea() {
        return getTriangleByParametersBiggest(
                new TriangleProperty() {
                    @Override
                    public double property(Triangle triangle) {
                        return triangle.area();
                    }
                },
                new TriangleCheck() {
                    @Override
                    public boolean check(Triangle triangle) {
                        return triangle.isIsoscelesTriangle();
                    }
                });
    }

    public Triangle findBiggestIsoscelesByAreaPerimeter() {
        return getTriangleByParametersBiggest(new TriangleProperty() {
                                                  @Override
                                                  public double property(Triangle triangle) {
                                                      return triangle.perimeter();
                                                  }
                                              },
                new TriangleCheck() {
                    @Override
                    public boolean check(Triangle triangle) {
                        return triangle.isIsoscelesTriangle();
                    }
                });
    }

    public Triangle findLeastIsoscelesByAreaPerimeter() {
        return getTriangleByParametersLeast(new TriangleProperty() {
                                                @Override
                                                public double property(Triangle triangle) {
                                                    return triangle.perimeter();
                                                }
                                            },
                new TriangleCheck() {
                    @Override
                    public boolean check(Triangle triangle) {
                        return triangle.isIsoscelesTriangle();
                    }
                });
    }


// ETS


    private Triangle getTriangleByParametersBiggest(TriangleProperty property, TriangleCheck check) {
        Triangle result = triangles[0];
        for (Triangle triangle : triangles) {
            if ((property.property(result) > property.property(triangle)) && check.check(triangle)) {
                result = triangle;
            }
        }
        return result;
    }

    private Triangle getTriangleByParametersLeast(TriangleProperty property, TriangleCheck check) {
        Triangle result = triangles[0];
        for (Triangle triangle : triangles) {
            if ((property.property(result) < property.property(triangle)) && check.check(triangle)) {
                result = triangle;
            }
        }
        return result;
    }

    private int sortTriangles(TriangleCheck function) {
        int count = 0;
        for (Triangle triangle : triangles) {
            if (function.check(triangle)) {
                count++;
            }
        }
        return count;
    }

}

