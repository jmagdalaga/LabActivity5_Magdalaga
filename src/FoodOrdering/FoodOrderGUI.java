package FoodOrdering;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel panel1;
    private JCheckBox cPizza;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;

    private static final double pizzaprice = 100;
    private static final double burgerprice = 80;
    private static final double friesprice = 65;
    private static final double softdrinksprice = 55;
    private static final double teaprice = 50;
    private static final double sundaeprice = 40;

    public FoodOrderGUI() {
        setTitle("Food Ordering System");

        btnOrder.addActionListener((event) -> {

                double total = 0;
                if (cPizza.isSelected())
                    total += pizzaprice;
                if (cBurger.isSelected())
                    total += burgerprice;
                if (cFries.isSelected())
                    total += friesprice;
                if (cSoftDrinks.isSelected())
                    total += softdrinksprice;
                if (cTea.isSelected())
                    total += teaprice;
                if (cSundae.isSelected())
                    total += sundaeprice;
                if (rb5.isSelected())
                    total -= total * 0.05;
                else if (rb10.isSelected())
                    total -= total * 0.1;
                else if (rb15.isSelected())
                    total -= total * 0.15;

            JOptionPane.showMessageDialog(panel1,"The total price is Php " + String.format("%.2f", total));
        });
    }
    public static void main(String[] args){
        FoodOrderGUI orderapp = new FoodOrderGUI();
        orderapp.setContentPane(new FoodOrderGUI().panel1);
        orderapp.setSize(600, 550);
        orderapp.setVisible(true);
        orderapp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
