package pair3;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月29日 08:25:46
 * @packageName pair3
 * @className Manager
 */
public class Manager extends Employee {
    private double bonus;

    /**
     * @param name   the employee's name
     * @param salary the salary
     * @param year   the hire year
     * @param month  the hire month
     * @param day    the hire day
     */
    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
        double baseSalary = super.getSalary();
        return baseSalary + bonus;
    }

    public void setBonus(double b) {
        bonus = b;
    }

    public double getBonus() {
        return bonus;
    }
}
