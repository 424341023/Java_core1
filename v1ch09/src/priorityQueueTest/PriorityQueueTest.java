package priorityQueueTest;

import java.time.LocalDate;
import java.util.PriorityQueue;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月30日 13:36:53
 * @packageName priorityQueueTest
 * @className PriorityQueueTest
 */
public class PriorityQueueTest {
    public static void main(String[] args) {
        var pq = new PriorityQueue<LocalDate>();
        pq.add(LocalDate.of(1906, 12, 9)); // G. Hopper
        pq.add(LocalDate.of(1815, 12, 10)); // A. Lovelace
        pq.add(LocalDate.of(1903, 12, 3)); // J. von Neumann
        pq.add(LocalDate.of(1910, 6, 22)); // K. Zuse

        System.out.println("Iterating over elements . . .");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("Removing elements . . .");
        while (!pq.isEmpty())
            System.out.println(pq.remove());

    }
}
