import java.util.*;
import javax.swing.*;

JFrame frame = new JFrame("Domi'Nations Version SMP");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frame.pack();
        frame.setSize(700,600);
        frame.setVisible(true);

JButtin b1 = new JButton();
        b1.setSize(400,400);
        b1.setVisible(true);
        b1.setText("Play");
        frame.add(b1);

        JButton b2 = new JButton();
        b2.setSize(400,400);
        b2.setVisible(true);
        b2.setText("Settings");
        frame.add(b2);

        JButton b3 = new JButton();
        b3.setSize(400,400);
        b3.setVisible(true);
        b3.setText("Quit");
        frame.add(b3);

        b3.addActionListener(new Listener());

private class Listener1 implements ActionListener
{
    public void action1(ActionEvent e)
    {
        JFrame frameQuit = new JFrame("Quit");
        frameQuit.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameQuit.getContentPane().add(yellowLabel, BorderLayout.CENTER);
        frameQuit.pack();
        frameQuit.setSize(500,500);
        frameQuit.setVisible(true);

        JButton y = new JButton();
        y.setSize(200,200);
        y.setVisible(true);
        y.setText("Yes");
        frameQuit.add(y);

        JButton n = new JButton();
        n.setSize(200,200);
        n.setVisible(true);
        n.setText("Yes");
        frameQuit.add(n);
        public class Listener2 implements ActionListener {
            public void action2(ActionEvent e) {
                
            }
        }
    }

}
