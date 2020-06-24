import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class App extends JFrame {
    private JTextField textField1;
    private JButton sectiButton;
    private JPanel appField;
    private JButton button1;
    private JTextField textField2;
    private JTextField textField3;
    private JComboBox comboBox1;


    public App() {
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.add(appField);
        this.setTitle("kalkulacka");
        this.setSize(600, 100);


        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String cislo1 = textField1.getText();
                String cislo2 = textField2.getText();
                int combo = comboBox1.getSelectedIndex();
                System.out.println(cislo1+" "+cislo2+" "+combo);
                textField3.setText(Double.toString(kal(cislo1, cislo2, combo)));

            }
        });
    }

    public static double kal(String c1, String c2, int operator) {
        double vysledek;
        try {
            double cs1 = Double.parseDouble(c1);
            double cs2 = Double.parseDouble(c2);

            switch (operator) {
                case 0:
                    vysledek = cs1 + cs2;
                    break;
                case 1:
                    vysledek = cs1 - cs2;
                    break;
                case 2:
                    vysledek = cs1 / cs2;
                    break;
                case 3:
                    vysledek = cs1 * cs2;
                    break;
                default:
                    vysledek = 0;
                    System.out.print("WTF");
            }
            return vysledek;

        } catch (Exception e) {
            System.out.print(e);
            return 0;
        }

    }


    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
