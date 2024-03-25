package abstractClasses;

/**
 * @author rongguang
 * @version V1.0
 * @Package abstractClasses
 * @date 2023/12/6 15:28
 */
public class PersonTest {
    public static void main(String[] args) {
        var people = new Person[2];

        // fill the people array with Student and Employee objects
        people[0] = new Employee("Harry Hacker", 50000, 1989, 10,1 );
        people[1] = new Student("Maria Morris", "computer science");

        // print out names and descriptions of all Person objects
        for(Person p: people)
            System.out.println(p.getName() + ", " + p.getDescription());
    }
}
