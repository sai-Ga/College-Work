package gui8;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ReverseNumberClient extends JFrame {
    private JTextField numberField, resultField;

    public ReverseNumberClient() {
        setTitle("Reverse Number");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Enter a number:");
        JLabel resultLabel = new JLabel("Reversed number:");

        numberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton reverseButton = new JButton("Reverse");
        
        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    ReverseNumberService service = 
                        (ReverseNumberService) Naming.lookup("rmi://localhost/ReverseNumberService");
                    int reversed = service.reverseNumber(number);
                    resultField.setText(String.valueOf(reversed));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: Invalid input");
                }
            }
        });

        add(numberLabel);
        add(numberField);
        add(reverseButton);
        add(resultLabel);
        add(resultField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            ReverseNumberClient client = new ReverseNumberClient();
            client.setVisible(true);
        });
    }
}
