package gui6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class GreatestNumberClient extends JFrame {
    private JTextField numberField1, numberField2, resultField;

    public GreatestNumberClient() {
        setTitle("Greatest of Two Numbers");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(4, 2));

        JLabel label1 = new JLabel("Enter first number:");
        JLabel label2 = new JLabel("Enter second number:");
        JLabel resultLabel = new JLabel("Greatest number:");

        numberField1 = new JTextField();
        numberField2 = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton calculateButton = new JButton("Find Greatest");
        
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(numberField1.getText());
                    int num2 = Integer.parseInt(numberField2.getText());
                    GreatestNumberService service = (GreatestNumberService) Naming.lookup("rmi://localhost/GreatestNumberService");
                    int greatest = service.findGreatest(num1, num2);
                    resultField.setText(String.valueOf(greatest));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: " + ex.getMessage());
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
            GreatestNumberClient client = new GreatestNumberClient();
            client.setVisible(true);
        });
    }
}
