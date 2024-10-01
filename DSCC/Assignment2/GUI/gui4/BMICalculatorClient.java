package gui4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class BMICalculatorClient extends JFrame {
    private JTextField weightField, heightField, resultField;

    public BMICalculatorClient() {
        setTitle("BMI Calculator");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel weightLabel = new JLabel("Weight (kg):");
        weightLabel.setBounds(10, 20, 100, 25);
        add(weightLabel);

        weightField = new JTextField();
        weightField.setBounds(120, 20, 150, 25);
        add(weightField);

        JLabel heightLabel = new JLabel("Height (m):");
        heightLabel.setBounds(10, 60, 100, 25);
        add(heightLabel);

        heightField = new JTextField();
        heightField.setBounds(120, 60, 150, 25);
        add(heightField);

        JButton calculateButton = new JButton("Calculate BMI");
        calculateButton.setBounds(10, 100, 150, 25);
        add(calculateButton);

        resultField = new JTextField();
        resultField.setBounds(10, 140, 260, 25);
        resultField.setEditable(false);
        add(resultField);

        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double weight = Double.parseDouble(weightField.getText());
                    double height = Double.parseDouble(heightField.getText());
                    BMICalculator service = (BMICalculator) Naming.lookup("rmi://localhost/BMICalculatorService");
                    double bmi = service.calculateBMI(weight, height);
                    resultField.setText("Your BMI: " + String.format("%.2f", bmi));
                } catch (Exception ex) {
                    ex.printStackTrace();
                    resultField.setText("Error: " + ex.getMessage());
                }
            }
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            BMICalculatorClient client = new BMICalculatorClient();
            client.setVisible(true);
        });
    }
}
