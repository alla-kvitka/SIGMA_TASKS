package taskForFiguresHierarchy;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("rectangle","blue",
                "%",2,3,6);
        rectangle.print(rectangle);

        Triangle triangle = new Triangle("triangle","black","*",
                5,7,7,"regularLeft");
        triangle.print(triangle);

    }
}
