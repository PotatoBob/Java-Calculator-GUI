import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;

import java.awt.CardLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import java.util.Map;
import static java.util.Map.entry;

public class Conversions extends JPanel implements ItemListener {
    private JPanel conversionWindow; //Secondary JPanel with most features. Only the unit chooser will be outside.
    private final String MASS = "mass/length";
    private final String LENGTH = "length/distance";
    /*
    * Add others here: volume, current, area, etc
    * */
    static final Map<String, Double> weight = Map.ofEntries(
            entry("kilograms", 1.0),
            entry("grams", 0.001),
            entry("milligrams", 1.0E-6),
            entry("newtons", 0.1019716),
            entry("tonnes (metric)", 1000.0),
            entry("daltons/atomic mass units", 1.66054E-27),
            entry("tons (short)", 907.185),
            entry("tons (long)", 1016.05),
            entry("pounds", 0.45359237),
            entry("ounces", 0.0283495),
            entry("stone", 6.35029),
            entry("slugs", 14.5939)
    );

    public Conversions() {
        super();
        String[] unitTypes = {MASS, LENGTH};
        JComboBox unitCB = new JComboBox(unitTypes);
        unitCB.setEditable(false);
        unitCB.addItemListener(this);
        this.add(unitCB);


        conversionWindow = new JPanel(new CardLayout());
        conversionWindow.add(new MassConversions(), MASS);


        this.add(conversionWindow);
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame("Conversions Menu");
        Conversions conv = new Conversions();
        frame.add(conv);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        CardLayout layout = (CardLayout) (conversionWindow.getLayout());
        layout.show(conversionWindow, (String) e.getItem());
//        System.out.println((String) e.getItem());
    }
}
class MassConversions extends JPanel implements ItemListener {
    static final Map<String, Double> LENGTHS = Map.ofEntries(
            entry("meters", 1.0),
            entry("kilometers", 1000.0),
            entry("millimeters", 0.001),
            entry("astronomical units", 1.496E+11),
            entry("light-years", 9.461E+15),
            entry("parsecs", 3.086E+16),
            entry("hubble lengths", 1.363E+26),
            entry("fermis", 1.0E-15),
            entry("\u00E5ngstr\u00F6m", 1.0E-10),
            entry("Bohr radii", 5.29177E-11),
            entry("Planck lengths", 1.6E-35),
            entry("inches", 0.0254),
            entry("feet", 0.3048),
            entry("yards", 0.9144),
            entry("furlongs", 201.168),
            entry("miles", 1609.34),
            entry("fathoms", 1.8288),
            entry("nautical miles", 1852.0),
            entry("chain", 20.1168),
            entry("rod/pole/perch", 5.0292)
    );
    public MassConversions() {
        super();
        this.add(new JTextField("Mass!"));
        String[] unitsNames = new String[MassConversions.LENGTHS.size()];
        MassConversions.LENGTHS.keySet().toArray(unitsNames);
        JComboBox massCB = new JComboBox(unitsNames);
        massCB.setEditable(false);
        massCB.addItemListener(this);
        this.add(massCB);
    }

    @Override
    public void itemStateChanged(ItemEvent e) {

    }
}