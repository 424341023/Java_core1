package clone;


/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月26日 19:01:03
 * @packageName clone
 * @className CloneTest
 */
public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        var original = new Employee("John Q. Public", 50000);
        original.setHireDay(2000, 1, 1);
        Employee copy = original.clone();
        copy.raiseSalary(10);
        copy.setHireDay(2002, 12, 31);
        System.out.println("original=" + original);
        System.out.println("copy=" + copy);
    }
}
