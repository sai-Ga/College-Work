package gui3;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class TemperatureClient extends JFrame {
    private JTextField celsiusField, fahrenheitField;

    public TemperatureClient() {
        setTitle("Celsius to Fahrenheit Converter");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel celsiusLabel = new JLabel("Celsius:");
        celsiusLabel.setBounds(10, 20, 80, 25);
        add(celsiusLabel);

        celsiusField = new JTextField();
        celsiusField.setBounds(100, 20, 165, 25);
        add(celsiusField);

        JButton convertButton = new JButton("Convert");
        convertButton.setBounds(10, 60, 120, 25);
        add(convertButton);

        fahrenheitField = new JTextField();
        fahrenheitField.setBounds(10, 100, 255, 25);
        fahrenheitField.setEditable(false);
        add(fahrenheitField);

        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(celsiusField.getText());
                    TemperatureConverter service = (TemperatureConverter) Naming.lookup("rmi://localhost/TemperatureService");
                    double fahrenheit = service.celsiusToFahrenheit(celsius);
                    fahrenheitField.setText("Fahrenheit: " + fahrenheit);
                } catch (Exception ex) {
                    ex.printStackTrace();
                    fahrenheitField.setText("Error: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            TemperatureClient client = new TemperatureClient();
            client.setVisible(true);
        });
    }
}
