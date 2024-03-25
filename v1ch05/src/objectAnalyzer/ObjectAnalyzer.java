package objectAnalyzer;

import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;


/**
 * 利用反射机制可以查看在编译时无法确定的字段。
 * 一个勇于任意类的通用的toString方法，可以打印出对象的所有字段。
 * 该方法可以打印出对象的所有字段，包括私有的，并且可以打印出对象的字段类型。
 * @author rongguang
 * @version V1.0
 * @Package objectAnalyzer
 * @date 2023/12/7 19:58
 */
public class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj) throws ReflectiveOperationException {

        if (obj == null)
            return "null";
        // 它检查对象是否已经被访问过，如果是，则返回一个省略号字符串
        if (visited.contains(obj))
            return "...";
        visited.add(obj);

        Class cl = obj.getClass();  // "class.java.util.ArrayList"

        // 如果对象是字符串类型，直接返回对象的字符串表示
        if (cl == String.class)
            return (String) obj;
        // 如果对象是数组类型，遍历数组并打印数组元素
        if (cl.isArray()) {
            String r = cl.getComponentType() + "[]{";
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0)
                    r += ",";
                Object val = Array.get(obj, i);
                // 如果是基本数据类型，则直接进行字符串的拼接
                if (cl.getComponentType().isPrimitive())
                    r += val;
                // 否则，继续调用toString方法（递归）
                else r += toString(val);
            }
            return r + "}";
        }

        String r = cl.getName(); // "java.util.ArrayList"
        // inspect the fields of this class and all superclasses
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();
            AccessibleObject.setAccessible(fields, true);

            // get the names and values of all fields
            for (Field f : fields) {
                if (!Modifier.isStatic(f.getModifiers())) {
                    if (!r.endsWith("["))
                        r += ",";
                    r += f.getName() + "=";
                    Class t = f.getType();
                    Object val = f.get(obj);
                    if (t.isPrimitive())
                        r += val;
                    else
                        r += toString(val);
                }
            }
            r += "]";
            cl = cl.getSuperclass();
        }
        // null是Object类的超类
        while (cl != null);
        return r;
    }

}
