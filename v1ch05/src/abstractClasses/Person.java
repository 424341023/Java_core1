package abstractClasses;

/**
 * @author rongguang
 * @version V1.0
 * @Package abstractClasses
 * @date 2023/12/6 15:20
 */
public abstract class Person {
    public abstract String getDescription();
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
