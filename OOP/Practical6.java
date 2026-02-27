import java.awt.FlowLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

/*
<applet code="DivApplet" width="350" height="300">
</applet>
*/

public class DivApplet extends JApplet implements ActionListener {

    private JTextField txtNumber1;
    private JTextField txtNumber2;
    private JTextField txtResult;
    private JButton btnDivide;

    @Override
    public void init() {
        try {
            SwingUtilities.invokeAndWait(new Runnable() {
                public void run() {
                    createGUI();
                }
            });
        } catch (Exception e) {
            System.out.println("GUI creation failed: " + e);
        }
    }

    private void createGUI() {

        setLayout(new FlowLayout());

        Label lblNumber1 = new Label("Number 1: ", Label.RIGHT);
        Label lblNumber2 = new Label("Number 2: ", Label.RIGHT);

        txtNumber1 = new JTextField(20);
        txtNumber2 = new JTextField(20);
        txtResult  = new JTextField(20);
        txtResult.setEditable(false);

        btnDivide = new JButton("Divide");

        add(lblNumber1);
        add(txtNumber1);
        add(lblNumber2);
        add(txtNumber2);
        add(txtResult);
        add(btnDivide);

        btnDivide.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String strNum1 = txtNumber1.getText();
        String strNum2 = txtNumber2.getText();

        try {
            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            if (num2 == 0) {
                JOptionPane.showMessageDialog(this,
                        "Division by zero is not allowed.");
            } else {
                double result = (double) num1 / num2;
                txtResult.setText(String.valueOf(result));
            }

        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,
                    "Please enter valid integers.");
        }
    }
}