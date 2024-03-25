package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;

/**
 * @author rongguang
 * @version V1.0
 * @Package objectAnalyzer
 * @date 2023/12/7 20:23
 */
public class EmployeeTest {
    public static void main(String[] args) {
        var harry = new Employee("Harry Hacker", 50000, 1989, 10, 1);

        Class cl = harry.getClass(); // the class object representing Employee

        try {
            Field f = cl.getDeclaredField("name");
                // the name field of the Employee class
                // f是一个Field对象，它表示Employee类中的name字段
            f.setAccessible(true); // now OK to call f.get(harry)

            try {
                Object v = f.get(harry);
                    // the value of the name field of the harry object, i.e.,
                    // the String object "Harry Hacker"
                    // harry 是某个包含name字段得Employee的对象
                    // f.get(harry) 将返回一个对象, 其值为harry.name的值
                System.out.println(v);
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
