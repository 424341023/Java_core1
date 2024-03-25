import java.util.Scanner;

/**
 * @author rongguang
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2023/12/4 15:08
 */
public class InputTest {
    public static void main(String[] args) {
        System.out.printf("%1$s %2$tB %2$te %2$tY", "Due date:", new java.util.Date());
        System.out.println();
        System.out.printf("%s %tB %<te %<tY", "Due date:", new java.util.Date());
        System.out.println();

        String dir = System.getProperty("user.dir");
        System.out.println(dir);


//        Scanner in = new Scanner(System.in);
//
//        // get first input
//        System.out.println("What is your name?");
//        String name = in.nextLine();
//
//        // get second input
//        System.out.println("How old are you?");
//        int age =  in.nextInt();
//
//        // display output on console
//        System.out.println("Hello, " + name + "! You are " + age + " years old");
    }
}
