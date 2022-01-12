package taskForFiguresHierarchy;

public class DoubleTriangle extends Triangle {
    static Triangle triangle = new Triangle();

    @Override
    public void print(Object shape1, Object shape2) {
        Triangle triangle1 = (Triangle) shape1;
        Triangle triangle2 = (Triangle) shape2;
        triangle.print(triangle1);
        triangle.print(triangle2);
    }
}
