package timer;

import com.sun.source.doctree.ValueTree;

import java.awt.*;
import java.awt.event.*;
import java.time.*;
import java.util.Comparator;
import javax.swing.*;


/**
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月25日 21:12:40
 * @packageName timer
 * @className TimerTest
 */
public class TimerTest {
    public static void main(String[] args) {
        var listener = new TimePrinter();
        // construct a timer that calls the listener
        // once every second
        var timer = new Timer(1000, listener);
        timer.start();
        // keep program running until the user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }
}

class TimePrinter implements ActionListener{

    @Override
    public void actionPerformed(ActionEvent event) {
        System.out.println("At the tone, the time is"
        + Instant.ofEpochMilli((event.getWhen())));
        Toolkit.getDefaultToolkit().beep();
    }
}