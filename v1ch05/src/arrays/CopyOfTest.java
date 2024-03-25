package arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * @author rongguang
 * @version V1.0
 * @Package arrays
 * @date 2023/12/7 21:40
 */
public class CopyOfTest {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        // 整型数组类型int[] 可以转换成Object类型，但不能装换成对象数组
        a = (int[]) goodCopyOf(a, 10);
        System.out.println(Arrays.toString(a));

        String[] b = {"Tom", "Dick", "Harry"};
        b = (String[]) goodCopyOf(b, 10);
        System.out.println(Arrays.toString(b));

        System.out.println("The following call will generate an exception.");
        b = (String[]) badCopyOf(b, 10);

    }

    /**
     * This method attempts to grow an array by allacating a new array and copying all elements.
     * @param a the array to grow
     * @param newLength the new length
     * @return a larger array that contains all elements of a
     * However, the returned array has type Object[], not the same type as a
     */
    public static Object[] badCopyOf(Object[] a, int newLength){
        var newArray = new Object[newLength];
        System.arraycopy(a, 0, newArray, 0, Math.min(a.length, newLength));
        return newArray;
    }

    /**
     * This method grows an array by allocating a new array of the same type and copying all elements.
     * @param a the array to grow. This can be an object array or a primitive type array
     * @param newLength
     * @return a larger array that contains all elements of a
     */
    public static Object goodCopyOf(Object a, int newLength){
        Class cl = a.getClass();
        if (!cl.isArray())
            return null;
        Class componentType = cl.getComponentType();
        int length = Array.getLength(a);
        Object newArray = Array.newInstance(componentType, newLength);
        System.arraycopy(a, 0, newArray, 0, Math.min(length, newLength));
        return newArray;
    }
}
