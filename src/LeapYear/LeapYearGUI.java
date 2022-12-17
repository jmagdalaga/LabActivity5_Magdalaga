package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel panel1;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() {
        setTitle("Leap Year Checker");

        btnCheckYear.addActionListener((event) -> {

            try {
                int yr = Integer.parseInt(tfYear.getText());

                boolean LeapYearChecker = false;
                if (yr % 4 == 0) {
                    if (yr % 100 == 0) {
                        if (yr % 400 == 0) {
                            LeapYearChecker = true;
                        }
                    } else {
                        LeapYearChecker = true;
                    }
                }

                String message = LeapYearChecker ? "Leap year" : "Not a leap year";
                JOptionPane.showMessageDialog(null, message);
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid year", "Error", JOptionPane.ERROR_MESSAGE);
            }
        });
    }

    public static void main(String[] args){
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(new LeapYearGUI().panel1);
        app.setSize(300, 250);
        app.setVisible(true);
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
