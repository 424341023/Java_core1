package map;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月30日 13:45:05
 * @packageName map
 * @className Employee
 */
public class Employee {
    private String name;
    private double salary;

    /**
     * Constructs an employee with $0 salary.
     *
     * @param n the employee name
     */
    public Employee(String name) {
        this.name = name;
        salary = 0;
    }

    public String toString() {
        return "[name=" + name + ", salary=" + salary + "]";
    }
}

