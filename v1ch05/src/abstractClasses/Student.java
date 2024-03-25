package abstractClasses;

/**
 * @author rongguang
 * @version V1.0
 * @Package abstractClasses
 * @date 2023/12/6 15:25
 */
public class Student extends Person{
    private String major;

    public Student(String name, String major){
        // pass name to superclass constructor
        super(name);
        this.major = major;
    }

    public String getDescription(){
        return "a student majoring in" + major;
    }
}
