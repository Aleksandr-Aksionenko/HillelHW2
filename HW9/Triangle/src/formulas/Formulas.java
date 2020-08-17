package formulas;
import point.Point;
public class Formulas {

    public static double formulasLength(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p1.getCoordinateX() - p2.getCoordinateX(), 2) +
                Math.pow(p1.getCoordinateY() - p2.getCoordinateY(), 2));
    }

    public static double formulasTriangleAre(double semiPerimeter, double lengthAB, double lengthBC, double lengthCA) {
        return Math.sqrt(semiPerimeter * ((semiPerimeter - lengthAB) * (semiPerimeter - lengthBC) * (semiPerimeter - lengthCA)));
    }

}