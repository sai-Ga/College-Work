package gui2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class FactorialClient extends JFrame {
    private JTextField inputField, resultField;

    public FactorialClient() {
        setTitle("Factorial Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel inputLabel = new JLabel("Enter a number:");
        inputLabel.setBounds(10, 20, 120, 25);
        add(inputLabel);

        inputField = new JTextField();
        inputField.setBounds(130, 20, 150, 25);
        add(inputField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.setBounds(10, 60, 120, 25);
        add(calculateButton);

        resultField = new JTextField();
        resultField.setBounds(10, 100, 270, 25);
        resultField.setEditable(false);
        add(resultField);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(inputField.getText());
                    FactorialService service = (FactorialService) Naming.lookup("rmi://localhost/FactorialService");
                    BigInteger result = service.factorial(number);
                    resultField.setText("Factorial: " + result.toString());
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FactorialClient client = new FactorialClient();
            client.setVisible(true);
        });
    }
}
