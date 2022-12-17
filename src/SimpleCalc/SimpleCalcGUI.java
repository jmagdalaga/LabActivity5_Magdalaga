package SimpleCalc;

import javax.swing.*;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame {
    private JPanel panel1;
    private JTextField tfNumber1;
    private JComboBox<String> cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber2;
    private JTextField lblResult;

    public SimpleCalcGUI() {
        setTitle("Simple Calculator");

        btnCompute.addActionListener((event) -> {
            try {
                double num1 = Double.parseDouble(tfNumber1.getText());
                double num2 = Double.parseDouble(tfNumber2.getText());
                String operation = (String) cbOperations.getSelectedItem();

                double result = 0;

                // Compute the result based on the chosen operator
                switch (Objects.requireNonNull(operation)) {
                    case "+" -> result = num1 + num2;
                    case "-" -> result = num1 - num2;
                    case "*" -> result = num1 * num2;
                    case "/" -> {
                        if (num2 == 0) {
                            throw new ArithmeticException("Divisor cannot be 0");
                        }
                        result = num1 / num2;
                    }
                }

                lblResult.setText(Double.toString(result));
            }catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(SimpleCalcGUI.this, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
            }catch (ArithmeticException ex){
                JOptionPane.showMessageDialog(SimpleCalcGUI.this, "Cannot Divide by Zero!", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }
    public static void main(String[] args) {
        SimpleCalcGUI calculator = new SimpleCalcGUI();
        calculator.setContentPane(new SimpleCalcGUI().panel1);
        calculator.setSize(600, 300);
        calculator.setVisible(true);
        calculator.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
