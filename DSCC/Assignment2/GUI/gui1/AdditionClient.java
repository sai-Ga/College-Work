package gui1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class AdditionClient extends JFrame {
    private JTextField num1Field, num2Field, resultField;

    public AdditionClient() {
        setTitle("RMI Addition Client");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel label1 = new JLabel("Number 1:");
        label1.setBounds(10, 20, 80, 25);
        add(label1);

        num1Field = new JTextField();
        num1Field.setBounds(100, 20, 165, 25);
        add(num1Field);

        JLabel label2 = new JLabel("Number 2:");
        label2.setBounds(10, 50, 80, 25);
        add(label2);

        num2Field = new JTextField();
        num2Field.setBounds(100, 50, 165, 25);
        add(num2Field);

        JButton addButton = new JButton("Add");
        addButton.setBounds(10, 80, 80, 25);
        add(addButton);
        
        resultField = new JTextField();
        resultField.setBounds(100, 110, 165, 25);
        resultField.setEditable(false);
        add(resultField);

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    AdditionService service = (AdditionService) Naming.lookup("rmi://localhost/AdditionService");
                    int num1 = Integer.parseInt(num1Field.getText());
                    int num2 = Integer.parseInt(num2Field.getText());
                    int result = service.add(num1, num2);
                    resultField.setText(String.valueOf(result));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    public static void main(String[] args) {
        AdditionClient client = new AdditionClient();
        client.setVisible(true);
    }
}
