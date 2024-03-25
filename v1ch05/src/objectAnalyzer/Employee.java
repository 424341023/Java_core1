package objectAnalyzer;

import java.time.LocalDate;

/**
 * @author rongguang
 * @version V1.0
 * @Package objectAnalyzer
 * @date 2023/12/7 20:25
 */
public class Employee {
    private String name;
    private double salary;
    private LocalDate hireDay;

    public Employee(String n, double s, int year, int month, int day) {
        name = n;
        salary = s;
        hireDay = LocalDate.of(year, month, day);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getHireDay() {
        return hireDay; // BAD
    }


    public void raiseSalary(double byPercent){
        double raise = salary * byPercent / 100;
        salary += raise;
    }
}