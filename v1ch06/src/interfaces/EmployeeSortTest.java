package interfaces;

import java.util.Arrays;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月25日 20:42:10
 * @packageName interfaces
 * @className EmployeeSortTest
 */
public class EmployeeSortTest {
    public static void main(String[] args) {
        var staff = new Employee[3];

        staff[0] = new Employee("Harry Hacker", 35000);
        staff[1] = new Employee("Carl Cracker", 75000);
        staff[2] = new Employee("Tony Tester", 38000);

        Arrays.sort(staff);

        // print out information about all Employee objects
        for (Employee e : staff)
            System.out.println("name=" + e.getName() + ",salary=" + e.getSalary());
    }
}

