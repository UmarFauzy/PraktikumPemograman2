import java.awt.*;
import javax.swing.*;

public class HelloGridBagLayout extends JFrame {
    public HelloGridBagLayout() {
        setTitle("Hello GridBagLayout");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JButton("Button 1"), gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        add(new JButton("Button 2"), gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        add(new JButton("Button 3"), gbc);
    }

    public static void main(String[] args) {
        HelloGridBagLayout frame = new HelloGridBagLayout();
        frame.setVisible(true);
    }
}
