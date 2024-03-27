package proxy;

import clone.Employee;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.util.Random;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月27日 11:42:01
 * @packageName proxy
 * @className ProxyTest
 */
public class ProxyTest {
    public static void main(String[] args) {
        var elemnets = new Object[1000];

        // fill elements with proxies for the integers 1...1000
        for (int i = 0; i < elemnets.length; i++) {
            Integer value = i + 1;
            var handler = new TraceHandler(value);
            Object proxy = Proxy.newProxyInstance(
                    ClassLoader.getSystemClassLoader(), new Class[]{Comparable.class}, handler);
            elemnets[i] = proxy;
        }

        // construct a random integer
        Integer key = new Random().nextInt(elemnets.length) + 1;

        // search for the key
        int result = Arrays.binarySearch(elemnets, key);

        // print match if found
        if (result >= 0) System.out.println(elemnets[result]);
    }
}


class TraceHandler implements InvocationHandler {

    private Object target;

    public TraceHandler(Object t) {
        target = t;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        // print implicit argument
        System.out.print(target);
        // print method name
        System.out.print("."+ method.getName()+ "(");
        // print explicit arguments
        if (args != null) {
            for (int i = 0; i < args.length; i++) {
                System.out.print(args[i]);
                if (i < args.length - 1) System.out.print(",");
            }
        }

        System.out.println(")");

        // invoke actual method
        return method.invoke(target, args);
    }
}
