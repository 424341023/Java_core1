package linkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月29日 19:42:06
 * @packageName linkedList
 * @className LinkedListTest
 */
public class LinkedListTest {
    public static void main(String[] args) {
        var a = new LinkedList<String>();
        a.add("Amy");
        a.add("Carl");
        a.add("Erica");

        var b = new LinkedList<String>();
        b.add("Bob");
        b.add("Doug");
        b.add("Frances");
        b.add("Gloria");

        // merge the words from b into a
        ListIterator<String> alter = a.listIterator();
        Iterator<String> blter = b.iterator();

        while (blter.hasNext()) {
            if (alter.hasNext()) alter.next();
            alter.add(blter.next());
        }

        System.out.println(a);

        // remove every second word from b
        blter = b.iterator();
        while (blter.hasNext()) {
            blter.next(); // skip one element
            if (blter.hasNext()) {
                blter.next(); // skip next element
                blter.remove(); // remove that element
            }
        }
        System.out.println(b);

        // bulk operation; remove all words in b from a
        a.removeAll(b);
        System.out.println(a);
    }

}
