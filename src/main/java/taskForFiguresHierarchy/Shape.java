package taskForFiguresHierarchy;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Shape {
    private String nameOfFigure;
    private String color;
    private String symbol;
    private int shift;

    public Shape(String nameOfFigure, String color, String symbol, int shift) {
        this.nameOfFigure = nameOfFigure;
        this.color = color;
        this.symbol = symbol;
        this.shift = shift;
    }

    void print(Object shape) {
    }

    void print (Object shape1, Object shape2){
    }
    void print (Object shape1, Object shape2, Object shape3){
    }
}
