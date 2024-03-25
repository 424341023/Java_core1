package equals;

/**
 * @author rongguang
 * @version V1.0
 * @Package equals
 * @date 2023/12/6 17:07
 */
public class EqualsTest {
    public static void main(String[] args) {
        var alice1 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var alice2 = alice1;
        var alice3 = new Employee("Alice Adams", 75000, 1987, 12, 15);
        var bob = new Employee("Bob Branderson", 50000, 1989, 10, 1);

        System.out.println("alice1 == alice2: " + (alice1 == alice2));
        System.out.println("alice1 == alice3: " + (alice1 == alice3));
        System.out.println("alice1.equals(alice2): " + alice1.equals(alice2));
        System.out.println("alice1.equals(alice3): " + alice1.equals(alice3));
        System.out.println("alice1.equals(bob):" + (alice1.equals(bob)));

        System.out.println("bob.toString():" + bob);

        var car1 = new Manager("Car1 Cracker", 80000, 1987, 12, 15);
        var boss = new Manager("Car1 Cracker", 80000, 1987, 12, 15);
        boss.setBonus(5000);

        System.out.println("boss.toString():" + boss);
        System.out.println("car1.equals(boss):" + car1.equals(boss));

        System.out.println("alice1.hashCode():" + alice1.hashCode());
        System.out.println("alice3.hashCode():" + alice3.hashCode());
        System.out.println("bob.hashCode():" + bob.hashCode());
        System.out.println("car1.hashCode():" + car1.hashCode());


    }
}
