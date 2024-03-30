package treeSet;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月30日 13:14:00
 * @packageName treeSet
 * @className TreeSetTest
 */
public class TreeSetTest {
    public static void main(String[] args) {
        var parts = new TreeSet<Item>();
        parts.add(new Item("Toaster", 1234));
        parts.add(new Item("Widget", 4562));
        parts.add(new Item("Modem", 9912));
        System.out.println(parts);

        var sortByDescription = new TreeSet<Item>(Comparator.comparing(Item::getDescription));
        sortByDescription.addAll(parts);
        System.out.println(sortByDescription);
    }
}
