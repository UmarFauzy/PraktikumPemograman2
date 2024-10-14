import javax.swing.*;
import java.awt.*;

public class BiodataForm extends JFrame {
    public BiodataForm() {
        setTitle("Form Biodata");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        
        // Panel untuk nama dan umur
        JPanel panel1 = new JPanel(new GridLayout(2, 2));
        panel1.add(new JLabel("Nama:"));
        JTextField nameField = new JTextField();
        panel1.add(nameField);
        panel1.add(new JLabel("Umur:"));
        JTextField ageField = new JTextField();
        panel1.add(ageField);

        // Panel untuk jenis kelamin
        JPanel panel2 = new JPanel(new FlowLayout());
        JLabel genderLabel = new JLabel("Jenis Kelamin:");
        JRadioButton maleButton = new JRadioButton("Laki-laki");
        JRadioButton femaleButton = new JRadioButton("Perempuan");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleButton);
        genderGroup.add(femaleButton);
        panel2.add(genderLabel);
        panel2.add(maleButton);
        panel2.add(femaleButton);

        // Panel untuk hobi
        JPanel panel3 = new JPanel(new FlowLayout());
        JLabel hobbyLabel = new JLabel("Hobi:");
        JCheckBox hobby1 = new JCheckBox("Membaca");
        JCheckBox hobby2 = new JCheckBox("Olahraga");
        JCheckBox hobby3 = new JCheckBox("Musik");
        panel3.add(hobbyLabel);
        panel3.add(hobby1);
        panel3.add(hobby2);
        panel3.add(hobby3);

        // Panel untuk tombol
        JPanel panel4 = new JPanel(new FlowLayout());
        JButton submitButton = new JButton("Kirim");
        JButton cancelButton = new JButton("Batal");
        panel4.add(submitButton);
        panel4.add(cancelButton);

        // Mengatur layout utama
        setLayout(new BorderLayout());
        add(panel1, BorderLayout.NORTH);
        add(panel2, BorderLayout.CENTER);
        add(panel3, BorderLayout.SOUTH);
        add(panel4, BorderLayout.PAGE_END);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BiodataForm form = new BiodataForm();
            form.setVisible(true);
        });
    }
}
