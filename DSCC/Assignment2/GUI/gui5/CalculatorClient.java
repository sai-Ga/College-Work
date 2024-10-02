package gui5;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.rmi.Naming;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class CalculatorClient extends JFrame implements ActionListener {
    String n1 = "", n2 = "", op = "";
    double x, y, result;
    boolean f = true, dotf, rf;
    ICalculator intf;
    GridBagConstraints gbc = new GridBagConstraints();
    JTextField txt1 = new JTextField(20);
    JButton btn[] = new JButton[16];
    String[] btnname = {"C", "1", "2", "3", "4", "5", "6", "-", "7", "8", "9", "*", "0", ".", "=", "/"};

    public CalculatorClient() {
        // Initialize RMI and interface here
        try {
            // Corrected URL for the RMI lookup
            intf = (ICalculator) Naming.lookup("//localhost:5060/CalculatorServer");
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(1);
        }

        Container con = this.getContentPane();
        con.setLayout(new GridBagLayout());
        gbc.weightx = 1.0;
        gbc.weighty = 1.0;

        for (int b = 0; b < btn.length; b++) {
            btn[b] = new JButton(btnname[b]);
            btn[b].addActionListener(this);
        }

        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        con.add(txt1, gbc);
        gbc.gridwidth = 1;
        gbc.gridx = 0;
        gbc.gridy = 1;
        con.add(btn[0], gbc); // Clear button

        int i = 1;
        for (int k = 2; k <= 5; k++) {
            for (int j = 0; j <= 3; j++) {
                gbc.gridx = j;
                gbc.gridy = k;
                if (i < btn.length) {
                    con.add(btn[i], gbc);
                    i++;
                }
            }
        }

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae) {
        String cmd = ae.getActionCommand();

        if (cmd.equals("C")) {
            txt1.setText("");
            n1 = n2 = op = "";
            x = y = result = 0;
            f = true;
            dotf = false;
            rf = false;
        } else if (cmd.equals("+") || cmd.equals("-") || cmd.equals("*") || cmd.equals("/")) {
            if (f) {
                n1 = txt1.getText();
                x = Double.parseDouble(n1);
                f = false;
                dotf = false;
                rf = false;
            }
            op = cmd;
            txt1.setText(""); // Clear for next input
        } else if (cmd.equals("=")) {
            n2 = txt1.getText();
            y = Double.parseDouble(n2);
            try {
                switch (op) {
                    case "+":
                        result = intf.add(x, y);
                        break;
                    case "-":
                        result = intf.sub(x, y);
                        break;
                    case "*":
                        result = intf.mul(x, y);
                        break;
                    case "/":
                        result = intf.div(x, y);
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            txt1.setText(Double.toString(result));
            f = true; // Reset for next operation
        } else if (cmd.equals(".")) {
            if (!dotf) {
                txt1.setText(txt1.getText() + cmd);
                dotf = true;
            }
        } else {
            if (!rf) {
                txt1.setText(txt1.getText() + cmd);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new CalculatorClient();
        });
    }
}
