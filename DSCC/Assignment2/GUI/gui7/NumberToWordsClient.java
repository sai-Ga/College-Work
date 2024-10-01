package gui7;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class NumberToWordsClient extends JFrame {
    private JTextField numberField, resultField;

    public NumberToWordsClient() {
        setTitle("Number to Words Converter");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        JLabel numberLabel = new JLabel("Enter a number:");
        JLabel resultLabel = new JLabel("In words:");

        numberField = new JTextField();
        resultField = new JTextField();
        resultField.setEditable(false);

        JButton convertButton = new JButton("Convert");
        
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    int number = Integer.parseInt(numberField.getText());
                    NumberToWordsService service = 
                        (NumberToWordsService) Naming.lookup("rmi://localhost/NumberToWordsService");
                    String words = service.convertNumberToWords(number);
                    resultField.setText(words);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: Invalid input");
                }
            }
        });

        add(numberLabel);
        add(numberField);
        add(convertButton);
        add(resultLabel);
        add(resultField);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NumberToWordsClient client = new NumberToWordsClient();
            client.setVisible(true);
        });
    }
}
