package taskForFiguresHierarchy;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class Rectangle extends Shape {
    private int height;
    private int weight;
    private int getIndentToTheRight;
    static private Point point = new Point();

    public Rectangle(String nameOfFigure, String color,
                     String symbol, int shift, int height, int weight) {
        super(nameOfFigure, color, symbol, shift);
        this.height = height;
        this.weight = weight;
    }

    @Override
    public void print(Object rectangle1) {
        Rectangle rectangle = (Rectangle) rectangle1;
        for (int i = 1; i <= rectangle.getHeight(); i++) {
            point.printSpace(rectangle.getShift());
            point.printDot(rectangle.getWeight(), rectangle.getSymbol());
            point.printSpace(rectangle.getHeight() - 1);
            System.out.println();
        }
    }
}
