import java.awt.*;
import javax.swing.*;

public class HelloFlowLayout extends JFrame {
    public HelloFlowLayout() {
        setTitle("Hello FlowLayout");
        setSize(400, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());
        add(new JButton("Button 1"));
        add(new JButton("Button 2"));
        add(new JButton("Button 3"));
        add(new JButton("Button 4"));
        add(new JButton("Button 5"));
    }

    public static void main(String[] args) {
        HelloFlowLayout frame = new HelloFlowLayout();
        frame.setVisible(true);
    }
}
