package lambda;

import javax.swing.*;
import java.util.Arrays;
import java.util.Date;

/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月26日 19:50:44
 * @packageName lambda
 * @className LambdaTest
 */
public class LambdaTest {
    public static void main(String[] args)
    {
        var planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune" };
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted in dictionary order:");
        Arrays.sort(planets);
        System.out.println(Arrays.toString(planets));
        System.out.println("Sorted by length:");
        Arrays.sort(planets, (first, second) -> first.length() - second.length());
        System.out.println(Arrays.toString(planets));

        var timer = new Timer(1000, event ->
                System.out.println("The time is " + new Date()));
        timer.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}
