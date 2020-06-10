import javax.swing.JFrame;
import javax.swing.JPanel;


public class Conversions extends JPanel {

    public Conversions() {
        super();

    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversions Menu");
        Conversions conv = new Conversions();
        frame.add(conv);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
