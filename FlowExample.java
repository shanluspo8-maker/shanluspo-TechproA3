import javax.swing.*;
import java.awt.FlowLayout;

public class FlowExample {

    public static void main(String[] args) {

        JFrame frame = new JFrame("FlowLayout Example");
        frame.setSize(300, 200);

        frame.setLayout(new FlowLayout());

        frame.add(new JButton("Button 1"));
        frame.add(new JButton("Button 2"));
        frame.add(new JButton("Button 3"));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}