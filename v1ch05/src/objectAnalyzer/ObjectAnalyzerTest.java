package objectAnalyzer;

import java.util.ArrayList;

/**
 * @author rongguang
 * @version V1.0
 * @Package objectAnalyzer
 * @date 2023/12/7 20:13
 */
public class ObjectAnalyzerTest {
    public static void main(String[] args) throws ReflectiveOperationException {
        var squares = new ArrayList<Integer>();
        for (int i = 1; i <= 5; i++)
            squares.add(i * i);
        System.out.println(new ObjectAnalyzer().toString(squares));
    }
}
