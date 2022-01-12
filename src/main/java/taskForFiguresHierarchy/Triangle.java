package taskForFiguresHierarchy;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Triangle extends Shape {
    private int height;
    private int weight;
    private String location;
    static private Point point = new Point();

    public Triangle(String nameOfFigure, String color, String symbol,
                    int shift, int height, int weight, String location) {
        super(nameOfFigure, color, symbol, shift);
        this.height = height;
        this.weight = weight;
        this.location = location;
    }

    @Override
    public void print(Object triangle1) {
        Triangle triangle = (Triangle) triangle1;
        if (triangle.location.equals("regularLeft")) {
            for (int i = 0; i <= triangle.getHeight(); i++) {
                point.printSpace(triangle.getShift());
                point.printDot(i, triangle.getSymbol());
                System.out.println();
            }
        }

        if (triangle.location.equals("regularRight")) {
            for (int i = triangle.getHeight(); i > 0; i--) {
                point.printSpace(triangle.getShift());
                point.printDot(i, triangle.getSymbol());
                System.out.println();
            }
        }

        if (triangle.location.equals("right")) {
            for (int i = triangle.getHeight(); i > 0; i--) {
                point.printSpace(triangle.getShift());
                point.printSpace(triangle.getHeight() - i);
                point.printDot(i, triangle.getSymbol());
                System.out.println();
            }
        }

        if (triangle.location.equals("left")) {
            for (int i = 1; i <= triangle.getHeight(); i++) {
                point.printSpace(triangle.getShift());
                point.printSpace(triangle.getHeight() - i);
                point.printDot(i, triangle.getSymbol());
                System.out.println();
            }
        }
    }
}



