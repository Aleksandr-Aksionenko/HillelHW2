public class Runner {

    public static void main(String[] args) {

        Triangle triangle1 = new Triangle(new Point(1, 1), new Point(2, 3), new Point(3, 3));
        Triangle triangle2 = new Triangle(new Point(1, 2), new Point(3, 2), new Point(5, 4));
        Triangle triangle3 = new Triangle(new Point(1, 2), new Point(6, 9), new Point(2, 4));
        Triangle triangle4 = new Triangle(new Point(1, 0), new Point(2, 4), new Point(0, 5));
        Triangle triangle5 = new Triangle(new Point(2, 3), new Point(6, 6), new Point(12, 2));

        Triangle[] triangles = new Triangle[]{triangle1, triangle2, triangle3, triangle4, triangle5};


        Processor processor = new Processor(triangles);

        System.out.println(processor.countArbitrary());
    }

}
