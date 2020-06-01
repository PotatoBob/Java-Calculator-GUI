import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JPanel implements ActionListener {
    private JButton basicCalc;
    private JButton scientific;
    private JButton conversions;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        Menu menu = new Menu();
        frame.add(menu);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public Menu() {
        super(new BorderLayout());

        basicCalc = new JButton("4-Function");
        basicCalc.setSize(500, 500);
        basicCalc.addActionListener(this);

        scientific = new JButton("Scientific");
        scientific.setSize(500, 500);
        scientific.addActionListener(this);

        conversions = new JButton("Conversions");
        conversions.setSize(500, 500);
        conversions.addActionListener(this);

        add(basicCalc, BorderLayout.LINE_START);
        add(scientific, BorderLayout.CENTER);
        add(conversions, BorderLayout.LINE_END);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == basicCalc) {
            //replace Menu with BasicCalculator GUI
            System.out.println("basicCalc JButton Pressed");
        }
        if(e.getSource() == scientific) {
            //replace Menu with BasicCalculator GUI
            System.out.println("scientific JButton Pressed");
        }
        if(e.getSource() == conversions) {
            //replace Menu with BasicCalculator GUI
            System.out.println("conversions JButton Pressed");
        }
    }
}

class BasicCalculator extends JPanel {

}