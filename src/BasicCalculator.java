import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.BoxLayout;

import java.awt.GridBagLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BasicCalculator extends JPanel implements ActionListener {
    private JButton backToMenu;
    private JTextField display;
    private JPanel buttonsPanel;

    public BasicCalculator() {
        super();
        setLayout(new BoxLayout(this, BoxLayout.PAGE_AXIS));

        backToMenu = new JButton("Return to Calculator Menu");
//        backToMenu.setPreferredSize(new Dimension(400, 20));
        backToMenu.setAlignmentX(Component.CENTER_ALIGNMENT);
        backToMenu.addActionListener(this);

        display = new JTextField();
        display.setEditable(false);
        display.setPreferredSize(new Dimension(400, 200));

        buttonsPanel = new JPanel();

        add(backToMenu);
        add(display);
        add(buttonsPanel);
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
