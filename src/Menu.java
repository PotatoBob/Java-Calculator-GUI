import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import java.awt.event.KeyEvent;

public class Menu extends JTabbedPane {

    public Menu() {
        super();
        BasicCalculator basicCalc = new BasicCalculator();
        this.addTab("Basic", basicCalc);
        this.setMnemonicAt(0, KeyEvent.VK_1);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        Menu menu = new Menu();
        frame.add(menu);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
