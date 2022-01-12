package taskForFiguresHierarchy;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Point extends Shape{
    private  int count;
    private String symbol;

    protected void printDot(int count, String symbol) {
        for (int i = count; i >= 0; i--) {
            System.out.print(symbol);
        }
    }
    protected void printSpace(int count) {
        for (int i = 1; i <= count; i++) {
            System.out.print(" ");
        }
    }
}
