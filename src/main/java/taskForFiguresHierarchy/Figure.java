package taskForFiguresHierarchy;

public class Figure extends Shape {
    static Triangle triangle = new Triangle();
    static Rectangle rectangle = new Rectangle();

    @Override
    public void print(Object shape1, Object shape2, Object shape3) {
        Triangle triangle1 = (Triangle) shape1;
        Triangle triangle2 = (Triangle) shape2;
        Rectangle rectangle1 = (Rectangle) shape3;
        triangle.print(triangle1);
        rectangle.print(rectangle1);
        triangle.print(triangle2);
    }
}
