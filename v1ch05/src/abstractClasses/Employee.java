package abstractClasses;

import java.time.LocalDate;

/**
 * @author rongguang
 * @version V1.0
 * @Package abstractClasses
 * @date 2023/12/6 15:22
 */
public class Employee extends Person{
    private double salary;
    private LocalDate hireDay;

    public Employee(String name, double salary, int year, int month, int day)
    {
        super(name);
        this.salary = salary;
        hireDay = LocalDate.of(year, month, day);
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay;
    }

    public String getDescription(){
        return String.format("an employee with a salary of $%f", salary);
    }

    public void raiseSalary(double byPercent)
    {
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}
