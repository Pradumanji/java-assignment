
/*2) Write a java program using swing to create three buttons. On clicking the first
button it displays “Good Morning”, clicking the second button displays “Hello” and
clicking the third button displays “Welcome”. */
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class Assignment_10_question2 {
    JLabel jlab;

    Assignment_10_question2() {
        JFrame jfrm = new JFrame("An Event Example");
        jfrm.setLayout(new FlowLayout()); // Specify FlowLayout for the layout manager.
        jfrm.setSize(220, 90);
        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton jbtnFirst = new JButton("First");
        JButton jbtnSecond = new JButton("Second");
        JButton jbtnThird = new JButton("Third");

        jbtnFirst.addActionListener(new ActionListener() { // Add action listener for First.
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Good Morning.");
            }
        });
        jbtnSecond.addActionListener(new ActionListener() { // Add action listener for Second.
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Hello.");
            }
        });
        jbtnThird.addActionListener(new ActionListener() { // Add action listener for Beta.
            public void actionPerformed(ActionEvent ae) {
                jlab.setText("Welcome.");
            }
        });

        jfrm.add(jbtnFirst);
        jfrm.add(jbtnSecond);
        jfrm.add(jbtnThird);
        jlab = new JLabel("Press a button."); // Create a text-based label.

        jfrm.add(jlab);
        jfrm.setVisible(true);
    }

    public static void main(String args[]) {
        SwingUtilities.invokeLater(new Runnable() { // Create the frame on the event dispatching thread.
            public void run() {
                new Assignment_10_question2();
            }
        });
    }
}
