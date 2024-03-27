package innerClass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Instant;

/**
 * This program demonstrates how to declare inner classes in Java.
 *
 * @author rongguang
 * @version 1.0.0
 * @date 2024年03月26日 21:13:53
 * @packageName innerClass
 * @className InnerClassTest
 */
public class InnerClassTest {
    public static void main(String[] args) {
        var clock = new TalkingClock(1000, true);
        clock.start();

        // keep program running until user selects "OK"
        JOptionPane.showMessageDialog(null, "Quit program?");
        System.exit(0);
    }

}


/**
 * A clock that prints the time in regular intervals.
 */
class TalkingClock {
    private int interval;
    private boolean beep;

    public TalkingClock(int interval, boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    // start() 方法构造TimePrinter对象
    public void start() {
//        var listener = new TimePrinter();
        var listener = this.new TimePrinter();
        var timer = new Timer(interval, listener);
        timer.start();
    }


    /**
     * 这是一个公共内部类
     */
    public class TimePrinter implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {
            System.out.println("At the tone, the time is " + Instant.ofEpochMilli(event.getWhen()));

            // 调用私有属性
            // if (beep)
            if (TalkingClock.this.beep) {
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }

}

