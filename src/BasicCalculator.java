import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator extends JPanel implements ActionListener {
    private JButton backToMenu;
    private JTextField display;
    private ButtonsPanel buttonsPanel;

    private int num1 = 0;
    private int num2 = 0;
    private boolean operationPressed = false; //if +,-,/,* was pressed

    public BasicCalculator() {
        super();
        this.setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        backToMenu = new JButton("Return to Calculator Menu");
//        backToMenu.setPreferredSize(new Dimension(400, 20));
        backToMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        backToMenu.addActionListener(this);

        display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(400, 200));

        buttonsPanel = new ButtonsPanel();

        this.add(backToMenu);
        this.add(display);
        this.add(buttonsPanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == backToMenu) {
            //replace current JPanel with the Menu Panel
            System.out.println("backToMenu button pressed");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Basic Calculator");
        BasicCalculator calc = new BasicCalculator();
        frame.add(calc);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
class ButtonsPanel extends JPanel implements ActionListener {
    private JButton zero;
    private JButton one;
    private JButton two;
    private JButton three;
    private JButton four;
    private JButton five;
    private JButton six;
    private JButton seven;
    private JButton eight;
    private JButton nine;
    private JButton point;

    private JButton plus;
    private JButton minus;
    private JButton times;
    private JButton divide;

    private JButton equals;
    private JButton clear;

    ButtonsPanel() {
        super(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        point = new JButton("\u2219");
        plus = new JButton("\u002B");
        minus = new JButton("\u002D");
        times = new JButton("\u00D7");
        divide = new JButton("\u00F7");
        equals = new JButton("\u003D");
        clear = new JButton("C");

        gbc.gridx = 0;
        gbc.gridy = 0;
        this.add(clear, gbc);
        gbc.gridx = 1;
        gbc.gridy = 0;
        this.add(divide, gbc);
        gbc.gridx = 2;
        gbc.gridy = 0;
        this.add(times, gbc);
        gbc.gridx = 3;
        gbc.gridy = 0;
        this.add(minus, gbc);
        gbc.gridx = 0;
        gbc.gridy = 1;
        this.add(seven, gbc);
        gbc.gridx = 1;
        gbc.gridy = 1;
        this.add(eight, gbc);
        gbc.gridx = 2;
        gbc.gridy = 1;
        this.add(nine, gbc);
        gbc.gridx = 0;
        gbc.gridy = 2;
        this.add(four, gbc);
        gbc.gridx = 1;
        gbc.gridy = 2;
        this.add(five, gbc);
        gbc.gridx = 2;
        gbc.gridy = 2;
        this.add(six, gbc);
        gbc.gridx = 0;
        gbc.gridy = 3;
        this.add(one, gbc);
        gbc.gridx = 1;
        gbc.gridy = 3;
        this.add(two, gbc);
        gbc.gridx = 2;
        gbc.gridy = 3;
        this.add(three, gbc);
        gbc.gridx = 0;
        gbc.gridy = 4;
        this.add(zero, gbc);
        gbc.gridx = 2;
        gbc.gridy = 4;
        this.add(point, gbc);
        gbc.gridx = 3;
        gbc.gridy = 1;
        this.add(plus, gbc);
        gbc.gridx = 3;
        gbc.gridy = 3;
        this.add(equals, gbc);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}