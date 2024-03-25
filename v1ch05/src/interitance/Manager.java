package interitance;


/**
 * @author rongguang
 * @version V1.0
 * @Package interitance
 * @date 2023/12/6 14:27
 */
public class Manager extends Employee{
    private double bonus;

    /**
     *
     * @param name the employee's name
     * @param salary the salary
     * @param year the hire year
     * @param month the hire month
     * @param day the hire day
     */

    public Manager(String name, double salary, int year, int month, int day) {
        super(name, salary, year, month, day);
        bonus = 0;
    }

    public double getSalary() {
    double baseSalary = super.getSalary();
    return  baseSalary + bonus;
    }

    public void setBonus(double b){
        bonus = b;
    }
}