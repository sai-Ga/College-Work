package gui9;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GCDClient extends JFrame {
    private JTextField numberField1, numberField2, resultField;

    public GCDClient() {
        setTitle("GCD Calculator");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Enter first number:");
        JLabel label2 = new JLabel("Enter second number:");
        JLabel resultLabel = new JLabel("GCD:");

        numberField1 = new JTextField();
        numberField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Calculate GCD");
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numberField1.getText());
                    int num2 = Integer.parseInt(numberField2.getText());
                    GCDService service = 
                        (GCDService) Naming.lookup("rmi://localhost/GCDService");
                    int gcd = service.calculateGCD(num1, num2);
                    resultField.setText(String.valueOf(gcd));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: Invalid input");
                }
            }
        });

        add(label1);
        add(numberField1);
        add(label2);
        add(numberField2);
        add(calculateButton);
        add(resultLabel);
        add(resultField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            GCDClient client = new GCDClient();
            client.setVisible(true);
        });
    }
}
